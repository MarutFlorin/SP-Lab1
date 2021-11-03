package ro.uvt.sp;

public class AlignCenter implements AlignStrategy{

    @Override
    public void render(Paragraph paragraph, RenderingContext context) {
        String text = paragraph.getText().replaceAll("\\s+","");
        paragraph.setText(text);
    }
}
