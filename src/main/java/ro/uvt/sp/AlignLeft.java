package ro.uvt.sp;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph paragraph, RenderingContext context) {
        int nrOfCharacters = context.getNrOfCharacters();
        String text = paragraph.getText();
        StringBuffer result = new StringBuffer(text);

        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < nrOfCharacters; j++) {
                result.append(text.charAt(++k));
            }
            result.append("\n");
        }
    }
}
