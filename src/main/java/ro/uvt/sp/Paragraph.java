package ro.uvt.sp;

public class Paragraph extends Element {
    private String text;
    private AlignStrategy alignStrategy = new AlignLeft();

    public Paragraph(String text){
        this.text = text;
    }

    public void print(){
        System.out.println(this);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy = alignStrategy;
        this.alignStrategy.render(this, new RenderingContext(30));
    }

    @Override
    public void setParent(Element element) {

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public Element getParent() {
        return null;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}
