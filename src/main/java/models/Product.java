package models;

import java.io.Serializable;
import java.math.BigDecimal;

// TODO: Fix imports
import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "TB_PRODUCT")
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private BigDecimal quantity;
    private BigDecimal price;
}
