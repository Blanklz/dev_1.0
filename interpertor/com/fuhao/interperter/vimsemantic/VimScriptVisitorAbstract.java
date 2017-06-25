package com.fuhao.interperter.vimsemantic;

import com.fuhao.interperter.vimscript.containers.ContainerFactory;
import com.fuhao.interperter.vimscript.containers.ContainerFactoryImpl;
import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.factorys.Factory;
import com.fuhao.interperter.vimscript.factorys.FactoryImpl;
import com.fuhao.interperter.vimscript.util.FunExcute;
import com.fuhao.interperter.vimscript.util.FunExcuteImpl;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YSI_PC on 2017/6/19.
 */
public class VimScriptVisitorAbstract extends VimScriptBaseVisitor<Data>{
    public ParseTreeProperty<Data> values = new ParseTreeProperty<>();
    Map<String,Data> a_map = new HashMap<>();
    boolean isStop;
    boolean isContinue;
    boolean isBreak;
    boolean isReturn;
    Data returnData;
    int i = 0;
    Factory factory = new FactoryImpl();
    FunExcute funExcute = new FunExcuteImpl();
    ContainerFactory containerFactory = new ContainerFactoryImpl();
    void setId(String id,Data data,boolean isCover){
        boolean b = id.startsWith(":",1);
        Map map = null;
        if (b){
            //获取范围
            String scope = id.substring(0,1);
            if (scope.equals("a"))
                map = a_map;
            else
                map = containerFactory.getContainer(scope);
            //去除范围、获取名字
            id = id.substring(2);
        }else {
            map = containerFactory.getContainer("g");
        }
        if (isCover)
            map.put(id,data);
        else{
            if (map.keySet().contains(id))
                System.out.println(id+"函数已存在 重新申明需要在'function'后加'!'进行覆盖标明");
            else
                map.put(id,data);
        }

    }
    void setValues(VimScriptParser.ExpressionContext ctx,Data data){
        try {

            setId(ctx.expression(0).primary().literal().IdLiteral().getText(),data,true);
        }catch (Exception e){

        }
    }
    Data getId(String id){
        boolean b = id.startsWith(":",1);
        Map map = null;
        if (b){
            String scope = id.substring(0,1);
            if (scope.equals("a")) {
                map = a_map;
            }else
                map = containerFactory.getContainer(scope);
            id = id.substring(2);
        }else {
            map = containerFactory.getContainer("g");
        }
        return (Data) map.get(id);
    }
    @Override public Data visitAllStatement(VimScriptParser.AllStatementContext ctx) {
        visitChildren(ctx);
        String[] a = {"g","s","b","w"};
      /*  System.out.println("变量输出");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]+" "+containerFactory.getContainer(a[j]));
        }
        System.out.println("变量结束");*/
        return null;
    }
    /**
     * 申明语句
     * */
    @Override public Data visitLet(VimScriptParser.LetContext ctx){
        try {
            //primary().
            String id = ctx.expression().expression(0).primary().literal().IdLiteral().getText();
            setId(id,factory.productString(""),true);
            visitChildren(ctx);
        }catch (Exception e){
        }
        return null;
    }
    @Override public Data visitExpression(VimScriptParser.ExpressionContext ctx) {

        if (ctx.primary()!=null) {
            visitChildren(ctx);
            values.put(ctx, values.get(ctx.primary()));
        }else if (ctx.arithmetic()!=null) {
            visitChildren(ctx);
            values.put(ctx, values.get(ctx.arithmetic()));
        }
//        else if (ctx.lo!=null){
//            visitChildren(ctx);
//            Data lhs = values.get(ctx.expression(0));
//            Data rhs = values.get(ctx.expression(1));
//            Data data = null;
//            boolean f = false;
//            switch (ctx.lo.getText()){
//                case "<"  :f = lhs.lessThan(rhs);   break;
//                case ">"  :f = lhs.bigThan(rhs);    break;
//                case "<=" :f = lhs.lessThanEq(rhs); break;
//                case ">=" :f = lhs.bigThanEq(rhs);  break;
//                case "==" :f = lhs.equals(rhs);     break;
//                case "!=" :f = !lhs.equals(rhs);    break;
//            }
//            if (f)
//                data = factory.productNumber(1);
//            else
//                data = factory.productNumber(0);
//            values.put(ctx,data);
//        }
        else if (ctx.op!=null){
            visitChildren(ctx);
            switch (ctx.op.getText()){
                case "=" :
                    setValues(ctx,values.get(ctx.expression(1)));
                    break;
                case "+=" :
                    setValues(ctx,values.get(ctx.expression(0)).add(values.get(ctx.expression(1))));
                    break;
                case "-=" :
                    setValues(ctx,values.get(ctx.expression(0)).sub(values.get(ctx.expression(1))));
                    break;
                case "*=" :
                    setValues(ctx,values.get(ctx.expression(0)).mul(values.get(ctx.expression(1))));
                    break;
                case "/=" :
                    setValues(ctx,values.get(ctx.expression(0)).div(values.get(ctx.expression(1))));
                    break;
                case "%=" :
                    setValues(ctx,values.get(ctx.expression(0)).mod(values.get(ctx.expression(1))));
                    break;
            }
        }else if (ctx.sign!=null){
            visitChildren(ctx);
            values.put(ctx,factory.productNumber(0).sub(values.get(ctx.expression(0))));
        }
        return null;
    }
    @Override public Data visitLogic(VimScriptParser.LogicContext ctx){
        visitChildren(ctx);
        Data lhs = values.get(ctx.arithmetic(0));
        Data rhs = values.get(ctx.arithmetic(1));
        Data data = null;
        boolean f = false;
        switch (ctx.op.getText()){
            case "<"  :f = lhs.lessThan(rhs);   break;
            case ">"  :f = lhs.bigThan(rhs);    break;
            case "<=" :f = lhs.lessThanEq(rhs); break;
            case ">=" :f = lhs.bigThanEq(rhs);  break;
            case "==" :f = lhs.equals(rhs);     break;
            case "!=" :f = !lhs.equals(rhs);    break;
        }
        if (f)
            data = factory.productNumber(1);
        else
            data = factory.productNumber(0);
        values.put(ctx,data);
        return null;
    }
    /**
     * if操作
     * */
    @Override public Data visitIfelse(VimScriptParser.IfelseContext ctx){
        visit(ctx.expression());
        Data data = values.get(ctx.expression());
        switch (values.get(ctx.expression()).toString()){
            case "0" :
                if (ctx.else_()!=null)
                    visit(ctx.else_());
                else if (ctx.elseif()!=null)
                    visit(ctx.elseif());
                break;
            case "1" :
                List<VimScriptParser.StatementsContext> list = ctx.statements();
                for (int j = 0; j < list.size() && !isBreak && !isContinue && !isReturn && !isStop; j++) {
                    visit(list.get(j));
                }
        }
        return null;
    }
    /**
     * else操作
     * */
    @Override public Data visitElse_(VimScriptParser.Else_Context ctx){
        List<VimScriptParser.StatementsContext> list = ctx.statements();
        for (int j = 0; j < list.size() && !isBreak && !isContinue && !isReturn && !isStop; j++) {
            visit(list.get(j));
        }
        return null;
    }
    /**
     *  while 循环
     * */
    @Override public Data visitWhile_(VimScriptParser.While_Context ctx){
        visit(ctx.expression());
        isContinue = false;
        isBreak = false;
        isReturn = false;
        List<VimScriptParser.StatementsContext> list = ctx.statements();
        while (!"0".equals(values.get(ctx.expression()).toString())&&!isBreak&&!isReturn){
            for (int j = 0; j < list.size(); j++) {

            }
        }
        isContinue = false;
        isBreak = false;
        isReturn = false;
        return null;
    }
    /**
     * elseif操作
     * */
    @Override public Data visitElseif(VimScriptParser.ElseifContext ctx){
        visit(ctx.expression());
        switch (values.get(ctx.expression()).toString()){
            case "0" :
                if (ctx.else_()!=null)
                    visit(ctx.else_());
                else if (ctx.elseif()!=null)
                    visit(ctx.elseif());
                break;
            case "1" :
                List<VimScriptParser.StatementsContext> list = ctx.statements();
                for (int j = 0; j < list.size() && !isBreak && !isContinue && !isReturn && !isStop; j++) {
                    visit(list.get(j));
                }
        }
        return null;
    }
    /**
     加减操作
     * */
    @Override public Data visitAddSub(VimScriptParser.AddSubContext ctx) {
        visitChildren(ctx);
        if(!isStop){
            Data lhs = values.get(ctx.arithmetic(0));
            Data rhs = values.get(ctx.arithmetic(1));
            Data data = null;
            if(ctx.op.getText().equals("+")){
                data = lhs.add(rhs);
            }else{
                data = lhs.sub(rhs);
            }
            values.put(ctx,data);
            return data;
        }
        return null;
    }
    /**
     乘除操作
     * */
    @Override public Data visitMulDiv(VimScriptParser.MulDivContext ctx) {
        visitChildren(ctx);
        if (!isStop) {
            Data lhs = values.get(ctx.arithmetic(0));
            Data rhs = values.get(ctx.arithmetic(1));
            Data data = null;
            if (ctx.op.getText().equals("*")) {
                data = lhs.mul(rhs);
            } else if (ctx.op.getText().equals("/")){
                data = lhs.div(rhs);
            } else {
                data = lhs.mod(rhs);
            }
            values.put(ctx, data);
            return data;
        }else
            return null;
    }
    /**
     * 获取算式括号的值
     * */
    @Override public Data visitArithmeticParen(VimScriptParser.ArithmeticParenContext ctx) {
        visitChildren(ctx);
        Data data =values.get(ctx.arithmetic());
        values.put(ctx,data);
        return data;
    }
    /**
     *
     * */
    @Override public Data visitPrimary(VimScriptParser.PrimaryContext ctx){
        visitChildren(ctx);

        Data data = null;
        if (ctx.literal()!=null)
            data = values.get(ctx.literal());
        else if (ctx.expression()!=null)
            data = values.get(ctx.expression());
        values.put(ctx,data);
        return data;
    }
    /**
     * 获取算式值
     * */
    @Override public Data visitArithmeticLiteral(VimScriptParser.ArithmeticLiteralContext ctx) {
        visitChildren(ctx);
        Data data = values.get(ctx.literal());
        values.put(ctx,data);
        return data;
    }
    /**
     * 获取数据类型
     * */
    @Override public Data visitLiteral(VimScriptParser.LiteralContext ctx) {
        Data data = visitChildren(ctx);
        if (ctx.FloatLiteral()!=null){
            data = factory.productFloat(ctx.FloatLiteral().getText());
        }else if (ctx.StringLiteral()!=null){
            data = factory.productString(ctx.StringLiteral().getText().substring(1,ctx.getText().length()-1));
        }else if (ctx.IntegerLiteral()!=null){
            data = factory.productNumber(ctx.IntegerLiteral().getText());
        }else if (ctx.IdLiteral()!=null) {
            data = getId(ctx.IdLiteral().getText());
        }
        values.put(ctx,data);
        return data;
    }
    /**
     * 生成list数据类型
     * */
    @Override public Data visitListLiteral(VimScriptParser.ListLiteralContext ctx) {
        visitChildren(ctx);
        Data data = factory.productList();
        List<VimScriptParser.LiteralContext> list = ctx.literal();
        for (int i = 0; i < list.size(); i++) {
            data.addIn(values.get(list.get(i)));
        }
        values.put(ctx,data);
        return data;
    }
    /**
     * 生成dictionary数据类型
     * */
    @Override public Data visitDictionaryLiteral(VimScriptParser.DictionaryLiteralContext ctx) {
        visitChildren(ctx);
        Data data = factory.productDictionary();
        //获得object中所有的key value
        List<VimScriptParser.KeyValueContext> list = ctx.keyValue();
        //遍历这些 key value
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).StringLiteral().getText();
            key = key.substring(1,key.length()-1);
            data.put(factory.productString(key),values.get(list.get(i).literal()));
        }
        values.put(ctx,data);
        return data;
    }
    /**
     * echo 输出
     * */
    @Override public Data visitEcho(VimScriptParser.EchoContext ctx){
        visitChildren(ctx);
        List<VimScriptParser.ExpressionContext> list = ctx.expression();
        if (list.size()!=0){
            String str = "";
            for (int j = 0; j < list.size(); j++) {
                str = str + values.get(list.get(j)).toString();
            }
            //echo 输出
            System.out.println(str);
        }
        return null;
    }
    /**
     * 申明自定义函数
     * */
    @Override public Data visitCreationFunction(VimScriptParser.CreationFunctionContext ctx){
        try {
//            String id = ctx.UserFunctionId().getText();
            String id = ctx.IdLiteral(0).getText();
            Data data = factory.proudctFuncref();
            data.setObject(ctx);
            setId(id,data,ctx.op.getText().endsWith("!"));
        }catch (Exception e){
        }
        return null;
    }
    /**
     * 调用函数
     * */
    @Override public Data visitCallFunction(VimScriptParser.CallFunctionContext ctx){
        visitChildren(ctx);
        Data data = null;
        String id = ctx.IdLiteral().getText();
        String one = id.substring(0,1);
        //小写开头 系统函数
        if(one.equals(one.toLowerCase())&&!id.startsWith(":",1)){
            visitChildren(ctx);
            List functionParameter = new ArrayList();
            List<VimScriptParser.ExpressionContext> list = ctx.expression();
            for (int j = 0; j < list.size(); j++) {
                functionParameter.add(values.get(list.get(j)).getObject());
            }
            Object[] o = functionParameter.toArray();
            data = funExcute.excuteFunction(id, o);
        }else{
            List<Data> functionParameter = new ArrayList();
            List<VimScriptParser.ExpressionContext> list = ctx.expression();
            for (int j = 0; j < list.size(); j++) {
                functionParameter.add(values.get(list.get(j)));
            }
            data = new VimScriptVisitorAbstract().walkFunction(id,functionParameter);
            isReturn = false;
            returnData = null;
        }
        return data;
    }

    Data walkFunction(String id,List<Data> functionParameter){
        Data data = getId(id);
        VimScriptParser.CreationFunctionContext ctx = (VimScriptParser.CreationFunctionContext) data.getObject();
        List<TerminalNode> list = ctx.IdLiteral();
        Map<String,Data> lv = new HashMap<>();
        if (list.size()-1!=functionParameter.size())
            System.out.println("调用"+id+"函数时参数数目不一致");
        else{
            for (int j = 0; j < functionParameter.size(); j++) {
                lv.put(list.get(j+1).getText(),functionParameter.get(j));
            }
        }
        List<VimScriptParser.StatementsContext> content = ctx.statements();
        for (int j = 0; j < content.size()&&!isReturn; j++) {
            a_map = lv;
            visit(content.get(j));
        }
        isReturn = true;
        return returnData;
    }
    @Override public Data visitReturn_(VimScriptParser.Return_Context ctx){
        visitChildren(ctx);
        if (ctx.expression()!=null){
            returnData = values.get(ctx.expression());
            isReturn = true;
        }
        return null;
    }

}
