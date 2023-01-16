package models;
// TODO: Fix imports
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "TB_PRODUCT")
public class Product implements Serializable{
    private long id;
    private String name;
    private BigDecimal quantity;
    private BigDecimal price;
}
