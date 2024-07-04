package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
public class Application {

    List<String> messages;

    public int countWords(String words){
        String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }
    public Application() {
        System.out.println ("Inside Application");
        messages = new ArrayList<String>();

        messages.add("Hello");
        messages.add("World");

        for (String message : messages){
            System.out.println(message);
        }
        String words =  "Word1 Word2 Word3";
        System.out.println("The number of words in " + words + " is " + countWords(words));
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
    }
}