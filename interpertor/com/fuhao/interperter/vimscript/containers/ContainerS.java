package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerS extends HashMap<String,Data> {
    private static ContainerS containerG;

    private ContainerS(){

    }

    public static ContainerS getInstance(){
        if(containerG==null){
            containerG=new ContainerS();
        }
        return containerG;
    }
}
