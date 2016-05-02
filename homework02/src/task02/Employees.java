package task02;

import task02.stationery.Paper;
import task02.stationery.Pen;
import task02.stationery.Pencil;
import task02.stationery.Ruler;

public class Employees {
    private String name;

    private int penQuantity;
    private int pencilQuantity;
    private int paperQuantity;
    private int rulerQuantity;
    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPenQuantity(int penQuantity) {
        if(penQuantity >= 0) this.penQuantity = penQuantity;
        else throw new IllegalArgumentException("Illegal argument!");
    }

    public void setPencilQuantity(int pencilQuantity) {
        if (pencilQuantity >= 0) this.pencilQuantity = pencilQuantity;
        else throw new IllegalArgumentException("Illegal argument!");

    }
    public void setPaperQuantity(int paperQuantity) {
        if (paperQuantity >= 0) this.paperQuantity = paperQuantity;
        else throw new IllegalArgumentException("Illegal argument!");
    }

    public void setRulerQuantity(int rulerQuantity) {
        if (rulerQuantity >= 0) this.rulerQuantity = rulerQuantity;
        else throw new IllegalArgumentException("Illegal argument!");
    }

    public int getPenQuantity() {
        return penQuantity;
    }

    public int getPencilQuantity() {
        return pencilQuantity;
    }

    public int getPaperQuantity() {
        return paperQuantity;
    }

    public int getRulerQuantity() {
        return rulerQuantity;
    }
    public int costOfStationery(){
        return this.penQuantity * Pen.price + this.pencilQuantity * Pencil.price
                + this.paperQuantity * Paper.price + this.rulerQuantity * Ruler.price;
    }
}
