package api_methods.base_examples;

public class Book {
    public String title;
    public String author;
    public int pages;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
