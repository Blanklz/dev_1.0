package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerW extends HashMap<String,Data> {
    private static ContainerW containerG;

    private ContainerW(){

    }

    public static ContainerW getInstance(){
        if(containerG==null){
            containerG=new ContainerW();
        }
        return containerG;
    }
}
