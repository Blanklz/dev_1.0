package com.fuhao.interperter.vimscript.datatype;

import java.util.Iterator;

/**
 * Created by lz on 2017/5/16.
 */
public interface Data extends Caculate<Data>, ListData<Data>, DictionaryData<Data, Data>,Comparable<Data>{


    Object getObject();          //获得本类

    void setObject(Object object);

    String getText();            //获得字符

    void setText(String text);

    int size();                  //大小

    boolean isEmpty();           //判空

    boolean equals(Object data);

    int hashCode();

    String toString();

    Iterator iterator();

    void clear();
}
