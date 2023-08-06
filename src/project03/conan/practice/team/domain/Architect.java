package project03.conan.practice.team.domain;

public class Architect extends Designer {
    private String stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, String stock, Equipments equipments) {
        super(id, name, age, salary, bonus, equipments);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString() + "Architect{" +
                "stock='" + stock + '\'' +
                '}';
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
