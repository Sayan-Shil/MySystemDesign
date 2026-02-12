package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public class Director extends Approver {

    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays<7){
            System.out.println("Director Leave approved ....");
        } else if(nextApprover!=null) {
            nextApprover.processRequest(leaveDays);
        }
    }
}
