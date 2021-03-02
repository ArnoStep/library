public class Book {
    private String name;
    private String author;
    private int serialNumber;
    private int pageCount;

    public Book(String name, String author, int serialNumber, int pageCount) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
        this.pageCount = pageCount;
    }

    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "_name='" + name + '\'' +
                ", _author='" + author + '\'' +
                ", _serialNumber=" + serialNumber +
                ", _pageCount=" + pageCount +
                '}';
    }
}
