package ro.uvt.sp;

public class ImageContent extends PictureContent {
    private final byte[] bytes;

    public ImageContent(byte[] bytes) {
        super(bytes);
        this.bytes = bytes;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
