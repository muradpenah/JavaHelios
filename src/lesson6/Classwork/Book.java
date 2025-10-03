package lesson6.Classwork;

public class Book {
    private String name;
    private String author;
    private int pageCount;

    public Book(String name,String author,int pageCount) {
        this.author = author;
        this.name=name;
        this.pageCount=pageCount;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

}
