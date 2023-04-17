package kg.megacom.ships_project.services.impl;

import kg.megacom.ships_project.models.Classes;
import kg.megacom.ships_project.models.Outcomes;
import kg.megacom.ships_project.models.Ships;
import kg.megacom.ships_project.models.dto.ClassesDto;
import kg.megacom.ships_project.repositories.ClassesRepo;
import kg.megacom.ships_project.repositories.OutcomesRepo;
import kg.megacom.ships_project.repositories.ShipsRepo;
import kg.megacom.ships_project.services.ClassesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {
    private final ClassesRepo classesRepo;
    private final OutcomesRepo outcomesRepo;
    private final ShipsRepo shipsRepo;


    public ClassesServiceImpl(ClassesRepo classesRepo, OutcomesRepo outcomesRepo, ShipsRepo shipsRepo) {
        this.classesRepo = classesRepo;
        this.outcomesRepo = outcomesRepo;
        this.shipsRepo = shipsRepo;
    }



    @Override
    public ClassesDto nativeQuery(String sunk) {
        System.out.println("request:" +sunk);
        List<String> list= classesRepo.nativeQuery(sunk);
        ClassesDto classes2Dto = new ClassesDto();
        classes2Dto.setClassNames(list);

        return   classes2Dto;
    }
        @Override
    public ClassesDto getClassNames(String sunk) {

        ClassesDto classes2Dto = new ClassesDto();
        List<String> list = new ArrayList<>();
         List<Classes> classes  = classesRepo.findAll();
        List<Outcomes> outcomes =  outcomesRepo.findAll();
            List<Ships> ships =     shipsRepo.findAll();

        classes.stream().forEach(c->{
            outcomes.stream().forEach(o->{
                if( c.getName().equalsIgnoreCase(o.getShip()) && o.getResult().equalsIgnoreCase( sunk ) ){
                    System.out.println("result:" + c.getName());

                        list.add(c.getName());



                }
            });
        });
            ships.stream().forEach(s->{
                outcomes.stream().forEach(o->{
                    if( s.getName().equalsIgnoreCase(o.getShip()) && o.getResult().equalsIgnoreCase( sunk ) ){
                        System.out.println("resultships:" + s.getClassName().getName());

                        list.add(s.getClassName().getName());



                    }
                });
            });

        classes2Dto.setClassNames(list);
        return classes2Dto;
    }

}
