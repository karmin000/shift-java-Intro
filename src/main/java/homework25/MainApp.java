package homework25;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Transformer robotViktor = new Autobot("Viktor", "Autobots");
        Transformer robotYaroslav = new Decepticon("Yaroslav", "Decepticon");

        System.out.println("\n=== Transformers list ===");
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(robotViktor);
        transformers.add(robotYaroslav);

        for (Transformer transformer : transformers) {
            System.out.println("--- " + transformer.getName() + " ---");
            if (transformer instanceof Action) {
                Action actionTransformer = (Action) transformer;
                actionTransformer.run();
                actionTransformer.fire();
                actionTransformer.charge();
            }
            transformer.transform();
            transformer.showInfo();
            System.out.println();
        }
    }
}
