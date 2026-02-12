package LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility;

import LLD.DesignPattern.BehavioralDesignPattern.ChainOfResponsibility.ChainOfResponsibility.Chain.*;

public class Employee {
    static void main() {
        Approver manager = new Manager();
        Approver businessManager = new BusinessManager();
        Approver director = new Director();
        Approver supervisor = new Supervisor();
        Approver ceo = new CEO();

        manager.setNextApprover(businessManager);
        businessManager.setNextApprover(director);
        director.setNextApprover(supervisor);
        supervisor.setNextApprover(ceo);

        LeaveRequest leaveRequest = new LeaveRequest(4,manager);
        leaveRequest.processLeaveRequest();

    }
}
