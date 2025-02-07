package day11;

public class topic {
    private String id;
    private String name;
    private String Description;

    public topic() {
    }

    public topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
