package task03and04;

public class Marker extends WritingAccessories{
    public Marker(float price, String producer, Colour colour) {
        super(price, producer, colour);
    }

    @Override
    public String toString() {
        return "Marker: " + super.toString();
    }
}
