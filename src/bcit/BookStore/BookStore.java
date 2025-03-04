package bcit.BookStore;

import java.util.*;

/**
 * The bcit.BookStore.BookStore
 * class has a main() method which creates a bcit.BookStore.BookStore object. The bcit.BookStore.BookStore contains a second instance
 * variable that is a List of bcit.BookStore.Novel references; the bcit.BookStore.BookStore constructor populates that ArrayList with the
 * following data: (a big table of Data)
 *
 * @author Ted
 * @author Liam
 * @author Lizzhan
 * @version 1.0
**/



public class BookStore <T extends Literature> {

    private final String bookStoreName;
    private final List<T> books;
    //Hashmap used for part 2
    private final Map<String, T> novelsMap = new HashMap<>();
    private List<T> items = new ArrayList<>();

    private static final int DECADE_INDICATOR = 10;

    public BookStore(final String bookStoreName)
    {
        validateBookstoreName(bookStoreName);

        this.books = new ArrayList<>();
        this.bookStoreName = bookStoreName;

//        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
//        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
//        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
//        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
//        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
//        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
//        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
//        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
//        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
//        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
//        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
//        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
//        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
//        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
//        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
//        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
//        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
//        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
//        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
//        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
//        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
//        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
//        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
//        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
//        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
//        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
//        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
//        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
//        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
//        novels.add(new Novel("Deliverance", "James Dickey", 1970));
//        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
//        novels.add(new Novel("Falconer", "John Cheever", 1977));
//        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
//        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
//        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
//        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
//        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
//        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
//        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
//        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
//        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
//        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
//        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
//        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
//        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
//        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
//        novels.add(new Novel("Infinite Jest David", "Foster Wallace", 1996));
//        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
//        novels.add(new Novel("Light in August", "William Faulkner", 1932));
//        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
//        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
//        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
//        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
//        novels.add(new Novel("Loving", "Henry Green", 1945));
//        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
//        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
//        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
//        novels.add(new Novel("Money", "Martin Amis", 1984));
//        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
//        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
//        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
//        novels.add(new Novel("Native Son", "Richard Wright", 1940));
//        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
//        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
//        novels.add(new Novel("1984", "George Orwell", 1948));
//        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
//        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
//        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
//        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
//        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
//        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
//        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
//        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
//        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
//        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
//        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
//        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
//        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
//        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
//        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
//        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
//        novels.add(new Novel("Slaughterhouse-Five Kurt", "Vonnegut", 1969));
//        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
//        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
//        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
//        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
//        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
//        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
//        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
//        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
//        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
//        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
//        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
//        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
//        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
//        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
//        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
//        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
//        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
//        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        //Adds all novels to the HashMap for part 2
    }

    /*
     *  Validates the book store name based on criteria:
     *  1. Cannot be null
     *  2. Cannot be blank
     *
     * @param bookstoreName
     */
    private static void validateBookstoreName(final String bookstoreName)
            throws IllegalArgumentException
    {
        if(bookstoreName == null ||
           bookstoreName.isBlank())
        {
            throw new IllegalArgumentException("Bookstore name cannot be null or blank");
        }
    }

    /**
     * add book to the books list
     * @param newBook
     */
    public void addToStore (final T newBook){
        this.books.add(newBook);
    }

    public List<T> getBooks() {
        return this.books;
    }

    /**
     * get this bookstore's size
     * @return size, int
     */
    public int getBookStoreSize(){
        return this.books.size();
    }
    /**
     * Prints all novel titles to UPPERCASE
     */
    public void printAllTitles()
    {
        for(T book : books)
        {
            System.out.println(book.getTitle().toUpperCase());
        }
    }

    /**
     * Prints all titles that contain the specified parameter
     * @param title used to search for book title
     */
    public void printBookTitle(final String title)
    {
        books.forEach((T book) -> {
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getTitle());
            }
        });
    }

    /**
     * prints all book titles In alphabetical order
     */
    public void printTitlesInAlphaOrder()
    {
        List<String> titles = new ArrayList<>();
        books.forEach((T book) -> {titles.add(book.getTitle());});
        titles.sort(String :: compareToIgnoreCase);
        titles.forEach((String title) -> {
            System.out.println(title);
        });
    }

    /**
     * Prints all books for the inputted decade
     *
     * @param decade used to check for a valid decade
     */
    public void printGroupByDecade(final int decade)
    {
        validateDecade(decade);
        for(T novelDecade : books)
        {
            /*Checking if the books decade aligns with inputted decade
             by integer dividing both by 10.
             2001 - 2009 / 10 = 200
             2000 / 10 = 200
             therefor they are in the same decade
             */
            if(novelDecade.getYearPublished() / DECADE_INDICATOR
               == decade / DECADE_INDICATOR)
            {
                System.out.println(novelDecade.getTitle());
            }
        }
    }

    /**
     * Finds the longest title in the bookstore
     * @return longest book title
     */
    public void getLongest()
    {
        String longest = books.get(0).getTitle();

        for(T checkLongest : books)
        {
            if (checkLongest.getTitle().length() > longest.length())
            {
                longest = checkLongest.getTitle();
            }
        }
        System.out.println(longest);
    }

    /**
     * Checks all books to see if there is a book in the book store written in year
     * and returns true or false
     * @param year used to check if a book was written within a specific year
     * @return wasWritten
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        boolean wasWritten = false;

        for(T novel : books)
        {
            if(novel.getYearPublished() == year)
            {
                wasWritten = true;
            }
        }
        return wasWritten;
    }

    /**
     * Checks all book titles in the novels array, and returns the
     * amount of books containing the specified work in their title.
     * @param word used to check if a bcit.BookStore.Novel's title has this word within it
     * @return booksContaining
     */
    public int howManyBooksContain(final String word)
    {
        int  booksContaining = 0;

        for(T novel : books)
        {
            if (novel.getTitle().toUpperCase().contains(word.toUpperCase()))
            {
                booksContaining++;
            }
        }
        return booksContaining;
    }

    /**
     * Checks percentage of the total books were written between years
     * first and last and prints it to the console
     * @param first the starting year
     * @param last the ending year
     */
    public int whichPercentWrittenBetween(final int first, final int last)
    {
        int percentWritten = 0;

        for(T novel : books)
        {
            if(novel.getYearPublished() >= first
               && novel.getYearPublished() <= last)
            {
                percentWritten++;
            }
        }
        return percentWritten % books.size();

    }

    /**
     * Checks novels arrayList for the oldest book by comparing
     * the current oldest (initialized as the 1st book in the array)
     * book's age to the next books age sequentially until
     * the last index in the arrayList
     * @return oldestBook
     */
    public T getOldestBook()
    {
        T oldestBook = books.get(0);

        for(T novel : books)
        {
            if(novel.getYearPublished() < oldestBook.getYearPublished())
            {
                oldestBook = novel;
            }
        }

        return oldestBook;
    }

    /**
     * Returns a list of all books whose titles is titleLength.
     * @param titleLength used to check if the book title is of this
     *                    length of words
     * @return builder.toString() string builder for list of all titles
     */
    public List<T> getBooksThisLength(final int titleLength)
    {
        List<T> bookLengths = new ArrayList<>();

        for (T novel : books)
        {
            if(novel.getTitle().length() == titleLength)
            {
                bookLengths.add(novel);
            }
        }

        return bookLengths;
    }

    //Validator for decade, decade must be divisible by 100 evenly
    private static void validateDecade(final int decade)
            throws IllegalArgumentException
    {
        if(decade % 10 != 0)
        {
            throw new IllegalArgumentException("Invalid decade");
        }
    }


    // Step 3: Sort the List
    private void sortList(final List<String> list)
    {
        Collections.sort(list);
    }

    // Use the sorted keys to get the Map values
    public String getMapValues()
    {
        for(T novel : books)
        {
            novelsMap.put(novel.getTitle(), novel);
        }

        // Step 1: Get the keys from the HashMap
        Set<String> keySet = novelsMap.keySet();
        // Step 2: Convert the Set to a List (because List can be sorted)
        List<String> keyList = new ArrayList<>(keySet);

        StringBuilder builder = new StringBuilder();
        builder.append("\nList of all Keys:\n");
        //List gets sorted here
        sortList(keyList);
        //One iterator to do the inital printout
        Iterator<String> keyIterator = keyList.iterator();
        //Second iterator to trim the list to exclude "the"
        Iterator<String> keyIterator2 = keyList.iterator();

        //Iterates through the list and appends all keys to stringbuilder
        while(keyIterator.hasNext())
        {
            builder.append(keyIterator.next() + "\n");
        }

        builder.append("\nList of all Keys without \"The\"\n");

        //Iterates through the list and removes all instances of
        //"the"
        while(keyIterator2.hasNext())
        {
            if(keyIterator2.next().toLowerCase().contains("the"))
            {
                keyIterator2.remove();
            }
        }

        //Takes the now trimmed list of keys and appends the value
        //of the key to the string builder, which is the novel's
        //toString() method
        for(String novel : keyList)
        {
            builder.append(novelsMap.get(novel) + "\n");
        }

            return builder.toString();
    }

    /**
     * static nested class BookStoreInfo
     */
    static class BookStoreInfo{
        /**
         * display BookStore's info
         * @param storeName
         * @param itemCount
         */
        public void displayInfo(final String storeName, final int itemCount) {
            System.out.println("BookStore: " + storeName + ", Items: " + itemCount);
        }
    }

    /**
     * nested class NovelStatistics
     */
    class NovelStatistics{

        /**
         * gets average title length of the outerclass.
         * @return average title length as double
         */
        public double averageTitleLength() {
            int totalLength;
            totalLength = 0;
            for (final T item : books) {
                totalLength += item.getTitle().length();
            }
            return (double) totalLength / books.size();
        }

    }

    /**
     * Add various types of literature to arraylist Items.
     * */
    public void addItem(T item)
    {
        items.add(item);
    }

    /**
     * Print title of each item in arraylist of literature.*/
    public void printItems() {
        for (T item : items) {
            System.out.println(item.getTitle());
        }
    }

    /**
     * Add novels to a collection of novels using List*/
    public void addNovelsToCollection(final List<? super Novel> novelCollection) {
        for (final T item : items) {
            if (item instanceof Novel) {
                novelCollection.add((Novel) item);
            }
        }
    }




}
