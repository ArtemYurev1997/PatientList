package by.pvy.patientlist;

import java.util.ArrayList;
import java.util.List;
//import java.util.HashSet;
import java.util.Objects;

public class Department {
    private String nameOfDepartment;
    private List<Ward> wardSet = new ArrayList<>();

    public Department(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameOfDepartment='" + nameOfDepartment + '\'' +
                ", wardSet=" + wardSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(nameOfDepartment, that.nameOfDepartment) && Objects.equals(wardSet, that.wardSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDepartment, wardSet);
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public List<Ward> getWardSet() {
        return wardSet;
    }

    public void setWardSet(List<Ward> wardSet) {
        this.wardSet = wardSet;
    }

    public void addWard(Ward ward) {
        getWardSet().add(ward);
    }

    public  void countOfMen(List<Patient> patient) {
        List<Patient> men = new ArrayList<>();
        for (int i =0; i < patient.size(); i++) {
            if (patient.get(i).getSex().equals(Sex.MAN)) {
                men.add(patient.get(i));
            }
        }
        System.out.println(men.size());
    }
        public  void countOfWomen(List<Patient> patient) {
            List<Patient> women = new ArrayList<>();
            for (int i =0; i < patient.size(); i++) {
                if (patient.get(i).getSex().equals(Sex.WOMAN)) {
                    women.add(patient.get(i));
                }
            }
            System.out.println(women.size());
        }
}
