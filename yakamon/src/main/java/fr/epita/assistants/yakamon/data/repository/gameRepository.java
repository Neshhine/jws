package fr.epita.assistants.yakamon.data.repository;

import fr.epita.assistants.yakamon.data.model.gameModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class gameRepository implements PanacheRepositoryBase<gameModel, Integer> {
}
