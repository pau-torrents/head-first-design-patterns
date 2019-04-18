package com.pautorrents.designpatterns.patterns.bridge.pattern.views;

import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.IMediaResource;

public abstract class View {
    private IMediaResource resource;

    protected View(IMediaResource resource) {
        this.resource = resource;
    }

    public abstract String show();

    protected IMediaResource getResource() { return this.resource; }
}
