package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerV extends HashMap<String,Data> {
    private static ContainerV containerG;

    private ContainerV(){

    }

    public static ContainerV getInstance(){
        if(containerG==null){
            containerG=new ContainerV();
        }
        return containerG;
    }
}
