package com.pautorrents.designpatterns.patterns.proxy.cache;

import com.pautorrents.designpatterns.helpers.IGenericCallback;

import java.util.HashMap;
import java.util.Map;

public class MemoryCache<T> {

    private Map<String, T> items = new HashMap<>();

    public T GetOrSet(String key, IGenericCallback<T> getAction) {
        T item = items.getOrDefault(key, null);
        if (item == null) {
            item = getAction.invoke();
            items.put(key, item);
        }

        return item;
    }
}
