package task03and04;

import java.util.Comparator;

public class StationeryComparatorByPriceAndName implements Comparator<Stationery>{
    @Override
    public int compare(Stationery stationery1, Stationery stationery2) {
        if (stationery1.getPrice() == stationery2.getPrice())
            return (stationery1.getProducer().compareTo(stationery2.getProducer()));
        else
            return (int) (stationery1.getPrice()-(stationery2.getPrice()));
    }
}
