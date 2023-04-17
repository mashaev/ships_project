package kg.megacom.ships_project.repositories;

import kg.megacom.ships_project.models.Battles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BattlesRepo extends JpaRepository<Battles,String> {
    List<Battles> findAll();
}
