package com.fuhao.interperter.vimscript.containers;

import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;

/**
 * Created by lz on 2017/6/19.
 */
public class ContainerG extends HashMap<String,Data> {
    private  static ContainerG containerG;

    private ContainerG(){

    }

    public static ContainerG getInstance(){
        if(containerG==null){
            containerG=new ContainerG();
        }
        return containerG;
    }
}
