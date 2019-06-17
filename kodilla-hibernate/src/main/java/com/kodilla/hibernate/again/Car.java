package com.kodilla.hibernate.again;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedQuery(
        name = "Car.selectAll",
        query = "from Car where carFactory = :parametr"
)
@Entity
@Table(name = "car")
public class Car {
    private int id;
    private String carFactory;
    private List<Model> modelList = new ArrayList<>();

    public Car() {

    }

    public Car(String carFactory) {
        this.carFactory = carFactory;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "car_id",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "car_factory")
    public String getCarFactory() {
        return carFactory;
    }
    @OneToMany(
            targetEntity = Model.class,
            mappedBy = "car",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Model> getModelList() {
        return modelList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setCarFactory(String carFactory) {
        this.carFactory = carFactory;
    }

    private void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }
}
