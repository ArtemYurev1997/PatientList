package by.pvy.patientlist;

import java.util.*;

public class Ward {
    private int number;
    private List<Patient> patientList = new ArrayList<>();
    private Sex type;

    @Override
    public String toString() {
        return "Ward{" +
                "number=" + number +
                ", patientList=" + patientList +
                '}';
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Ward(int number) {
        this.number = number;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ward ward = (Ward) o;
        return number == ward.number &&  Objects.equals(patientList, ward.patientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, patientList);
    }

    public void addPatient(Patient patient) {
        getPatientList().add(patient);
    }

    public void addPatientForDiagnose(List<Patient> patient) {
            List<Patient> patientsForDiagnose = new ArrayList<>();
            for(int i = 0; i < patient.size(); i++) {
            if (patient.get(i).getDiagnose().equals("SRT")) {
                patientsForDiagnose.add(patient.get(i));
            }
        }
        System.out.println(patientsForDiagnose);
    }

    public int countPatients() {
        return getPatientList().size();
    }

    public void collectionUp(Patient o1, Patient o2, Patient o3) {
        List<Patient> patientList = Arrays.asList(o1, o2, o3);
        Collections.sort(patientList, new Patient.ComparatorById());
        System.out.println(patientList);
    }
}
