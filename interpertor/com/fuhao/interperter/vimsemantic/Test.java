package com.fuhao.interperter.vimsemantic;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 * Created by YSI_PC on 2017/6/19.
 */
public class Test {
    public static void main(String[] args) {
        String str = "";
        String fileName = "interpertor/test.txt";
        Reader reader = null;
        try {
            File file = new File(fileName);
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                str += (char)tempchar;
            }
            reader.close();
            System.out.println(str);
            VimScriptLexer lexer = new VimScriptLexer(
                    new ANTLRInputStream(str)
            );
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            //语法分析
            VimScriptParser parser = new VimScriptParser(tokens);
            ParseTree tree = parser.allStatement();
            new VimScriptVisitorAbstract().visit(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
