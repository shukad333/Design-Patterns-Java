package com.design.factory;

public abstract class ImageReader {

    private String fileName;
    public ImageReader(String f) {
        this.fileName = f;
    }
    abstract Image decode();
}

class GIFReader extends ImageReader {
    public GIFReader(String fileName) {
        super(fileName);
    }

    @Override
    Image decode() {
        Image image =  new Image();
        image.setImage("Gif Deoding");
        return image;
    }
}

class PNGReader extends ImageReader {
    public PNGReader(String fileName) {
        super(fileName);
    }

    @Override
    Image decode() {
        Image image =  new Image();
        image.setImage("PNGReader Deoding");
        return image;
    }
}