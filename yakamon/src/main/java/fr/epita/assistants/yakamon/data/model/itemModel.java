package fr.epita.assistants.yakamon.data.model;

import fr.epita.assistants.yakamon.utils.tile.ItemType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class itemModel extends PanacheEntityBase
{
    @Id
    public Integer id;

    @Enumerated(EnumType.STRING)
    public ItemType type;

    public Integer quantity;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public ItemType getType()
    {
        return type;
    }
    public void setType(ItemType type)
    {
        this.type = type;
    }
    public Integer getQuantity()
    {
        return quantity;
    }
    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
}
