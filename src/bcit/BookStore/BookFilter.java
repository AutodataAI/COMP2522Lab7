package bcit.BookStore;

/**
 * Functional interface to filter Books.
 * @author Ted
 * @author Nick
 * @version 1.0
 **/


@FunctionalInterface
interface BookFilter
{
    boolean filter(Novel book);
}

