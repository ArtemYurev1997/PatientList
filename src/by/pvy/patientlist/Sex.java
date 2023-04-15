package by.pvy.patientlist;

public enum Sex {
    MAN("Мan"),
    WOMAN("Woman");

    private String isSex;
    Sex(String isSex) {
        this.isSex = isSex;
    }

    public String getIsSex() {
        return isSex;
    }
}
