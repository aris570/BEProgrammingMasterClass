package jpa_exercise.model;


import javax.persistence.*;

//TODO make the product entity
//TODO map this class to table named PRODUCTS_EX
//TODO make the id field autogenerated from the database
@Entity
@Table(name="PRODUCTS_EX")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("id: " + id);
        builder.append(", name: " + name);
        builder.append(", description: " + description);

        return builder.toString();
    }
}