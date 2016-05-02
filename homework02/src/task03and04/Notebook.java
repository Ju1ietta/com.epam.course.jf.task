package task03and04;

public class Notebook extends Paper{
    private BookCover bookcover;

    public enum BookCover{
        SOFTCOVER, HARDCOVER;
    }

    public Notebook(float price, String producer, String colour, int numberPage, BookCover bookcover) {
        super(price, producer, colour, numberPage);
        this.bookcover = bookcover;
    }

    @Override
    public String toString() {
        return "Notebook{" + super.toString() +
                "bookcover=" + bookcover +
                '}';
    }
}
