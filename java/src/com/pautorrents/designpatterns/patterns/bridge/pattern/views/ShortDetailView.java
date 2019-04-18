package com.pautorrents.designpatterns.patterns.bridge.pattern.views;

import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.IMediaResource;

public class ShortDetailView extends View {
    public ShortDetailView(IMediaResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        IMediaResource resource = this.getResource();

        return resource.getTitle().toUpperCase() + "\n" +
               resource.getSubtitle() + "\n" + "\n";
    }
}
