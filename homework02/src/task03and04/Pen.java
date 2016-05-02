package task03and04;

public class Pen extends WritingAccessories{
    private Type type;

    public enum Type{
        BALLPOINT, FOUNTAIN, FELT_TIP;
    }

    public Pen(float price, String producer, Colour colour, Type type) {
        super(price, producer, colour);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen{" + super.toString() +
                "type=" + type +
                '}';
    }
}
