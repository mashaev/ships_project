package kg.megacom.ships_project.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "ships")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ships {
    @Id
    @Column(length = 50)
    String name ;
    @ManyToOne
    @JoinColumn(name="class_name")
    Classes className ;
    Short launched;

    
}
