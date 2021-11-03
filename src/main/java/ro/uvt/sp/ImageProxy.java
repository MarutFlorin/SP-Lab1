package ro.uvt.sp;

import java.awt.*;

public class ImageProxy extends Element implements Picture {
    private String url, name;
    private Dimension dim;
    private Image realImage;
    private ImageContent content;

    ImageProxy(String name){
        this.name = name;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
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
        return null;
    }

    @Override
    public void print() {
        //System.out.println(this);
        loadImage();
        realImage.print();
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
        return "ImageProxy{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", dim=" + dim +
                ", realImage=" + realImage +
                ", content=" + content +
                '}';
    }
}
