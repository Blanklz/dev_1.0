package com.fuhao.interperter.vimscript.containers;

import java.util.Map;

/**
 * Created by lz on 2017/6/20.
 */
public interface ContainerFactory {
    Map getContainer(String text);
}
