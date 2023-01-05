
public class IBook implements Comparable<IBook> {

    private String bookName;
    private int pageNum;
    private String authorName;
    private int date;

    public IBook(String bookName, int pageNum, String authorName, int date) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.date = date;
    }

    @Override
    public int compareTo(IBook o) {

        return getBookName().compareTo(o.getBookName());
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
