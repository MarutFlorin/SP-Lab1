package ro.uvt.sp;

public class Table extends Element {
    private final String title;

    public Table(String title){
        this.title = title;
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
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }
}
