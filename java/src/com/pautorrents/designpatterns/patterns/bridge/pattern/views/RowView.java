package com.pautorrents.designpatterns.patterns.bridge.pattern.views;

import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.IMediaResource;

public class RowView extends View {
    public RowView(IMediaResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        IMediaResource resource = this.getResource();

        return resource.getTitle().toUpperCase() +
               " (" + resource.getSubtitle() + ")";
    }
}
