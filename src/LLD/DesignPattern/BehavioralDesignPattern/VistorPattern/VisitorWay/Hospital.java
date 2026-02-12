package LLD.DesignPattern.BehavioralDesignPattern.VistorPattern.VisitorWay;

public class Hospital {
    static void main() {
        // Create Arrays
        Patient[] patients = {
                new AdultPatient(),
                new SeniorPatient(),
                new ChildPatient(),
        };

        DiagnosisVisitor diagnosisVisitor = new DiagnosisVisitor();
        for (Patient patient : patients) {
        patient.accept(diagnosisVisitor);
        }
    }

}
