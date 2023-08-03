package project03.conan.practice.team.domain;

public class NoteBook implements Equipments{

    private String bandName;
    private String type;

    public NoteBook() {
    }

    public NoteBook(String bandName, String type) {
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

    @Override
    public void helpWork() {

    }
}