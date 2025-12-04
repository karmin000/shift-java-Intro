package homework25;

public interface Action {
    void fire();
    void charge();

    default void run() {
        System.out.println("Running...");
    }
}
