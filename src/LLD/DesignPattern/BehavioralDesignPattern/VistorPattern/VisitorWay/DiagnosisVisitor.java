package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.VisitorWay;

public class DiagnosisVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Child is diagnosis....");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Adult is diagnosis....");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Senior is diagnosis....");
    }
}
