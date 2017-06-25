package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerI extends HashMap<String,Data> {
    private static ContainerI containerG;

    private ContainerI(){

    }

    public static ContainerI getInstance(){
        if(containerG==null){
            containerG=new ContainerI();
        }
        return containerG;
    }
}
