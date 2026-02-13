package fr.epita.assistants.yakamon.data.repository;

import fr.epita.assistants.yakamon.data.model.yakaDexModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class yakadexRepository implements PanacheRepositoryBase<yakaDexModel, Integer> {
}


