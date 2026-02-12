package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public class BusinessManager extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays<5){
            System.out.println("Business Manager Leave approved ....");
        } else if(nextApprover!=null) {
            nextApprover.processRequest(leaveDays);
        }
    }
}
