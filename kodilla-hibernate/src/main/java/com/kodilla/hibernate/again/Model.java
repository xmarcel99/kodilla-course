package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "model")
public class Model {
    private int id;
    private String name;
    private Car car;

    public Model(String name) {
        this.name = name;
    }
    public Model() {

    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "model_id",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "model_name")
    public String getName() {
        return name;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    public Car getCar() {
        return car;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
