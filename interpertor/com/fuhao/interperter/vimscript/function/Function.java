package com.fuhao.interperter.vimscript.function;


import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.datatype.datatypeImpl.VimList;
import com.fuhao.interperter.vimscript.datatype.datatypeImpl.VimNumber;
import com.fuhao.interperter.vimscript.datatype.datatypeImpl.VimString;
import com.fuhao.interperter.vimscript.factorys.Factory;
import com.fuhao.interperter.vimscript.factorys.FactoryImpl;
import com.fuhao.interperter.vimscript.util.FunExcute;
import com.fuhao.interperter.vimscript.util.FunExcuteImpl;
import com.fuhao.interperter.vimscript.util.NumberUtil;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lz on 2017/6/13.
 */



public class Function {

    FunExcute fe = new FunExcuteImpl();

    Factory factory = new FactoryImpl();

    CommandInterface commandInterface;


    public Data type(Object data) {
        if (data instanceof Integer) {
            return judge(0);
        }
        if (data instanceof String) {
            return judge(1);
        }

        if (data instanceof List) {
            return judge(3);
        }
        if (data instanceof Map) {
            return judge(4);
        }
        if (data instanceof Float) {
            return judge(5);
        }
        return judge(2);
    }

    /**
     * 操作List
     *
     * @param list
     * @param index
     * @return
     */
    public Data get(List list, Integer index) {
        return get(list, index, 0);
    }

    public Data get(List list, Integer index, Integer o) {
        if (index >= list.size()) {
            return judge(o);
        } else {
            return (Data) list.get(index);
        }
    }

    public Data len(List list) {
        return judge(list.size());
    }

    public Data empty(List list) {
        return judge(list.isEmpty());
    }

    public void insert(List list, Object obj) {
        insert(list, obj, 0);
    }

    public void insert(List list, Object obj, Integer o) {
        list.add(o, judge(obj));
    }

    public void add(List list, Object object) {
       if(object instanceof List){
           Data a = factory.productList();
           a.setObject(object);
           list.add(a);
           return;
       }
       if(object instanceof  Map){
           Data a = factory.productDictionary();
           a.setObject(object);
           list.add(a);
       }
        list.add(judge(object));
    }

    public void extend(List list, List list2) {
        list.addAll(list2);
    }

    public void remove(List list, Integer index) {
        remove(list, index, index);
    }

    public void remove(List list, Integer index, Integer end) {
         for (int i = index; i <=end; i++) {
                list.remove(index.intValue());
     }
    }

    public Data call(String methodName, Object... args) {
        return fe.excuteFunction(methodName, args);
    }

    public Data copy(List list) {
        return judge(list);
    }

    /**
     * 未完成
     *
     * @param list
     * @param exgr
     */

    public Data filter(List list, String exgr) {

      exgr = exgr.replaceAll(" ","");
      List<Data> l = new ArrayList<>();
      Data e= factory.productList();
      Data va;
      Float a = null;
      Integer c =null ;

      if(exgr.contains(">=")){
            String value = exgr.substring(exgr.indexOf(">=")+2,exgr.length());
            if(value.contains(".")){
                a =Float.parseFloat(value);
                va = factory.productFloat(a);
            }else {
                c = Integer.parseInt(value);
                va=factory.productNumber(c);
            }
          for (int i = 0; i < list.size(); i++) {
                    Data q = (Data)list.get(i);
                    if(q.bigThanEq(va)){
                        l.add(q);
                    }
                }
        }

        if(exgr.contains("<=")){
            String value = exgr.substring(exgr.indexOf("<=")+2,exgr.length());
            if(value.contains(".")){
                a =Float.parseFloat(value);
                va = factory.productFloat(a);
            }else {
                c = Integer.parseInt(value);
                va=factory.productNumber(c);
            }
            for (int i = 0; i < list.size(); i++) {
                Data q = (Data)list.get(i);
                if(q.lessThanEq(va)){
                    l.add(q);
                }
            }
        }
        if(exgr.contains("<")){
            String value = exgr.substring(exgr.indexOf("<")+1,exgr.length());
            if(value.contains(".")){
                a =Float.parseFloat(value);
                va = factory.productFloat(a);
            }else {
                c = Integer.parseInt(value);
                va=factory.productNumber(c);
            }
            for (int i = 0; i < list.size(); i++) {
                Data q = (Data)list.get(i);
                if(q.lessThan(va)){
                    l.add(q);
                }
            }
        }
        if(exgr.contains(">")){
            String value = exgr.substring(exgr.indexOf(">")+2,exgr.length());
            if(value.contains(".")){
                a =Float.parseFloat(value);
                va = factory.productFloat(a);
            }else {
                c = Integer.parseInt(value);
                va=factory.productNumber(c);
            }
            for (int i = 0; i < list.size(); i++) {
                Data q = (Data)list.get(i);
                if(q.bigThan(va)){
                    l.add(q);
                }
            }
        }
        e.setObject(l);
        return e;
    }

    /**
     * @param list
     * @param str
     */
    public void map(List list, String str) {

    }

    public void sort(List list) {
        Collections.sort(list);
    }

    public void reverse(List list) {
        Collections.reverse(list);
    }

    public Data split(String text) {
        return split(text, " ");
    }

    public Data split(String string, String rex) {
        return judge(string.split(rex));
    }

    public Data join(List list) {
        StringBuffer s = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            s.append(o);
        }
        return judge(s.toString());
    }

    public Data range(Integer expr) {
        Data a =  factory.productList();
        for (int i = 0; i < expr; i++) {
           a.addIn(factory.productNumber(i));
        }
        return a;

    }

    public Data range(Integer expr, Integer arg1, Integer arg2) {
        Data a =  factory.productList();
        if (arg1 < expr) {
            for (int i = expr; i > arg1; i += arg2) {
                a.addIn(factory.productNumber(i));
            }
        } else {
            for (int i = expr; i < arg1; i += arg2) {
                a.addIn(factory.productNumber(i));
            }
        }
       return a;
    }

    public Data index(List list, Object obj) {
        Iterator it = list.iterator();
        Integer c =0;
        while (it.hasNext()) {
            Data a = (Data) it.next();
            if (a.getObject().equals(obj)) {
                return judge(c);
            }
            c++;
        }
        return judge(-1);
    }

    public Data max(List list) {
        Object data = null;
        Integer start=0;
        Integer e=0;
        int size = list.size();

        for(int i=0;i<size;i++){
            Data a = (Data) list.get(0);
            if(a instanceof VimString){
                String s = (String) a.getObject();
                Integer d = NumberUtil.getNumber(s);
                if(d!=null){
                    data=d;
                    start=i;
                }else{
                    continue;
                }
            }else{
                data = a.getObject();
                start  = i;
                break;
            }
        }

        for (int i = start+1; i < size; i++) {
                Data d = (Data) list.get(i);
                if(d instanceof  VimString){
                    String s = (String) d.getObject();
                    Integer c =NumberUtil.getNumber(s);
                    if(c==null){
                        continue;
                    }else{
                            if((Integer)data<c){
                                data=c;
                                e=i;
                                continue;
                            }
                    }
                }
                if(d instanceof  VimNumber) {
                    Integer c = (Integer) d.getObject();
                    if ((Integer) data < c) {
                        data = c;
                        e = i;
                    }
                }
            }

        return (Data) list.get(e);
    }

    public Data min(List list) {
        Data data = null;
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            Data d = (Data) list.get(i);
            Data c = (Data) list.get(i + 1);
            if (d.lessThan(c)) {
                data = d;
            } else {
                data = c;
            }
        }
        return data;
    }

    public Data count(List list, Object object) {
        Integer num = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Data a = (Data) list.get(i);
            if (a.getObject().equals(object))
                num++;
        }
        return judge(num);
    }

    /**
     * 操作Float
     *
     * @param arg
     * @return
     */
    public Data float2nr(Float arg) {
        return judge(arg.intValue());
    }

    public Data abs(Float arg) {
        return judge(Math.abs(arg));
    }

    public Data abs(Integer arg) {
        return judge(arg);
    }

    public Data round(Float arg) {
        return judge(new Float(Math.round(arg)));
    }

    public Data ceil(Float arg) {
        return judge(Math.ceil(arg));
    }

    public Data floor(Float arg) {
        return judge(Math.floor(arg));
    }

    public Data trunc(Float arg) {
        return floor(arg);
    }

    public Data log10(Float arg) {
        return judge(Math.log10(arg));
    }

    public Data pw(Float x, Float y) {
        return judge(Math.pow(x, y));
    }

    public Data sqrt(Float arg) {
        return judge(Math.sqrt(arg));
    }

    public Data sin(Float arg) {
        return judge(Math.sin(arg));
    }

    public Data cos(Float arg) {
        return judge(Math.cos(arg));
    }

    public Data atan(Float arg) {
        return judge(Math.atan(arg));
    }

    public Data atan2(Float arg, Float arg2) {
        return judge(Math.atan2(arg, arg2));
    }


    /**
     * 操作Map
     */

    public Data get(Map map, Object key) {
        return get(map, key, 0);
    }

    public Data get(Map map, Object key, Object o) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Data k = (Data) entry.getKey();
            if (k.getObject().equals(key)) {
                return k;
            }
        }
        return judge(o);
    }

    public Data len(Map map) {
        return judge(map.size());
    }

    public Data has_key(Map map, Object key) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Data k = (Data) entry.getKey();
            if (k.getObject().equals(key)) {
                return judge(1);
            }
        }
        return judge(0);
    }

    public Data empty(Map map) {
        if (map.isEmpty()) {
            return judge(1);
        } else {
            return judge(0);
        }
    }

    public Data remove(Map map, Object key) {
        Iterator it = map.entrySet().iterator();
        Data c = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Data k = (Data) entry.getKey();
            if (k.getObject().equals(key)) {
                c = k;
            }
        }
        return (Data) map.remove(c);

    }

    public Data extend(Map map, Map map2) {
        Map m = new HashMap();
        m.putAll(map);
        m.putAll(map2);
        Data a = factory.productDictionary();
        a.setObject(m);
        return a;
    }

    public Data keys(Map map) {
        List list = new ArrayList<Data>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            list.add(entry.getKey());
        }
        Data a = factory.productList();
        a.setObject(list);
        return a;
    }

    public Data values(Map map) {
        List list = new ArrayList<Data>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            list.add(entry.getValue());
        }
        Data a = factory.productList();
        a.setObject(list);
        return a;
    }

    public Data items(Map map) {
        List list = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            List li = new ArrayList(2);
            li.add(entry.getKey());
            li.add(entry.getValue());
            list.add(li);
        }
        Data a = factory.productList();
        a.setObject(list);
        return a;

    }

    /**
     * 操作String
     */
    public Data nr2char(Integer integer) {
        return judge(Character.toString((char) integer.intValue()));
    }

    public Data char2nr(String string) {
        return judge((int) string.charAt(0));
    }

    public Data str2nr(String string) {
        return str2nr(string, 10);
    }

    public Data str2nr(String string, Integer integer) {
        try {
            if(string.startsWith("0x")){
                string=string.substring(2);
            }
            return judge(Integer.valueOf(string, integer));
        } catch (Exception e) {
            return judge(0);
        }
    }

    public Data str2float(String string) {
        return judge(Float.parseFloat(string));
    }

    public Data printf(String str, Object... objects) {

        return judge(String.format(str,objects));
    }

    public Data escape(String str, String chars) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < chars.length(); i++) {
            sb.insert(sb.indexOf(chars.substring(i, i + 1)), "\\");
        }
        return judge(sb.toString());
    }

    /**
     * @param string
     * @return
     */
    public Data shellescape(String string) {
        return null;
    }

    /**
     * @param string
     * @return
     */
    public Data fnameescape(String string) {
        return null;
    }


    public Data tr(String str, String fromstr, String tostr) {

        return judge(str.replace(fromstr, tostr));
    }

    public Data tolower(String string) {
        return judge(string.toLowerCase());
    }

    public Data toupper(String string) {
        return judge(string.toUpperCase());
    }

    public Data match(String s, String p) {
        return judge(s.indexOf(p));
    }

    public Data matchend(String s, String p) {
        return judge(s.lastIndexOf(p) + p.length());
    }

    public Data matchstr(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            return judge("");
        } else {
            return judge(matcher.group());
        }
    }

    public Data matchlist(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            return new VimList();
        } else {
            Data a = new VimList();
            a.addIn(judge(matcher.group()));
            for (int i = 0; i < 9; i++) {
                a.addIn(factory.productString("\'\'"));
            }
            return a;
        }
    }

    public Data stridx(String s, String p) {
        return judge(s.indexOf(p));
    }

    public Data strridex(String s, String p) {
        return judge(s.lastIndexOf(p));
    }

    public Data strlen(String str) {
        return judge(str.length());
    }

    public Data substitute(String str, String s, String p, String flag) {
        return judge(str.replace(s, p));
    }

    public Data strpart(String str, Integer start, Integer len) {
        return judge(str.substring(start, len + 1));
    }


    //////////////////////
    public Data submatch() {
        return null;
    }
    //////////////////////


    public Data repat(String str, Integer a) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < a; i++) {
            s.append(str);
        }
        return judge(s.toString());
    }

    public Data string(Object object) {
        return judge(object.toString());
    }

    public Data eval(String string) {
        return (Data) evals(string.replaceAll(" ", ""));
    }


    //////////////////////
    public Data expand(String string) {
        return null;
    }
    //////////////////////


    public Data iconv(String str, String bm, String k) {
        byte[] bs = str.getBytes();

        try {
            return judge(new String(bs, k));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Data byteidx(String str, Integer nr) {
        str = str.substring(0, nr);
        return judge(str.getBytes().length);
    }

    public Data repeat(String expr, String count) {
        return null;
    }

    public Data getline(String str) {
        return judge(commandInterface.getline(str));
    }

    public Data getline(Integer start, Integer end) {
        return judge(commandInterface.getline(start, end));
    }

    public void setline(Integer i, List list) {
        //  commandInterface.setline(i,string);
    }

    public void setline(Integer i, String str) {
        commandInterface.setline(i, str);
    }

    public void append(Integer i, String string) {
        commandInterface.append(i, string);
    }

    public void append(Integer i, List string) {
        //    commandInterface.
    }

    public Data indent(Integer num) {
        return judge(commandInterface.indent(num));
    }

    public Data search(String rex) {
        return judge(commandInterface.search(rex));
    }

    public Data col(String string) {
        return judge(commandInterface.col(string));
    }

    public Data col(List list) {
        return null;
    }

    public Data line(String string) {
        return judge(commandInterface.line(string));
    }

    public Data getpos(String s) {
        return judge(commandInterface.getpos(s));
    }

    public void setpos(String string, List list) {

    }

    private Object evals(String a) {

        Data data = null;

        if (a.startsWith("{") && a.endsWith("}")) {
            data = factory.productDictionary();
            a = a.substring(1, a.length() - 1);
            String[] strings = a.split(",");
            for (int i = 0; i < strings.length; i++) {
                String[] m = strings[i].split(":");
                data.put(eval(m[0]), eval(m[1]));
            }
            return data;
        }
        if (a.startsWith("[") && a.endsWith("]")) {
            data = factory.productList();
            a = a.substring(1, a.length() - 1);
            String[] strings = a.split(",");
            for (int i = 0; i < strings.length; i++) {
                data.addIn(eval(strings[i]));
            }
            return data;
        }
        if (a.startsWith("\"") && a.endsWith("\"") || a.startsWith("\'") && a.endsWith("\'")) {
            data = factory.productString("'" + a.substring(1, a.length() - 1) + "'");
            return data;
        }

        if (a.contains(".")) {
            data = factory.productFloat(Float.parseFloat(a));
            return data;
        }
        data = factory.productNumber(Integer.parseInt(a));
        return data;
    }

    private Data judge(Object result) {

        Data data = null;

        if (result instanceof Integer) {
            data = factory.productNumber((Integer) result);
            return data;
        }
        if (result instanceof Float) {
            data = factory.productFloat((Float) result);
            return data;
        }

        if (result instanceof Double) {
            data = factory.productFloat(((Double) result).floatValue());
            return data;
        }
        if (result instanceof String) {
            data = factory.productString((String) result);
            return data;
        }
        if (result instanceof Boolean) {
            if ((Boolean) result) {
                data = factory.productNumber(1);
            } else {
                data = factory.productNumber(0);
            }
            return data;
        }

        if (result instanceof Map) {
            data = factory.productDictionary();
            Map map = (Map) result;
            Iterator it = map.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                data.put(judge(key), judge(value));
            }
            return data;
        }

        if (result instanceof List) {

            data = factory.productList();
            List list = (List) result;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                data.addIn(judge(list.get(i)));
            }
            return data;

        }
        return data;
    }
}
