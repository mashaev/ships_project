package kg.megacom.ships_project.models;



import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name = "classes")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classes {
    @Id
    @Column(name = "class_name",length = 50)
    String name;
    @Column(length = 2)
    String type;
    @Column(length = 20)
    String country;
    @Column(name = "num_guns")
    Short numGuns;
    Float bore;
    Integer displacement;




}
