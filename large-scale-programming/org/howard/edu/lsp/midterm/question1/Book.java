/**
 * The Book class represents a book in a library with details like title, author, ISBN, and year published.
 */
public class Book {

    // Attributes
    /**
     * Book Title.
     */
    private String title;

    /**
     * Book Author.
     */
    private String author;

    /**
     * Book ISBN.
     */
    private String ISBN;

    /**
     * Publish year.
     */
    private int yearPublished;

    // Constructor

    /**
     * Constructs a Book object with the specified title, author, ISBN, and year published.
     *
     * @param titleInput the title of the book
     * @param authorInput the author of the book
     * @param ISBNInput the ISBN of the book
     * @param yearPublishedInput the year the book was published
     */
    public Book(String titleInput, String authorInput, String ISBNInput, int yearPublishedInput) {
        title = titleInput;
        author = authorInput;
        ISBN = ISBNInput;
        yearPublished = yearPublishedInput;
    }

    // Getters and Setters

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param titleInput the new title of the book
     */
    public void setTitle(String titleInput) {
        title = titleInput;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param authorInput the new author of the book
     */
    public void setAuthor(String authorInput) {
        author = authorInput;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return the ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBNInput the new ISBN of the book
     */
    public void setISBN(String ISBNInput) {
        ISBN = ISBNInput;
    }

    /**
     * Gets the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublishedInput the new year the book was published
     */
    public void setYearPublished(int yearPublishedInput) {
        yearPublished = yearPublishedInput;
    }

    // Override equals method

    /**
     * Compares this book with another object to determine if they are equal.
     * Two books are considered equal if they have the same ISBN and author.
     *
     * @param obj the object to compare with
     * @return true if the books have the same ISBN and author, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return ISBN.equals(otherBook.ISBN) && author.equals(otherBook.author);
        }
        return false;
    }

    // Override toString method

    /**
     * Returns a string representation of the book, including the title, author, ISBN, and year published.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}




