package LLD.DesignPrinciple.SOLID.I.InterfaceSeggregationProblem.GoodCode;



public class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing....");
    }
}
