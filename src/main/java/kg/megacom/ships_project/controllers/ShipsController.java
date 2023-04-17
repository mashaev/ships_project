package kg.megacom.ships_project.controllers;

import kg.megacom.ships_project.models.dto.ClassesDto;
import kg.megacom.ships_project.services.ShipsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ships")
public class ShipsController {
private final ShipsService shipsService;

    public ShipsController(ShipsService shipsService) {
        this.shipsService = shipsService;
    }

    @GetMapping("/get/names")
    public ResponseEntity<ClassesDto> getClassNames(@RequestParam String battle_result){



        return ResponseEntity.ok( shipsService.getClassNames(battle_result));

    }
}
