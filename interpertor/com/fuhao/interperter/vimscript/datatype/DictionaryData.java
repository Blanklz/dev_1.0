package com.fuhao.interperter.vimscript.datatype;

import java.util.List;
import java.util.Map;

/**
 * Created by lz on 2017/5/19.
 */
public interface DictionaryData<K, V> {
    V put(K key, V value);

    V get(K key);

    void remove(K key);

    boolean containsKey(K key);

    boolean containsValue(V v);

    List<K> getKeys();

    void putAll(Data data);

}
