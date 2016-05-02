package task03and04;

import java.util.Comparator;

public class StationeryComparatorByName implements Comparator<Stationery> {
    @Override
    public int compare(Stationery stationery1, Stationery stationery2) {
        return stationery1.getProducer().compareTo(stationery2.getProducer());
    }
}
