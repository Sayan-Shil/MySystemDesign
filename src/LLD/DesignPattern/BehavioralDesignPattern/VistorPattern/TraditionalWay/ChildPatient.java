package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.TraditionalWay;

public class ChildPatient extends Patient {
    @Override
    public void diagnose() {
        System.out.println("Child Patient is diagnosing ......");
    }

    @Override
    public void billing() {
        System.out.println("Child Patient is billing ...... 45% Bill Off");
    }
}
