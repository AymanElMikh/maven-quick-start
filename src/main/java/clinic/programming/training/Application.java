package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<String> messages;
    public Application() {
        System.out.println ("Inside Application");
        messages = new ArrayList<String>();

        messages.add("Hello");
        messages.add("World");

        for (String message : messages){
            System.out.println(message);
        }

    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
    }
}