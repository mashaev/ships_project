package kg.megacom.ships_project.repositories;

import kg.megacom.ships_project.models.Ships;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShipsRepo extends JpaRepository<Ships,String> {

   List<Ships> findAll();
@Query(value = "select s.className.name\n" +
        "from Ships s join Outcomes o  on s.name=o.ship where o.result =?1 ")
   List<String> getShipsClassNames(String sunk);

}
