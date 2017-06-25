package com.fuhao.interperter.vimscript.datatype.datatypeImpl;



import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lz on 2017/6/13.s
 */
public class VimList implements Data {

    private List<Data> object;

    private String text;

    public VimList() {
        object = new ArrayList();
    }

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

    @Override
    public boolean addIn(Data data) {
        return object.add(data);
    }

    @Override
    public Data get(int index) {
        return object.get(index);
    }

    @Override
    public void set(int index, Data data) {
        object.set(index, data);
    }

    @Override
    public void remove(int index) {
        object.remove(index);
    }

    @Override
    public int indexOf(Data data) {
        return object.indexOf(data);
    }

    @Override
    public int lastIndexOf(Data data) {
        return object.lastIndexOf(data);
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
        object.addAll((List)data.getObject());
    }

    @Override
    public Object getObject() {
        return this.object;
    }

    @Override
    public void setObject(Object object) {
        this.object= (List<Data>) object;
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
        return object.size();
    }

    @Override
    public boolean isEmpty() {
        return object.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return object.iterator();
    }

    @Override
    public void clear() {
        this.object=null;
        this.text=null;
    }

    public String toString() {
        return this.getObject().toString();
    }

    public boolean equals(Object object) {
        return this.getObject().equals(((Data)object).getObject());
    }

    @Override
    public int compareTo(Data o) {
        return 0;
    }
}
