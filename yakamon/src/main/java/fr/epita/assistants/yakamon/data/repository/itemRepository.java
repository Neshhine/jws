package fr.epita.assistants.yakamon.data.repository;

import fr.epita.assistants.yakamon.data.model.itemModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class itemRepository implements PanacheRepositoryBase<itemModel, Integer> {
}

