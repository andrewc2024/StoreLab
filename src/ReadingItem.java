public class ReadingItem extends CISItem{

    private String author = "";
    private Integer wordCount = 0;
    private String datePublished = "";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public ReadingItem(String author, Integer wordCount, String datePublished) {
        this.author = author;
        this.wordCount = wordCount;
        this.datePublished = datePublished;

    }
    public ReadingItem() {


    }

    @Override
    public String toString() {
        return "ReadingItem{" +
                "author='" + author + '\'' +
                ", wordCount=" + wordCount +
                ", datePublished='" + datePublished + '\'' +
                '}';
    }
}
