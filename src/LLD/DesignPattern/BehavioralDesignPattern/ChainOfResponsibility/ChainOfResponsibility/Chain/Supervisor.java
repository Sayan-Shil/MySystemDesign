package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public class Supervisor extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays<14){
            System.out.println("Supervisor Leave approved ....");
        } else if(nextApprover!=null) {
            nextApprover.processRequest(leaveDays);
        }
    }
}
