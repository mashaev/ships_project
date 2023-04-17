package kg.megacom.ships_project.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "outcomes")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(OutcomesID.class)
public class Outcomes {
    @Id
    
    @Column(length = 50)
    String ship ;
    @Id

   String battle ;
    
    @Column(length = 10)
    String result ;
}
