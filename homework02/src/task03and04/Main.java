package task03and04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Stationery> stationeryList = new ArrayList<>();
        stationeryList.add(new Notebook(200, "Spb", "black", 100, Notebook.BookCover.HARDCOVER));
        stationeryList.add(new Copybook(50, "Moscow", "red", 24, Copybook.Type.CAGE));
        stationeryList.add(new Paperboard(100, "Samara", "white", 25));
        stationeryList.add(new Pen(40, "Dubki", WritingAccessories.Colour.BLUE, Pen.Type.FELT_TIP));
        stationeryList.add(new Pencil(30, "Karelia", WritingAccessories.Colour.BLACK, Pencil.Type.AUTO));
        stationeryList.add(new Pencil(30, "Dubki", WritingAccessories.Colour.BLACK, Pencil.Type.AUTO));
        stationeryList.add(new Marker(80, "China", WritingAccessories.Colour.RED));
        for(Stationery st :  stationeryList){
            System.out.println(st);
        }

        Collections.sort(stationeryList, new StationeryComparatorByPrice());
        System.out.println("After sort by price: ");
        for (int i = 0; i < stationeryList.size(); i++) {
            Stationery stationery = stationeryList.get(i);
            System.out.println("Stationery producer name: " + stationery.getProducer() + "|| "
                                + "Stationery price: " + stationery.getPrice());
        }

        Collections.sort(stationeryList, new StationeryComparatorByName());
        System.out.println("After sort by producer name: ");
        for (int i = 0; i < stationeryList.size(); i++) {
            Stationery stationery = stationeryList.get(i);
            System.out.println("Stationery producer name: " + stationery.getProducer() + "|| "
                    + "Stationery price: " + stationery.getPrice());
        }

        Collections.sort(stationeryList, new StationeryComparatorByPriceAndName());
        System.out.println("After sort by price  and producer name: ");
        for (int i = 0; i < stationeryList.size(); i++) {
            Stationery stationery = stationeryList.get(i);
            System.out.println("Stationery producer name: " + stationery.getProducer() + "|| "
                    + "Stationery price: " + stationery.getPrice());
        }
    }
}
