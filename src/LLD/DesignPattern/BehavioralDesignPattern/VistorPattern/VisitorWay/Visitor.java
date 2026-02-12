package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.VisitorWay;

public interface Visitor {
    // All Cases are written here as overloading concept
    void visit(ChildPatient childPatient);
    void visit(AdultPatient adultPatient);
    void visit(SeniorPatient seniorPatient);

}
