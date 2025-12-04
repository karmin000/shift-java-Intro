package homework25;

public abstract class Transformer {
    protected String name;

    Transformer(String name) {
        this.name = name;
    }

    public abstract void transform();

    public void showInfo() {
        System.out.println("---Transformer properties---");
        System.out.println("Name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
