package fr.epita.assistants.yakamon.domain.service;


import com.google.inject.Inject;
import fr.epita.assistants.yakamon.data.model.gameModel;
import fr.epita.assistants.yakamon.data.model.itemModel;
import fr.epita.assistants.yakamon.data.model.playerModel;
import fr.epita.assistants.yakamon.data.repository.*;
import fr.epita.assistants.yakamon.utils.tile.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class gameService
{
    @Inject
    playerRepository playerRepo;
    @Inject
    yakamonRepository yakamonRepo;
    @Inject
    itemRepository itemRepo;
    @Inject
    gameRepository gameRepo;
    @Inject
    yakadexRepository yakadexRepo;

    @Transactional
    public List<List<TileType>> startGame(String mapPath, String playerName) throws Exception {
        // reset
        yakadexRepo.update("caught = false");
        playerRepo.deleteAll();
        yakamonRepo.deleteAll();
        itemRepo.deleteAll();
        gameRepo.deleteAll();

        // creation de player
        playerModel player = new playerModel();
        player.setUuid(UUID.randomUUID());
        player.setName(playerName);
        player.setPosX(0);
        player.setPosY(0);
        player.setLastMove(null);
        player.setLastCatch(null);
        player.setLastCollect(null);
        player.setLastFeed(null);
        playerRepo.persist(player);

        // start 5 Yakaballs
        itemModel yakaballs = new itemModel();
        yakaballs.setId(1);
        yakaballs.setType(ItemType.YAKABALL);
        yakaballs.setQuantity(5);
        itemRepo.persist(yakaballs);

        // parsing de la carte
        String content = Files.readString(Paths.get(mapPath));
        String dbMap = content.replace("\r", "").replace("\n", ";");

        gameModel game = new gameModel();
        game.setId(1);
        game.setMap(dbMap);
        gameRepo.persist(game);

        return parseMap(dbMap);
    }

    private List<List<TileType>> parseMap(String dbMap) {
        List<List<TileType>> mapTiles = new ArrayList<>();
        String[] rows = dbMap.split(";");

        for (String row : rows) {
            if (row.isEmpty()) continue;
            List<TileType> rowTiles = new ArrayList<>();
            int i = 0;
            while (i < row.length()) {
                int count = row.charAt(i) - '0';
                char terrainChar = row.charAt(i + 1);
                char collectibleChar = row.charAt(i + 2);

                TerrainType terrain = getTerrain(terrainChar);
                Collectible collectible = getCollectible(collectibleChar);

                for (int c = 0; c < count; c++) {
                    TileType tile = new TileType();
                    tile.terrainType = terrain;
                    tile.collectible = collectible;
                    rowTiles.add(tile);
                }
                i += 3;
            }
            mapTiles.add(rowTiles);
        }
        return mapTiles;
    }

    private TerrainType getTerrain(char c) {
        switch (c) {
            case 'G': return TerrainType.GRASS;
            case 'W': return TerrainType.WATER;
            case 'S': return TerrainType.SAND;
            case 'M': return TerrainType.MOUNTAIN;
            case 'R': return TerrainType.ROCK;
            case 'L': return TerrainType.LAVA;
            default: return TerrainType.GRASS;
        }
    }

    private Collectible getCollectible(char c) {
        if (c == 'N') return null;

        Collectible col = new Collectible();
        if (c == 'S') {
            col.type = CollectibleType.ITEM;
            col.value = "SCROOGE";
        } else if (c == 'Y') {
            col.type = CollectibleType.ITEM;
            col.value = "YAKABALL";
        } else {
            col.type = CollectibleType.YAKAMON;
            col.value = getYakamonName(c);
        }
        return col;
    }

    private String getYakamonName(char c) {
        switch (c) {
            case 'y': return "Yakimon";
            case 'n': return "Nicotali";
            case 'o': return "Louicune";
            case 'g': return "Grouvan";
            case 'b': return "Bastiedon";
            case 'l': return "Lucarya";
            case 'r': return "Rayquaïssa";
            case 'k': return "Koyako";
            default: return "Yakimon";
        }
    }




}
