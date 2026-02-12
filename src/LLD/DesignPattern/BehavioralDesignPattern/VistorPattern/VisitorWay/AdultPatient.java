package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.VisitorWay;

public class AdultPatient implements Patient{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
