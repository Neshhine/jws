package fr.epita.assistants.yakamon.data.repository;

import fr.epita.assistants.yakamon.data.model.playerModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class playerRepository implements PanacheRepositoryBase<playerModel, UUID> {
}
