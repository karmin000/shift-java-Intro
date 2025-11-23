package homework24;

public class Autobot extends Transformer{

    private String teamName;
    private final static String eyeColor = "Blue";
    private boolean kindness = true;

    Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " is transforming to bus");
    }

    @Override
    public void showInfo() {
        System.out.println("---Autobot properties---");
        System.out.println("Name is " + name);
        System.out.println("Team is " + teamName);
        System.out.println(kindness ? "Kind" : "Evil");
        System.out.println("Eye color is " + eyeColor);
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

}
