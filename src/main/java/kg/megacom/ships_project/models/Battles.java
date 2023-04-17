package kg.megacom.ships_project.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "battles")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Battles {
    @Id
    @Column(name = "class_name",nullable = false)
    String className ;
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    @Column(nullable = false)
    Date date;
}
