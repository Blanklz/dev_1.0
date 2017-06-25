package com.fuhao.interperter.vimscript.containers;

import java.util.Map;

/**
 * Created by lz on 2017/6/20.
 */
public class ContainerFactoryImpl implements ContainerFactory {

    private Map b = ContainerB.getInstance();

    private Map g = ContainerG.getInstance();

    private Map i = ContainerI.getInstance();

    private Map s = ContainerS.getInstance();;

    private Map v = ContainerV.getInstance();

    private Map w = ContainerW.getInstance();

    @Override
    public Map getContainer(String text) {
        switch (text){
            case "b":
                    return b;
            case "g":
                return g;
            case "i":
                return i;
            case "s":
                return s;
            case "v":
                return v;
            case "w":
                return w;
        }
        return null;
    }
}
