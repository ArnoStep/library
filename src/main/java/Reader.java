import java.util.Random;

public class Reader {
    public Book choiceBook(Book[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    public void readBook(Book book) {
        System.out.println(book);
    }

    public void rateBook(Book book) {
        int score = 0;
        Random random = new Random();
        if (book.getName() != null) {
            score += book.getName().replaceAll(" ", "").length();
        } else {
            score -= random.nextInt(10);
        }

        if (book.getAuthor() != null) {
            score = score + book.getAuthor().replaceAll(" ", "").length();
        } else {
            score -= random.nextInt(10);
        }

        if (book.getSerialNumber() != 0) {
            score -= book.getSerialNumber();
        } else {
            score -= random.nextInt(10);
        }

        if (book.getPageCount() != 0) {
            score += book.getPageCount();
        } else {
            score -= random.nextInt(10);
        }

        System.out.println(book.getName() + " " + score);
    }
}
