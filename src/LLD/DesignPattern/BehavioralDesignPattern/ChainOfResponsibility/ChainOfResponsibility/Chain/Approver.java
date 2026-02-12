package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public abstract class Approver {
    protected   Approver nextApprover;
    public void setNextApprover(Approver approver){
        nextApprover = approver;
    }

    abstract public void processRequest(int leaveDays);
}
