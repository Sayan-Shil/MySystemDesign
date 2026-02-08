package LLD.DesignPrinciple.SOLID.O.OpenClosePrinciple.BadCode;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void calculateArea(){
        if(name.equals("Rectangle")){
            System.out.println("Area of Rectangle is calculated");
        } else if(name.equals("Circle")){
            System.out.println("Area of Circle is calculated");
        }  else if(name.equals("Square")){
            System.out.println("Area of Square is calculated");
        } else if(name.equals("Triangle")){
            System.out.println("Area of Triangle is calculated");
        }
    }


    static void main() {
        Shape shape = new Shape("Rectangle");
        shape.calculateArea();
    }
}
