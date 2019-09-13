package org.launchcode.models;



import org.launchcode.models.data.CheeseDao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    // Fields: ID, NAME
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    // Getters and Setters: ID, NAME
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructors: Default, ID, NAME
    public Category (){

    }

    public Category(int id) {
        this.id = id;
    }

    public Category(String name) {
        this.name = name;
    }
}
