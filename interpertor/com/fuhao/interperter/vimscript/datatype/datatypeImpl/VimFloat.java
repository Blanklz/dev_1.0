package com.fuhao.interperter.vimscript.datatype.datatypeImpl;



import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.util.NumberUtil;


import java.util.Iterator;
import java.util.List;

/**
 * Created by lz on 2017/6/13.
 */

public class VimFloat implements Data {

    private Object object;

    private String text;

    @Override
    public Data add(Data data) {
        Data newData = new VimFloat();

        if (data instanceof VimNumber) {
            newData.setObject(this.valueOf() + (Integer) data.getObject());
            return newData;
        }
        if (data instanceof VimString) {
            Integer j;
            if ((j = NumberUtil.getNumber((String) data.getObject())) != null) {
                newData.setObject(this.valueOf() + j);
            } else {
                newData.setObject(this.valueOf());
            }
            return newData;
        }
        if (data instanceof VimFloat) {
            newData.setObject(this.valueOf() + (Float) data.getObject());
            return newData;
        }
        return null;
    }

    @Override
    public Data sub(Data data) {
        Data newData = new VimFloat();

        if (data instanceof VimFloat) {
            newData.setObject(this.valueOf() - (Float) data.getObject());
            return newData;
        }
        if (data instanceof VimString) {
            Integer i;

            if ((i = NumberUtil.getNumber((String) data.getObject())) != null) {
                newData.setObject(this.valueOf() - i);
            } else {
                newData.setObject(this.valueOf());
            }
            return newData;
        }
        if (data instanceof VimNumber) {

            newData.setObject(this.valueOf() - (Integer) data.getObject());

            return newData;
        }
        return null;
    }

    @Override
    public Data mul(Data data) {

        Data newData = new VimFloat();

        if (data instanceof VimFloat) {
            newData.setObject(this.valueOf() * (Float) data.getObject());
            return newData;
        }
        if (data instanceof VimString) {
            newData =new VimNumber();
            Integer i;
            if ((i = NumberUtil.getNumber((String) data.getObject())) != null) {
                newData.setObject(this.valueOf() * i);
            } else {
                newData.setObject(0.0);
            }
            return newData;
        }
        if (data instanceof VimNumber) {
            newData.setObject(this.valueOf() * (Integer) data.getObject());
            return newData;
        }
        return null;
    }

    @Override
    public Data div(Data data) {
        Data newData = new VimFloat();

        if (data instanceof VimFloat) {
            newData.setObject(this.valueOf() / (Float) data.getObject());
            return newData;
        }
        if (data instanceof VimString) {
            newData = new VimNumber();
            Integer i;
            if ((i = NumberUtil.getNumber((String) data.getObject())) != null) {
                newData.setObject(this.valueOf() / i);
            } else {
                newData.setObject("inf");
            }
            return newData;
        }
        if (data instanceof VimNumber) {

            newData.setObject(this.valueOf() / (Integer) data.getObject());

            return newData;
        }
        return null;
    }

    @Override
    public Data mod(Data data) {
        return null;
    }

    @Override
    public boolean lessThan(Data data) {

        if (data instanceof VimFloat) {
            if (data.getObject().equals("inf")) {
                return !this.getObject().equals("inf");
            } else {
                if (this.getObject().equals("inf")) {
                    return false;
                } else {
                    return this.valueOf() < (Float) data.getObject();
                }
            }
        }
        if (data instanceof VimString) {
            return this.valueOf() < NumberUtil.getNumber((String) data.getObject());
        }
        if (data instanceof VimNumber) {
            return this.valueOf() < (Integer) data.getObject();
        }
        return false;
    }

    @Override
    public boolean bigThan(Data data) {
        if (data instanceof VimFloat) {
            if (data.getObject().equals("inf")) {
                if (this.getObject().equals("inf")) {
                    return false;
                } else {
                    return false;
                }
            } else {
                if (this.getObject().equals("inf")) {
                    return true;
                } else {
                    return this.valueOf() > (Float) data.getObject();
                }
            }
        }
        if (data instanceof VimString) {
            return this.valueOf() > NumberUtil.getNumber((String) data.getObject());
        }
        if (data instanceof VimNumber) {
            return this.valueOf() > (Integer) data.getObject();
        }
        return false;

    }

    @Override
    public boolean lessThanEq(Data data) {
        if (data instanceof VimFloat) {
            if (data.getObject().equals("inf")) {
                if (this.getObject().equals("inf")) {
                    return true;
                } else {
                    return true;
                }
            } else {
                if (this.getObject().equals("inf")) {
                    return false;
                } else {
                    return this.valueOf() <= (Float) data.getObject();
                }
            }
        }
        if (data instanceof VimString) {
            return this.valueOf() <= NumberUtil.getNumber((String) data.getObject());
        }
        if (data instanceof VimNumber) {
            return this.valueOf() <= (Integer) data.getObject();
        }
        return false;
    }

    @Override
    public boolean bigThanEq(Data data) {
        if (data instanceof VimFloat) {
            if (data.getObject().equals("inf")) {
                return this.getObject().equals("inf");
            } else {
                if (this.getObject().equals("inf")) {
                    return true;
                } else {
                    return this.valueOf() > (Float) data.getObject();
                }
            }
        }
        if (data instanceof VimString) {
            return this.valueOf() >= NumberUtil.getNumber((String) data.getObject());
        }
        if (data instanceof VimNumber) {
            return this.valueOf() >= (Integer) data.getObject();
        }
        return false;
    }

    @Override
    public Data byPoint(Data key) {
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

    private Float valueOf() {
        return (Float) this.getObject();
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
