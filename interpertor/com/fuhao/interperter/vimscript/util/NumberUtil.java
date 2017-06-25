package com.fuhao.interperter.vimscript.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lz on 2017/6/13.
 */
public class NumberUtil {

    private static Pattern pattern;

    private static Matcher isNum;


    public static Integer getNumber(String text) {
        pattern = Pattern.compile("^(-?[0-9]+)");

        isNum = pattern.matcher(text);

        while (isNum.find()) {
            String s = isNum.group();
            return Integer.parseInt(s);
        }
        return null;
    }
}
