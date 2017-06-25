package com.fuhao.interperter.vimscript.datatype;

/**
 * Created by lz on 2017/5/19.
 */
public interface ListData<T> {

    boolean addIn(T data);

    T get(int index);

    void set(int index, T data);

    void remove(int index);

    int indexOf(T data);

    int lastIndexOf(T data);

}
