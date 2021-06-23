package models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "person")
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    private int age;

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        autos = new ArrayList<Auto>();
    }

    public void addAuto(@NotNull Auto auto){
        auto.setPerson(this);
        autos.add(auto);
    }

    public void removeAuto(Auto auto){
        autos.remove(auto);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", autos=" + autos +
                '}';
    }
}


