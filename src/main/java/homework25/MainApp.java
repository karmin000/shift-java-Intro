package homework25;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Transformer robotViktor = new Autobot("Viktor", "Autobots");
        Transformer robotYaroslav = new Decepticon("Yaroslav", "Decepticons");

        System.out.println("\n=== Transformers list ===");
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(robotViktor);
        transformers.add(robotYaroslav);

        for (Transformer transformer : transformers) {
            System.out.println("\n--- " + transformer.getName() + " ---");

            transformer.run();
            transformer.fire();
            transformer.charge();
            transformer.transform();
            transformer.showInfo();
        }
    }
}
