package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.TraditionalWay;

public class LeaveRequest {

    int leaveDays;

    public LeaveRequest(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public void sendLeaveRequest(){
        if(leaveDays<=3){
            System.out.println("Manager approved");
        } else if(leaveDays<=5){
            System.out.println("Business Manager approved");
        } else if(leaveDays<=7){
            System.out.println("Supervisor Manager approved");
        }  else if(leaveDays<=14){
            System.out.println("Director approved");
        } else if(leaveDays<=21){
            System.out.println("CEO approved");
        } else{
            System.out.println("Application Rejected");
        }
    }

}
