package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.TraditionalWay;

public class Employee {
    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest(11);
        leaveRequest.sendLeaveRequest();
    }
}
