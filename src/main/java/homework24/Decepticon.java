package homework24;

public class Decepticon extends Transformer{

    private String teamName;
    private final static String eyeColor = "Red";
    private boolean kindness = false;

    Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        String[] forms = {"ground vehicle", "air vehicle", "weapon", "machine"};
        int index = (int) (Math.random() * forms.length);
        System.out.println(name + " is transforming to " + forms[index]);
    }

    @Override
    public void showInfo() {
        System.out.println("---Decepticon properties---");
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
