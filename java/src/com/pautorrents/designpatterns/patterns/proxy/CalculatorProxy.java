package com.pautorrents.designpatterns.patterns.proxy;

import com.pautorrents.designpatterns.patterns.proxy.cache.MemoryCache;
import com.pautorrents.designpatterns.patterns.proxy.services.Calculator;
import com.pautorrents.designpatterns.patterns.proxy.services.ICalculator;

public class CalculatorProxy implements ICalculator {

    private Calculator calculator = new Calculator();

    private MemoryCache<Double> addMemoryCache = new MemoryCache<>();
    private MemoryCache<Double> subMemoryCache = new MemoryCache<>();

    @Override
    public double add(double a, double b) {
        String cacheKey = this.getCacheKey(a, b);
        return this.addMemoryCache.GetOrSet(cacheKey, () -> calculator.add(a, b));
    }

    @Override
    public double sub(double a, double b) {
        String cacheKey = this.getCacheKey(a, b);
        return this.subMemoryCache.GetOrSet(cacheKey, () -> calculator.sub(a, b));
    }

    private String getCacheKey(double a, double b) {
        return String.valueOf(a) + '_' + b;
    }
}
