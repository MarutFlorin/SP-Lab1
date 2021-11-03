package ro.uvt.sp;

public class ImageLoadFactory {
    public ImageLoader create(String url){
        if(url.toLowerCase().endsWith((".bmp")))
            return new BMPImageLoader();
        else if(url.toLowerCase().endsWith((".jpg")))
            return new JPGImageLoader();
        else
            throw new RuntimeException("Unsupported image format");
    }
}
