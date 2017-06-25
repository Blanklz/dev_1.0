package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerB extends HashMap<String,Data> {

    private static ContainerB containerB;

    private ContainerB(){

    }

    public static ContainerB getInstance(){
        if(containerB==null){
            containerB=new ContainerB();
        }
        return containerB;
    }
}
