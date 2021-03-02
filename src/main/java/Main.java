public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hobbit");
        Book book2 = new Book("Lord of the rings");
        Book book3 = new Book("Harry Potter", "Joanne Rowling");
        Book book4 = new Book("Alice's adventures in wonderland", "Lewis Carroll");
        Book book5 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 1250);
        Book book6 = new Book("Gulliver's travels", "Jonathan Swift", 400);
        Book book7 = new Book("War and Peace", "Lev Tolstoy", 1450, 1500);
        Book book8 = new Book("Romeo and Juliet", "William Shakespeare", 300, 320);

        Book[] bookArray = {book1, book2, book3, book4, book5, book6, book7, book8};
        Reader reader = new Reader();
        Book chosenBook = reader.choiceBook(bookArray);
        reader.readBook(chosenBook);
        reader.rateBook(chosenBook);
    }
}