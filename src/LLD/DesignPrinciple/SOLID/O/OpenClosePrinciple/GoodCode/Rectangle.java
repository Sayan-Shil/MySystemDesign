package LLD.DesignPrinciple.SOLID.O.OpenClosePrinciple.GoodCode;

public class Rectangle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle is calculated");
    }
}