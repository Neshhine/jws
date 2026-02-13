package fr.epita.assistants.yakamon.presentation.api.request;

public class startRequest
{
    public String mapPath;
    public String playerName;

    public String getMapPath()
    {
        return mapPath;
    }

    public void setMapPath(String mapPath)
    {
        this.mapPath = mapPath;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
}
