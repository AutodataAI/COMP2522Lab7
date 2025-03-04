package bcit.BookStore;

/**
 * class name: ComicBook
 * Child class of Literature
 * @author Leslie Zhang, Ted Ip, Liam Pickrell
 * @version 1.0
 */
public class ComicBook extends Literature implements Comparable<Magazine> {
    private final String title;
    private final String author;
    private final int year;

    /**
     * Constructor
     * @param title String
     * @param author author
     * @param year year
     */
    public ComicBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * get title
     * @return title - String
     */
    @Override
    protected String getTitle() {
        return this.title;
    }

    /**
     * get author
     * @return author name - String
     */
    @Override
    protected String getAuthorName() {
        return this.author;
    }

    /**
     * get year published
     * @return year published - int
     */
    @Override
    protected int getYearPublished() {
        return this.year;
    }

    /**
     * To String method
     * @return string represenation
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Novel title: " + title + "\n");
        builder.append("Author name: " + author + "\n");
        builder.append("Year published: " + year + "\n");

        return builder.toString();
    }

    /**
     * compare to method
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Magazine o) {
        int compare = title.compareTo(o.getTitle());

        return compare;
    }
}
