package ro.uvt.sp;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private final List<String> paragraphs = new ArrayList<>();
    private final List<String> images = new ArrayList<>();
    private final List<String> tables = new ArrayList<>();

    public Book(String title){
        this.title = title;
    }

    public void createNewParagraph(String paragraph){
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image){
        images.add(image);
    }

    public void createNewTable(String table){
        tables.add(table);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraphs=" + paragraphs +
                ", images=" + images +
                ", tables=" + tables +
                '}';
    }
}
