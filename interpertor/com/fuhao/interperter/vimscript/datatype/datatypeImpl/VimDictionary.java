package com.fuhao.interperter.vimscript.datatype.datatypeImpl;



import com.fuhao.interperter.vimscript.datatype.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * Created by lz on 2017/6/13.
 */
public class VimDictionary implements Data {

    private Map<Data, Data> object;

    private String text;

    public VimDictionary() {
        object = new HashMap<>();
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
    public Data byPoint(Data data) {

        return null;
    }

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
        return object.put(key, value);
    }

    @Override
    public Data get(Data key) {
        return object.get(key);
    }

    @Override
    public void remove(Data key) {
        object.remove(key);
    }

    @Override
    public boolean containsKey(Data key) {
        return object.containsKey(key);
    }

    @Override
    public boolean containsValue(Data data) {
        return object.containsValue(data);
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
        this.object= (Map<Data, Data>) object;
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
        return object.entrySet().iterator();
    }

    @Override
    public void clear() {
        this.object=null;
        this.text=null;
    }

    public boolean equals(Object object) {
        return this.getObject().equals(((Data)object).getObject());
    }

    public String toString() {
        String string = "{";
        for (Iterator it = iterator(); it.hasNext(); ) {
            Map.Entry e = (Map.Entry) it.next();
            string += "\"" + e.getKey() + "\":";
            string += e.getValue().toString() + ",";
        }
        string = string.substring(0, string.length() - 1);
        string += "}";
        return string;
    }

    @Override
    public int compareTo(Data o) {
        return 0;
    }
}
