package fr.epita.assistants.yakamon.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "yakamon")
public class yakamonModel extends PanacheEntityBase
{
    @Id
    public UUID uuid;

    @Column(length = 20)
    public String nickname;

    @Column(name = "energy_points")
    public Integer energyPoints;

    @Column(name = "yakadex_id")
    public Integer yakadexId;

    public UUID getUuid()
    {
        return uuid;
    }

    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }
    public String getNickname()
    {
        return nickname;
    }
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public Integer getEnergyPoints()
    {
        return energyPoints;
    }
    public void setEnergyPoints(Integer energyPoints)
    {
        this.energyPoints = energyPoints;
    }
    public Integer getYakadexId()
    {
        return yakadexId;
    }
    public void setYakadexId(Integer yakadexId)
    {
        this.yakadexId = yakadexId;
    }

}
