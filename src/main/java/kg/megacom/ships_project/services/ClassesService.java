package kg.megacom.ships_project.services;

import kg.megacom.ships_project.models.dto.ClassesDto;

import java.util.List;

public interface ClassesService {
    ClassesDto nativeQuery(String sunk);

    ClassesDto getClassNames(String sunk);

}
