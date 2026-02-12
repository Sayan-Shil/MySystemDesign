package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public class Manager extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays<3){
            System.out.println("Manager Leave approved ....");
        } else if(nextApprover!=null) {
            nextApprover.processRequest(leaveDays);
        }
    }
}
