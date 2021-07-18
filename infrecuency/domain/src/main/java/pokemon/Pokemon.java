package pokemon;

import javax.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "element", nullable = false, unique = true)
    private String element;

    public Pokemon() {
    }

    public Pokemon(String name, String element) {
        this.name = name;
        this.element = element;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", element='" + element + '\'' +
                '}';
    }
}
