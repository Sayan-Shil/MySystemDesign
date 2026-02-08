package LLD.DesignPrinciple.SOLID.O.OpenClosePrinciple.GoodCode;

public class Triangle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println("Area of Triangle is calculated");
    }
}
