package com.fuhao.interperter.vimscript.datatype;

/**
 * Created by lz on 2017/5/19.
 */
public interface Caculate<T> {

    T add(T data);

    T sub(T data);

    T mul(T data);

    T div(T data);

    T mod(T data);

    boolean lessThan(Data data);

    boolean bigThan(Data data);

    boolean lessThanEq(Data data);

    boolean bigThanEq(Data data);

    Data byPoint(Data key);          //通过.获取Data

}
