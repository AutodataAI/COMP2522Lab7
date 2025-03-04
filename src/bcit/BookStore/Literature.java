package bcit.BookStore;

/**
 * class name: Literature
 * Abstract class for the package
 * @author Leslie Zhang, Ted Ip, Liam Pickrell
 * @version 1.0
 */
abstract class Literature{

    protected abstract String getTitle();

    protected abstract String getAuthorName();

    protected abstract int getYearPublished();

    public abstract String toString();


}
