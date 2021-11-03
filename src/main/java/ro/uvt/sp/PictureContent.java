package ro.uvt.sp;

public class PictureContent {
    private final byte[] bytes;

    public PictureContent(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
