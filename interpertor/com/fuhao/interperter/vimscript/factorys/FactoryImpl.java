package com.fuhao.interperter.vimscript.factorys;


import com.fuhao.interperter.vimscript.datatype.Data;
import com.fuhao.interperter.vimscript.datatype.datatypeImpl.*;

/**
 * Created by lz on 2017/6/13.
 */
public class FactoryImpl implements Factory {
    @Override
    public Data productFloat(String text) {
        Data a = new VimFloat();
        a.setObject(Float.parseFloat(text));
        return a;
    }

    @Override
    public Data productNumber(String text) {
        Data a = new VimNumber();
        a.setObject(Integer.parseInt(text));
        return a;
    }

    @Override
    public Data productString(String text) {
        Data a = new VimString();
        a.setObject(text);
        return a;
    }

    @Override
    public Data productFloat(Float text) {
        Data a = new VimFloat();
        a.setObject(text);
        return a;
    }

    @Override
    public Data productNumber(Integer text) {
        Data a = new VimNumber();
        a.setObject(text);
        return a;
    }

    @Override
    public Data productList() {
        return new VimList();
    }

    @Override
    public Data productDictionary() {
        return new VimDictionary();
    }

    @Override
    public Data proudctFuncref() {
        return new VimFuncref();
    }
}
