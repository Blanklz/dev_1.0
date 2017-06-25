package com.fuhao.interperter.vimscript.util;


import com.fuhao.interperter.vimscript.datatype.Data;

/**
 * Created by lz on 2017/6/14.
 */
public interface FunExcute {
    Data excuteFunction(String name, Object... objects);
}
