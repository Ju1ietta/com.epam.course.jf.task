package task01;

public class Pen {
    private Colour colourInk;
    private Type type;
    private int price;
    private String producer;

    public Pen(Colour colourInk, Type type, int price, String producer){
        this.colourInk = colourInk;
        this.type = type;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public int hashCode() {
        final int hash = 17;
        return hash * colourInk.hashCode() + hash * type.hashCode() + hash * price + hash * producer.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(getClass()!= obj.getClass()){
            return false;
        }

        Pen onePen = (Pen)obj;

        return this.colourInk == onePen.colourInk && this.type == onePen.type
               && this.price == onePen.price && this.producer.equals(onePen.producer);
    }

    @Override
    public String toString() {
        return ("colourInk = " + this.colourInk + "; " + "type = " + this.type + "; "
                + "price = " + this.price + "; " + "producer = " + this.producer);
    }
}
