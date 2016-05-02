package task03and04;

import java.util.Comparator;

public class StationeryComparatorByPrice implements Comparator<Stationery> {
    @Override
    public int compare(Stationery stationery1, Stationery stationery2) {
        return (stationery1.getPrice() < stationery2.getPrice() ) ? -1:
                (stationery1.getPrice() > stationery2.getPrice() ) ? 1:0 ;
    }
}
