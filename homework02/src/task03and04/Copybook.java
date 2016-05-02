package task03and04;

public class Copybook extends Paper{
    private Type type;
    public enum Type{
        CAGE, LINE;
    }
    public Copybook(float price, String producer, String colour, int numberPage, Type type) {
        super(price, producer, colour, numberPage);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Copybook{" + super.toString() +
                "type=" + type +
                '}';
    }
}
