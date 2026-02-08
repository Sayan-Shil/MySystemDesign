package LLD.DesignPrinciple.SOLID.I.InterfaceSeggregationProblem.BadCode;

public class BasicPrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Printing....");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Cannot scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Cannot fax");
    }
}
