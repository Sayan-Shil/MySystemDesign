package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.TraditionalWay;

public class SeniorPatient extends Patient {
    @Override
    public void diagnose() {
        System.out.println("Senior Patient is diagnosing ......");
    }

    @Override
    public void billing() {
        System.out.println("Senior Patient is billing ...... 35% Bill Off");
    }
}
