package kg.megacom.ships_project.repositories;

import kg.megacom.ships_project.models.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepo extends JpaRepository<Classes,String> {
    @Override
    List<Classes> findAll();

    @Query(value = "select c.name\n" +
            "from Classes c join Outcomes o  on c.name=o.ship where o.result =?1 ")
    List<String> getClassNames(String sunk);
    @Query(value = "select class_name\n" +
            "from classes  join outcomes  on classes.class_name=outcomes.ship where result=?1\n" +
            "union\n" +
            "select class_name\n" +
            "from ships join outcomes on ships.name=outcomes.ship where result=?1",nativeQuery = true)
    List<String> nativeQuery(String sunk);


}
