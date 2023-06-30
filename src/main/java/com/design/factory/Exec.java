package com.design.factory;

public class Exec {

    public static void main(String[] args) {

        String fileName = "shu.png";

        Image img = ImageFactory.getInstance().getImageReader(fileName).decode();
        System.out.println(img.getImage());


    }


}


class ImageFactory {


    static volatile ImageFactory instance;
    static ImageFactory getInstance() {

        if(instance==null) {
            synchronized ((ImageFactory.class)) {
                if(instance==null) {
                    instance = new ImageFactory();
                }
                return instance;
            }
        }
        return instance;
    }

     ImageReader getImageReader(String image) {
        if(image.contains("gif"))
            return new GIFReader(image);
        else
            return new PNGReader(image);
    }

}
