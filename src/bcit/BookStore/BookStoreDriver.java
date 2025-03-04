package bcit.BookStore;

import java.util.*;

/**
 * To drive the program.
 *
 * @author Ted Ip
 * @author Liam Pickrell
 * @author Leslie Zhang
 *
 * @version 1.0
 */
public class BookStoreDriver
{
    public static void main(final String[] args)
    {

        final BookStore<Novel> bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");
        bookstore.addToStore(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        bookstore.addToStore(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        bookstore.addToStore(new Novel("American Pastoral", "Philip Roth", 1997));
        bookstore.addToStore(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        bookstore.addToStore(new Novel("Animal Farm", "George Orwell", 1946));
        bookstore.addToStore(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        bookstore.addToStore(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        bookstore.addToStore(new Novel("The Assistant", "Bernard Malamud", 1957));
        bookstore.addToStore(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        bookstore.addToStore(new Novel("Atonement", "Ian McEwan", 2002));
        bookstore.addToStore(new Novel("Beloved", "Toni Morrison", 1987));
        bookstore.addToStore(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        bookstore.addToStore(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        bookstore.addToStore(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        bookstore.addToStore(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        bookstore.addToStore(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        bookstore.addToStore(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        bookstore.addToStore(new Novel("Call It Sleep", "Henry Roth", 1935));
        bookstore.addToStore(new Novel("Catch-22", "Joseph Heller", 1961));
        bookstore.addToStore(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookstore.addToStore(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        bookstore.addToStore(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        bookstore.addToStore(new Novel("The Corrections", "Jonathan Franzen", 2001));
        bookstore.addToStore(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        bookstore.addToStore(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        bookstore.addToStore(new Novel("The Day of the Locust", "Nathanael West", 1939));
        bookstore.addToStore(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        bookstore.addToStore(new Novel("A Death in the Family", "James Agee", 1958));
        bookstore.addToStore(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        bookstore.addToStore(new Novel("Deliverance", "James Dickey", 1970));
        bookstore.addToStore(new Novel("Dog Soldiers", "Robert Stone", 1974));
        bookstore.addToStore(new Novel("Falconer", "John Cheever", 1977));
        bookstore.addToStore(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        bookstore.addToStore(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        bookstore.addToStore(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        bookstore.addToStore(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        bookstore.addToStore(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        bookstore.addToStore(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        bookstore.addToStore(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookstore.addToStore(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        bookstore.addToStore(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        bookstore.addToStore(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        bookstore.addToStore(new Novel("Herzog", "Saul Bellow", 1964));
        bookstore.addToStore(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        bookstore.addToStore(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        bookstore.addToStore(new Novel("I, Claudius", "Robert Graves", 1934));
        bookstore.addToStore(new Novel("Infinite Jest David", "Foster Wallace", 1996));
        bookstore.addToStore(new Novel("Invisible Man", "Ralph Ellison", 1952));
        bookstore.addToStore(new Novel("Light in August", "William Faulkner", 1932));
        bookstore.addToStore(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        bookstore.addToStore(new Novel("Lolita", "Vladimir Nabokov", 1955));
        bookstore.addToStore(new Novel("Lord of the Flies", "William Golding", 1954));
        bookstore.addToStore(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookstore.addToStore(new Novel("Loving", "Henry Green", 1945));
        bookstore.addToStore(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        bookstore.addToStore(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        bookstore.addToStore(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        bookstore.addToStore(new Novel("Money", "Martin Amis", 1984));
        bookstore.addToStore(new Novel("The Moviegoer", "Walker Percy", 1961));
        bookstore.addToStore(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        bookstore.addToStore(new Novel("Naked Lunch", "William Burroughs", 1959));
        bookstore.addToStore(new Novel("Native Son", "Richard Wright", 1940));
        bookstore.addToStore(new Novel("Neuromancer", "William Gibson", 1984));
        bookstore.addToStore(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        bookstore.addToStore(new Novel("1984", "George Orwell", 1948));
        bookstore.addToStore(new Novel("On the Road", "Jack Kerouac", 1957));
        bookstore.addToStore(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        bookstore.addToStore(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        bookstore.addToStore(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        bookstore.addToStore(new Novel("A Passage to India", "E.M. Forster", 1924));
        bookstore.addToStore(new Novel("Play It as It Lays", "Joan Didion", 1970));
        bookstore.addToStore(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        bookstore.addToStore(new Novel("Possession", "A.S. Byatt", 1990));
        bookstore.addToStore(new Novel("The Power and the Glory", "Graham Greene", 1939));
        bookstore.addToStore(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        bookstore.addToStore(new Novel("Rabbit, Run", "John Updike", 1960));
        bookstore.addToStore(new Novel("Ragtime", "E.L. Doctorow", 1975));
        bookstore.addToStore(new Novel("The Recognitions", "William Gaddis", 1955));
        bookstore.addToStore(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        bookstore.addToStore(new Novel("Revolutionary Road", "Richard Yates", 1961));
        bookstore.addToStore(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        bookstore.addToStore(new Novel("Slaughterhouse-Five Kurt", "Vonnegut", 1969));
        bookstore.addToStore(new Novel("Snow Crash", "Neal Stephenson", 1992));
        bookstore.addToStore(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        bookstore.addToStore(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        bookstore.addToStore(new Novel("The Sportswriter", "Richard Ford", 1986));
        bookstore.addToStore(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        bookstore.addToStore(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        bookstore.addToStore(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        bookstore.addToStore(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        bookstore.addToStore(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        bookstore.addToStore(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        bookstore.addToStore(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        bookstore.addToStore(new Novel("Ubik", "Philip K. Dick", 1969));
        bookstore.addToStore(new Novel("Under the Net", "Iris Murdoch", 1954));
        bookstore.addToStore(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        bookstore.addToStore(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        bookstore.addToStore(new Novel("White Noise", "Don DeLillo", 1985));
        bookstore.addToStore(new Novel("White Teeth", "Zadie Smith", 2000));
        bookstore.addToStore(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));


        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                           oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));

        System.out.println(bookstore.getMapValues());


        BookStore<ComicBook> comics = new BookStore<>("Comic Central");
        comics.addToStore(new ComicBook("The Crow", "Brandon Lee", 1990));
        comics.getLongest();
        comics.printAllTitles();


        BookStore<Magazine> magazines = new BookStore<>("Magazines");
        magazines.addToStore(new Magazine("Magazine", "Harper Lee", 2000));
        magazines.addToStore(new Magazine("Guitar World", "Eddie Van Halen", 1990));
        magazines.getLongest();
        magazines.printAllTitles();

        List <Novel> items = bookstore.getBooks();

        /**
         * Anonymous Class overrides compare to allow the collection to be ordered
         * by title length (not alphabetical order).
         */
        items.sort(new Comparator<Literature>()
        {
            /**
             * The compare method overrides the other compare methods to order the
             * collection by title length, not alphabetical order.
             *
             * @param o1 the first piece of literature to compare.
             * @param o2 the second piece of literature to compare.
             * @return the shortest title length between the two books.
             */
            @Override
            public int compare(final Literature o1, final Literature o2)
            {
                return Integer.compare(o1.getTitle().length(), o2.getTitle().length());
            }
        });

        bookstore.printAllTitles(); //printing all books based on their title length

    }
    }



