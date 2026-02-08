package LLD.DesignPrinciple.SOLID.I.InterfaceSeggregationProblem.BadCode;

public class AdvancedPrinter implements Machine {
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
