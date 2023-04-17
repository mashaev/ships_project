package kg.megacom.ships_project.repositories;

import kg.megacom.ships_project.models.Outcomes;
import kg.megacom.ships_project.models.OutcomesID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OutcomesRepo extends JpaRepository<Outcomes, OutcomesID> {

    List<Outcomes> findAll();
}
