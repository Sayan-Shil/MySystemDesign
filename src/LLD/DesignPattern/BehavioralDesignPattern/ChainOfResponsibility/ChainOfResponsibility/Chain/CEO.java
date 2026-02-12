package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain;

public class CEO extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays<21){
            System.out.println("CEO approved ....");
        } else if(nextApprover!=null) {
            nextApprover.processRequest(leaveDays);
        } else{
            System.out.println("Application Rejected");
        }
    }
}
