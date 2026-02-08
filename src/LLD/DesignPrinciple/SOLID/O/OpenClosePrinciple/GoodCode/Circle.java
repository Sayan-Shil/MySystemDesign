package LLD.DesignPrinciple.SOLID.O.OpenClosePrinciple.GoodCode;

public class Circle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println("Area of Circle is calculated");
    }
}
