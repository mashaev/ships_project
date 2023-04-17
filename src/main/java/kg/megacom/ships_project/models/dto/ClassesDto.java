package kg.megacom.ships_project.models.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ClassesDto {

    @JsonProperty("class_names")
    List<String> classNames;
}




