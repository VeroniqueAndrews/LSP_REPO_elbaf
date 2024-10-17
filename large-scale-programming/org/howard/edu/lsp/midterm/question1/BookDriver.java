public class BookDriver {
    public static void main(String[] args) {
        // create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Print equals method
        System.out.println(book1.equals(book2)); // Output: true
        System.out.println(book1.equals(book3)); // Output: false

        // Print toString method
        System.out.println(book1); 
        // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925

        System.out.println(book3);
        // Output: Title: A Promised Land, Author: Barack Obama, ISBN: 9780593239681, Year Published: 2020
    }
}
