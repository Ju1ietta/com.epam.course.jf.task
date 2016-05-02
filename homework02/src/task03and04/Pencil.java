package task03and04;

public class Pencil extends WritingAccessories{
    private Type type;
    public enum Type{
        AUTO, SIMPLE;
    }
    public Pencil(float price, String producer, Colour colour, Type type) {
        super(price, producer, colour);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pencil{" + super.toString() +
                "type=" + type +
                '}';
    }
}
