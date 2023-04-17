package kg.megacom.ships_project.services.impl;

import kg.megacom.ships_project.models.dto.ClassesDto;
import kg.megacom.ships_project.repositories.ShipsRepo;
import kg.megacom.ships_project.services.ShipsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShipsServiceImpl implements ShipsService {

    private final ShipsRepo shipsRepo;

    public ShipsServiceImpl(ShipsRepo shipsRepo) {
        this.shipsRepo = shipsRepo;
    }

    @Override
    public ClassesDto getClassNames(String sunk) {

        ClassesDto classes2Dto = new ClassesDto();
        List<String> list= shipsRepo.getShipsClassNames(sunk);
        classes2Dto.setClassNames(list);
        return classes2Dto;
    }
}
