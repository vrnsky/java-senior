package me.vrnsky.patterns.Prototype;

public class Blueprint implements Prototypeable<Blueprint> {

    private long id;
    private String name;

    public Blueprint(long id, final String name) {
        this.id = id;
        this.name = name;
    }

    private Blueprint(Blueprint blueprint) {
        this.id = blueprint.getId();
        this.name = blueprint.getName();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Blueprint prototype() {
        return new Blueprint(this);
    }
}
