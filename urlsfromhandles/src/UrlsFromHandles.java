import java.util.ArrayList;
import java.util.Arrays;

public class UrlsFromHandles {
    public static void main(String[] args) {
        // Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
        // GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

        // example:
        // input: ["ghhandle1", "ghhandle2"]
        // output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]
        ArrayList<String> names = new ArrayList<>(Arrays.asList("ghhandle1", "ghhandle2"));
        System.out.println(urlsFromHandles(names));
    }

    public static ArrayList<String> urlsFromHandles(ArrayList<String> nameInput) {
        for (int i = 0; i < nameInput.size(); i++) {
            nameInput.set(i, "https://github.com/greenfox-academy/" + nameInput.get(i));
        }
        return nameInput;
    }
}
