public class Book extends ReadingItem{
    private String isbn;
    private String edition;
    private String title;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String isbn, String edition, String title) {
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", edition='" + edition + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
