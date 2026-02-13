package fr.epita.assistants.yakamon.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "player")
public class player extends PanacheEntity
{
    public String name;
    public int x;
    public int y;
    public LocalDateTime lastAction;

    public player() {}

}
