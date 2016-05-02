package task03and04;

public abstract class Stationery {
    protected float price;
    protected String producer;

    public Stationery(float price, String producer) {
        this.price = price;
        this.producer = producer;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }
}
