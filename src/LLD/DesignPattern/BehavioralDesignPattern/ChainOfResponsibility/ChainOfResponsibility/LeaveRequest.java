package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility;

import LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain.Approver;

public class LeaveRequest {
    int days;
    Approver approver;

    public LeaveRequest(int days, Approver approver) {
        this.days = days;
        this.approver = approver;
    }

    public void processLeaveRequest() {
        approver.processRequest(days);
    }
}
