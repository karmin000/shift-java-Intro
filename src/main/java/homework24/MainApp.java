package homework24;

public class MainApp {
    public static void main(String[] args) {
        Transformer robotViktor = new Autobot("Viktor", "Autobots");
        Scenario(robotViktor);

        System.out.println();

        Transformer robotYaroslav = new Decepticon("Yaroslav", "Decepticon");
        Scenario(robotYaroslav);

    }

    public static void Scenario(Transformer transformer) {
        transformer.run();
        transformer.fire();
        transformer.charge();
        transformer.showInfo();
    }
}
