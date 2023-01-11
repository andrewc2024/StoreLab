public class Magazine extends ReadingItem{
    private String coverStory;
    private String printDate;

    public String getCoverStory() {
        return coverStory;
    }

    public void setCoverStory(String coverStory) {
        this.coverStory = coverStory;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public Magazine(String coverStory, String printDate) {
        this.coverStory = coverStory;
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "coverStory='" + coverStory + '\'' +
                ", printDate='" + printDate + '\'' +
                '}';
    }
}
