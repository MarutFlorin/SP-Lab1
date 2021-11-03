package ro.uvt.sp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String url) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(url));
            byte[] imageBytes = ((DataBufferByte) bufferedImage.getRaster().getDataBuffer()).getData();
            return new ImageContent(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
