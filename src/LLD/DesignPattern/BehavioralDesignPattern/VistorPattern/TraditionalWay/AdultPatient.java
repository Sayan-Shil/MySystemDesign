package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.TraditionalWay;

public class AdultPatient extends Patient {
    @Override
    public void diagnose() {
        System.out.println("Adult Patient is diagnosing ......");
    }

    @Override
    public void billing() {
        System.out.println("Adult Patient is billing ...... 12% Bill Off");
    }
}
