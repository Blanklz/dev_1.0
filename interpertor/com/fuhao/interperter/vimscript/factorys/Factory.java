package com.fuhao.interperter.vimscript.factorys;


import com.fuhao.interperter.vimscript.datatype.Data;

/**
 * Created by lz on 2017/6/13.
 */
public interface Factory {

    Data productFloat(String text);

    Data productNumber(String text);

    Data productString(String text);

    Data productFloat(Float text);

    Data productNumber(Integer text);

    Data productList();

    Data productDictionary();

    Data proudctFuncref();

}
