package project03.conan.practice.team.domain;

public class PC implements Equipments {
    private String bandName;
    private String type;

    @Override
    public void helpWork() {

    }

    public PC() {
    }

    public PC(String bandName, String type) {
        this.bandName = bandName;
        this.type = type;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
