package com.fuhao.interperter.vimscript.util;




import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.function.Function;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lz on 2017/6/14.
 */
public class FunExcuteImpl implements FunExcute {

    private Class clazz = Function.class;

    @Override
    public Data excuteFunction(String methodName, Object... args) {

        Object result = null;           //返回的结果

        Method method = null;

        Class<?>[] parmeters = null;

        Method[] methods = clazz.getMethods();

        Class<?>[] clazzs = new Class[args.length];


        for (int i = 0; i < args.length; i++) {
            clazzs[i] = args[i].getClass();
        }
        for (Method s : methods) {
            if (s != null) {
                Class[] getParams = s.getParameterTypes();
                String mname=s.getName();
                int paramsLength = getParams.length;
                Boolean flags = true;

                if(mname.equals("printf")&&mname.equals(methodName)||mname.equals("call")&&mname.equals(methodName)){
                    method=s;
                    break;
                }
                if (mname.equals(methodName) && paramsLength == args.length) {
                    for (int i = 0; i < paramsLength; i++) {
                        if(getParams[i].getName().equals("java.util.List")){
                            if(!clazzs[i].getName().equals("java.util.ArrayList")){
                                flags=false;
                                break;
                            }else{
                                break;
                            }
                        }
                        if(getParams[i].getName().equals("java.util.Map")){
                            if(!clazzs[i].getName().equals("java.util.HashMap")){
                                flags=false;
                                break;
                            }else{
                                break;
                            }
                        }
                        if (!getParams[i].getName().equals(clazzs[i].getName())) {
                            flags = false;
                            break;
                        }
                    }
                    if (flags) {
                        method = s;
                    }
                }
            }
        }

        try {
           result = method.invoke(clazz.newInstance(), args);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (Data) result;
    }
}
