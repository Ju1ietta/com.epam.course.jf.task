package task03and04;

public abstract class Paper extends Stationery {
    protected String colour;
    protected int numberPage;

    public Paper(float price, String producer, String colour, int numberPage) {
        super(price, producer);
        this.colour = colour;
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Paper{" + super.toString() +
                "colour='" + colour + '\'' +
                ", numberPage=" + numberPage +
                '}';
    }
}
