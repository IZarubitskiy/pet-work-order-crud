package levare.hultic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Equipment {
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
