package fr.epita.assistants.yakamon.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class gameModel extends PanacheEntityBase
{
    @Id
    public Integer id;
    public String map;
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getMap()
    {
        return map;
    }
    public void setMap(String map)
    {
        this.map = map;
    }
}



