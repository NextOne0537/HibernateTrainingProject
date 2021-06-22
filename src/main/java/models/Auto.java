package models;

import javax.persistence.*;

@Entity
@Table (name = "autos")
public class Auto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int auto_id;

    private String model;
    private String color;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "user_id")
    private Person person;

    public Auto(){

    }

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }
//12
    public int getId() {
        return auto_id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Person getPerson() {
        return person;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return color+" "+ person;
    }
}
