package com.fuhao.interperter.vimscript.datatype.datatypeImpl;


import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.util.NumberUtil;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lz on 2017/6/13.
 */
public class VimString implements Data {

    private Object object;

    private String text;

    @Override
    public Data add(Data data) {

        if (data instanceof VimFloat || data instanceof VimNumber) {
            return data.add(this);
        }
        if (data instanceof VimString) {
            Data newData = new VimNumber();
            newData.setObject(0);
            return newData;
        }

        return null;
    }

    @Override
    public Data sub(Data data) {
        Data newData = new VimNumber();

        if (data instanceof VimString) {

            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    newData.setObject(j - i);
                } else {
                    newData.setObject(j);
                }
            } else {
                if (i != null) {
                    newData.setObject(-i);
                } else {
                    newData.setObject(0);
                }
            }
            return newData;
        }
        if (data instanceof VimNumber) {
            Integer i;
            i = NumberUtil.getNumber(this.valueOf());
            if (i != null) {
                newData.setObject(i - (Integer) data.getObject());
            } else {
                newData.setObject(-(Integer) data.getObject());
            }
            return newData;
        }
        if (data instanceof VimFloat) {
            Data data1 = new VimFloat();
            Integer i;
            i = NumberUtil.getNumber(this.valueOf());
            if (i != null) {
                data1.setObject(i - (Float) data.getObject());
            } else {
                data1.setObject(-(Float) data.getObject());
            }
            return data1;
        }
        return null;
    }

    @Override
    public Data mul(Data data) {
        Data newData = new VimNumber();

        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    newData.setObject(j * i);
                } else {
                    newData.setObject(0);
                }
            } else {
                newData.setObject(0);
            }
            return newData;
        }
        if (data instanceof VimNumber || data instanceof VimFloat) {

            return data.mul(this);
        }
        return null;
    }

    @Override
    public Data div(Data data) {
        Data newData = new VimNumber();

        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    newData.setObject(j / i);
                } else {
                    newData.setObject(Long.parseLong("9223372036854775807"));
                }
            } else {
                if (i != null) {
                    newData.setObject(0);
                } else {
                    newData.setObject(Long.parseLong("-9223372036854775807"));
                }
            }
            return newData;
        }
        if (data instanceof VimNumber) {
            Integer i;
            i = NumberUtil.getNumber(this.valueOf());
            if (i != null) {
                newData.setObject(i / (Integer) data.getObject());
            } else {
                newData.setObject(0);
            }
            return newData;
        }
        if (data instanceof VimFloat) {
            Data data1 = new VimFloat();
            Integer i;
            i = NumberUtil.getNumber(this.valueOf());
            if (i != null) {
                data1.setObject(i / (Float) data.getObject());
            } else {
                data1.setObject(0.0);
            }
            return data1;
        }
        return null;
    }

    @Override
    public Data mod(Data data) {
        Integer i = NumberUtil.getNumber(this.valueOf());
        if(i==null){
            Data c =  new VimNumber();
            c.setObject(0);
            return c;

        }
        if(data instanceof VimString){
            Integer j =NumberUtil.getNumber((String) data.getObject());
            Data c =  new VimNumber();
            if(j!=null){
                    c.setObject(i%j);
            }else{
                     c.setObject(0);

            }
            return c;
        }
        if(data instanceof VimNumber){
            Integer j = (Integer) data.getObject();
            Data c = new VimNumber();
            c.setObject(i%j);
            return c;
        }

        return null;
    }

    @Override
    public boolean lessThan(Data data) {
        if (data instanceof VimNumber || data instanceof VimFloat) {
            return data.bigThan(this);
        }
        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    return i < j;
                } else {
                    return true;
                }
            }else{
                if(i!=null){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean bigThan(Data data) {
        if (data instanceof VimNumber || data instanceof VimFloat) {
            return data.lessThan(this);
        }
        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    return i > j;
                } else {
                    return false;
                }
            }else{
                if(i!=null){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    @Override
    public boolean lessThanEq(Data data) {
        if (data instanceof VimNumber || data instanceof VimFloat) {
            return data.bigThanEq(this);
        }
        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    return i <= j;
                } else {
                    return true;
                }
            }else{
                if(i!=null){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean bigThanEq(Data data) {
        if (data instanceof VimNumber || data instanceof VimFloat) {
            return data.lessThanEq(this);
        }
        if (data instanceof VimString) {
            Integer i, j;
            i = NumberUtil.getNumber((String) data.getObject());
            j = NumberUtil.getNumber(this.valueOf());
            if (j != null) {
                if (i != null) {
                    return i >= j;
                } else {
                    return false;
                }
            }else{
                if(i!=null){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }


    @Override
    public Data byPoint(Data key) {
        if(key instanceof VimNumber||key instanceof VimString){
            Data a = new VimString();
            a.setText(this.getText()+key.getText());
            a.setObject(this.getText()+key.getText());
            return a;
        }
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

    private String valueOf() {
        return (String) this.getObject();
    }

    public String toString() {
        return this.getObject().toString();
    }

    public boolean equals(Object object) {
        return this.getObject().equals(((Data)object).getObject());
    }

    @Override
    public int compareTo(Data o) {
        if(this.bigThan(o)){
            return 1;
        }
        if(this.lessThan(o)){
            return -1;
        }
        return 0;
    }
}
