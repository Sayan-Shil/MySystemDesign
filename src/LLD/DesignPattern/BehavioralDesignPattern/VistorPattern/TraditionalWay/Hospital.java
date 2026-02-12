package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.TraditionalWay;

public class Hospital {

    public void diagnosis(Patient patient) {
        patient.diagnose();
    }
    public void billing(Patient patient) {
        patient.billing();
    }

    static void main() {
        ChildPatient childPatient = new ChildPatient();
        AdultPatient adultPatient= new AdultPatient();

        Hospital hospital = new Hospital();
        hospital.diagnosis(childPatient);
        hospital.billing(adultPatient);
    }
}
