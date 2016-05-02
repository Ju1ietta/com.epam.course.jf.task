package task03and04;

public abstract class WritingAccessories extends Stationery{
    private Colour colour;

    public enum Colour{
        BLACK, BLUE, GREEN, RED;
    }

    public WritingAccessories(float price, String producer, Colour colour) {
        super(price, producer);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "WritingAccessories{" + super.toString() +
                "colour=" + colour +
                '}';
    }
}
