package fr.epita.assistants.yakamon.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "player")
public class playerModel extends PanacheEntityBase
{
    @Id
    public UUID uuid;

    @Column(length = 20)
    public String name;

    @Column(name = "pos_x")
    public Integer posX;

    @Column(name = "pos_y")
    public Integer posY;

    @Column(name = "last_move")
    public LocalDateTime lastMove;

    @Column(name = "last_catch")
    public LocalDateTime lastCatch;

    @Column(name = "last_collect")
    public LocalDateTime lastCollect;

    @Column(name = "last_feed")
    public LocalDateTime lastFeed;

    public UUID getUuid()
    {
        return uuid;
    }
    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getPosX()
    {
        return posX;
    }
    public void setPosX(Integer posX)
    {
        this.posX = posX;
    }
    public Integer getPosY()
    {
        return posY;
    }
    public void setPosY(Integer posY)
    {
        this.posY = posY;
    }
    public LocalDateTime getLastMove()
    {
        return lastMove;
    }
    public void setLastMove(LocalDateTime lastMove)
    {
        this.lastMove = lastMove;
    }
    public LocalDateTime getLastCatch()
    {
        return lastCatch;
    }
    public void setLastCatch(LocalDateTime lastCatch)
    {
        this.lastCatch = lastCatch;
    }
    public LocalDateTime getLastCollect()
    {
        return lastCollect;
    }
    public void setLastCollect(LocalDateTime lastCollect)
    {
        this.lastCollect = lastCollect;
    }
    public LocalDateTime getLastFeed()
    {
        return lastFeed;
    }
    public void setLastFeed(LocalDateTime lastFeed)
    {
        this.lastFeed = lastFeed;
    }
}