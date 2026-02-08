package LLD.DesignPrinciple.SOLID.I.InterfaceSeggregationProblem.GoodCode;

public class AdvancedPrinter implements Printer,Scanner,FaxMachine {
    @Override
    public void print() {
        System.out.println("Printing....");
    }

    @Override
    public void scan() {
        System.out.println("Scanning....");
    }

    @Override
    public void fax() {
        System.out.println("Faxing....");
    }
}
