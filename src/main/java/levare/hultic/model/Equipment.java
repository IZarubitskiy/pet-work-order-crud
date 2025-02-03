package levare.hultic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder

public class Equipment {

    @Id
    @GeneratedValue
    private Long id;

    private Long partNumber;
    private String serialNumber;
    private String description;
    private Status status;
    private Type type;
    private ProductLine productLine;
    private Condition condition;
    private Client owner;
}
