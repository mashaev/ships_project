package kg.megacom.ships_project.controllers;

import kg.megacom.ships_project.models.dto.ClassesDto;
import kg.megacom.ships_project.services.ClassesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classes")
public class ClassesController {
private final ClassesService classesService;

    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

//Метод запрос
    //http://localhost:8080/classes/get/v1/names?battle_result=sunk
    @GetMapping("/get/v1/names")
    public ResponseEntity<ClassesDto> getClassNames(@RequestParam String battle_result){



        return ResponseEntity.ok( classesService.getClassNames(battle_result));

    }
//Нативный запрос в базуданных
    //http://localhost:8080/classes/get/v2/names?battle_result=sunk
    @GetMapping("/get/v2/names")
    public ResponseEntity<ClassesDto> getNative(@RequestParam String battle_result){



        return ResponseEntity.ok( classesService.nativeQuery(battle_result));

    }
}
