package bcit.BookStore;
import java.util.List;

/**
 * A bcit.BookStore.Novel class with a title, author name,and year published.
 *
 * @author Ted
 * @author Liam
 * @author Lizzhan
 * @version 1.0
 */

public class Novel extends Literature implements Comparable<Novel>
{

    private final static int EARLIEST_PUBLISH_YEAR = 0;

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructor of bcit.BookStore.Novel Object.
     *
     * @param title         novel title
     * @param authorName    name of author
     * @param yearPublished bcit.BookStore.Novel published year
     */
    public Novel(String title, String authorName, int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYearPublished(yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /*
     * Validates the given title of the book on criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     *
     * @param title given title
     */
    private static void validateTitle(final String title)
    {
        if (title == null ||
            title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    }

    /*
     * Validates the given name for the author on criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     *
     * @param authorName given title
     */
    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null ||
            authorName.isBlank())
        {
            throw new IllegalArgumentException("The name of the author cannot be null or empty");
        }
    }

    /*
     * Validates the given year published on criteria:
     * 1. Can not be earlier than EARLIEST_PUBLISH_YEAR
     *
     * @param yearPublished given year published
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < EARLIEST_PUBLISH_YEAR)

            throw new IllegalArgumentException("Publish year must be a positive integer.");
    }

    /**
     * Getter of title.
     *
     * @return String title name.
     */
    @Override
    public String getTitle()
    {
        return title;
    }

    /**
     * Getter of author name.
     *
     * @return String author name.
     */
    @Override
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Getter of published year.
     *
     * @return int published year.
     */
    @Override
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Override for compare to so that the novels can be
     * ordered Alphabetically in the BookStore class
     * @param compareNovel the object to be compared.
     * @return compare
     */
    @Override
    public int compareTo(Novel compareNovel)
    {
        int compare = title.compareTo(compareNovel.title);

        return compare;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("Novel title: " + title + "\n");
        builder.append("Author name: " + authorName + "\n");
        builder.append("Year published: " + yearPublished + "\n");

        return builder.toString();
    }



}

