package by.pvy.patientlist;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Alexey", "Gubanov", "SRT", 30, Sex.MAN);
        Patient patient2 = new Patient(2, "Anton", "Lapenko", "RKM", 36, Sex.MAN);
        Patient patient3 = new Patient(3, "Yuliya", "Antonova", "SRT", 64, Sex.WOMAN);
        Patient patient4 = new Patient(4, "Anna", "Trusova", "RKM", 45, Sex.WOMAN);
        Patient patient5 = new Patient(5, "Elena", "Omarova", "SRT", 38, Sex.WOMAN);
        Patient patient6 = new Patient(6, "Nika", "Lebedeva", "RKM", 22, Sex.WOMAN);

        Ward ward1 = new Ward(1);
        ward1.addPatient(patient1);
        ward1.addPatient(patient2);
        ward1.addPatient(patient3);
        System.out.println(ward1);

        Ward ward2 = new Ward(2);
        ward2.addPatient(patient4);
        ward2.addPatient(patient5);
        ward2.addPatient(patient6);
        System.out.println(ward2);

        ward1.addPatientForDiagnose(ward1.getPatientList());
        ward2.addPatientForDiagnose(ward2.getPatientList());




        ward1.collectionUp(patient2, patient3, patient1);
        ward2.collectionUp(patient6, patient4, patient5);
        System.out.println(ward1.countPatients());
        System.out.println(ward2.countPatients());

        Department department = new Department("Cardiology");
        department.addWard(ward1);
        department.addWard(ward2);
        System.out.println(department);

        department.countOfMen(ward1.getPatientList());
        department.countOfWomen(ward1.getPatientList());
        department.countOfMen(ward2.getPatientList());
        department.countOfWomen(ward2.getPatientList());
    }
}
