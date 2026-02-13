package fr.epita.assistants.yakamon.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "yakamon")
public class yakamon extends PanacheEntity
{
    public String name;
    public String type;
    public int level;
    public Long trainerId;

    public yakamon() {}

    public yakamon(String name, String type, int level, Long trainerId)
    {
        this.name = name;
        this.type = type;
        this.level = level;
        this.trainerId = trainerId;
    }
}


