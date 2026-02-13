package fr.epita.assistants.yakamon.presentation.api.response;

import fr.epita.assistants.yakamon.utils.tile.TileType;

import java.util.List;

public class startResponse
{
    public List<List<TileType>> tiles;

    public startResponse() {}

    public startResponse(List<List<TileType>> tiles) {
        this.tiles = tiles;
    }

    public List<List<TileType>> getTiles()
    {
        return tiles;
    }
    public void setTiles(List<List<TileType>> tiles)
    {
        this.tiles = tiles;
    }

}
