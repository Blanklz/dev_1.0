package com.fuhao.interperter.vimscript.datatype.datatypeImpl;



import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lz on 2017/6/13.
 */
public class VimFuncref implements Data {

    private Object object;

    private String text;

    @Override
    public Data add(Data data) {
        return null;
    }

    @Override
    public Data sub(Data data) {
        return null;
    }

    @Override
    public Data mul(Data data) {
        return null;
    }

    @Override
    public Data div(Data data) {
        return null;
    }

    @Override
    public Data mod(Data data) {
        return null;
    }

    @Override
    public boolean lessThan(Data data) {
        return false;
    }

    @Override
    public boolean bigThan(Data data) {
        return false;
    }

    @Override
    public boolean lessThanEq(Data data) {
        return false;
    }

    @Override
    public boolean bigThanEq(Data data) {
        return false;
    }

    @Override
    public Data byPoint(Data key) {
        return null;
    }

//    @Override
//    public Data byPoint(String key) {
//        return null;
//    }

    @Override
    public boolean addIn(Data data) {
        return false;
    }

    @Override
    public Data get(int index) {
        return null;
    }

    @Override
    public void set(int index, Data data) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(Data data) {
        return 0;
    }

    @Override
    public int lastIndexOf(Data data) {
        return 0;
    }

    @Override
    public Data put(Data key, Data value) {
        return null;
    }

    @Override
    public Data get(Data key) {
        return null;
    }

    @Override
    public void remove(Data key) {

    }

    @Override
    public boolean containsKey(Data key) {
        return false;
    }

    @Override
    public boolean containsValue(Data data) {
        return false;
    }

    @Override
    public List<Data> getKeys() {
        return null;
    }

    @Override
    public void putAll(Data data) {

    }

    @Override
    public Object getObject() {
        return this.object;
    }

    @Override
    public void setObject(Object object) {
        this.object=object;
        setText(object.toString());
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text=text;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void clear() {
        this.object=null;
        this.text=null;
    }

    public boolean equals(Object object) {
        return this.getObject().equals(((Data)object).getObject());
    }

    @Override
    public int compareTo(Data o) {
        return 0;
    }
}
