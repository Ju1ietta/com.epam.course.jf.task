package task03and04;

public class Paperboard extends Paper{
    public Paperboard(float price, String producer, String colour, int numberPage) {
        super(price, producer, colour, numberPage);
    }

    @Override
    public String toString() {
        return "Paperboard: " + super.toString();
    };
}
