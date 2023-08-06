package project03.conan.practice.team.domain;

public class Equipments implements EquipmentFunction {
    private String bandName;
    private String model;

    public Equipments() {
    }

    public Equipments(String bandName, String model) {
        this.bandName = bandName;
        this.model = model;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void helpWork() {

    }

    @Override
    public String getDescription() {
        return getBandName() + "(" + getModel() + ")";
    }
}
