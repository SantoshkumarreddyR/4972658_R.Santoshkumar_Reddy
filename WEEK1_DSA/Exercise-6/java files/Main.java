public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(3, "Java Concurrency in Practice", "Brian Goetz"));

        // Test linear search
        System.out.println("Linear Search Results:");
        Book book1 = library.linearSearchByTitle("Clean Code");
        System.out.println(book1 != null ? book1 : "Book not found");

        // Test binary search
        System.out.println("Binary Search Results:");
        Book book2 = library.binarySearchByTitle("Java Concurrency in Practice");
        System.out.println(book2 != null ? book2 : "Book not found");

        // Test search for a book not in the library
        Book book3 = library.linearSearchByTitle("Unknown Book");
        System.out.println(book3 != null ? book3 : "Book not found");

        Book book4 = library.binarySearchByTitle("Unknown Book");
        System.out.println(book4 != null ? book4 : "Book not found");
    }
}
