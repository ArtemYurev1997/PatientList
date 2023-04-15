package by.pvy.patientlist;

import java.util.Comparator;
import java.util.Objects;

public class Patient implements Comparable<Patient> {
    private int id;
    private String name;
    private String surname;
    private String diagnose;
    private int age;
    private Sex sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(diagnose, patient.diagnose) && sex == patient.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, diagnose, age, sex);
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Patient(int id, String name, String surname, String diagnose, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnose = diagnose;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int compareTo(Patient o) {
        return getName().compareTo(o.getName());
    }

    static class ComparatorById implements Comparator<Patient> {
        @Override
        public int compare(Patient o1, Patient o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }
}
