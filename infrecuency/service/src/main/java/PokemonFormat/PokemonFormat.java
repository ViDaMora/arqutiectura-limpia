package PokemonFormat;

public class PokemonFormat {

    private Long id;
    private String name;
    private String element;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "PokemonFormat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", element='" + element + '\'' +
                '}';
    }
}
