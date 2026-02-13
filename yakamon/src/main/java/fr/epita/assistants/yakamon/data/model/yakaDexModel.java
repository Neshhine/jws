package fr.epita.assistants.yakamon.data.model;

import fr.epita.assistants.yakamon.utils.ElementType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "yakadex_entry")
public class yakaDexModel extends PanacheEntityBase
{
    @Id
    public Integer id;

    @Column(length = 20)
    public String name;

    public Boolean caught;

    @Enumerated(EnumType.STRING)
    @Column(name = "first_type")
    public ElementType firstType;

    @Enumerated(EnumType.STRING)
    @Column(name = "second_type")
    public ElementType secondType;

    public String description;

    @Column(name = "evolution_id")
    public Integer evolutionId;

    @Column(name = "evolve_threshold")
    public Integer evolveThreshold;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id; }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Boolean getCaught()
    {
        return caught;
    }
    public void setCaught(Boolean caught)
    {
        this.caught = caught;
    }
    public ElementType getFirstType()
    {
        return firstType;
    }
    public void setFirstType(ElementType firstType)
    {
        this.firstType = firstType;
    }
    public ElementType getSecondType()
    {
        return secondType;
    }
    public void setSecondType(ElementType secondType)
    {
        this.secondType = secondType;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public Integer getEvolutionId()
    {
        return evolutionId;
    }
    public void setEvolutionId(Integer evolutionId)
    {
        this.evolutionId = evolutionId;
    }
    public Integer getEvolveThreshold()
    {
        return evolveThreshold;
    }
    public void setEvolveThreshold(Integer evolveThreshold)
    {
        this.evolveThreshold = evolveThreshold;
    }


}
