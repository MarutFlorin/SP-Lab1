package ro.uvt.sp;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture {
    private final String url;
    //private final ImageContent content;

    Image(String url) {
        this.url = url;
        //this.content = content;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public void setParent(Element element) {

    }

    @Override
    public Element getParent() {
        return null;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + '\'' +
                '}';
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return new ImageContent(null);
    }

//    public ImageContent imageContent(){
//        return content;
//    }
}
