package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.VisitorWay;

public class BillingVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Child Patient has been billed");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Adult Patient has been billed");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Senior Patient has been billed");
    }
}
