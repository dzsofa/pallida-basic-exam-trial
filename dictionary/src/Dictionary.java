import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dictionary {
    static Map<String, String> map;

    public static void main(String[] args) {
        map = new HashMap<String, String>();
        map.put("alma", "apple");
        map.put("fa", "tree");

        //adding new key-value pair to hashmap
        addWord("kenyer", "bread");
        System.out.println(Arrays.asList(map));
        System.out.println();

        //removing entry from hashmap
        removeWord("fa");
        System.out.println(Arrays.asList(map));
        System.out.println();

        //translate from English to Hungarian
        System.out.println(translateToHun("apple"));
        System.out.println();

        //translate from Hungarian to English
        System.out.println(translateToEng("alma"));
        System.out.println();
    }

    // Implement this method. It should add the given key-value pair to the the map
    public static void addWord(String hunWord, String engWord) {
        map.put(hunWord, engWord);
    }

    // Implement this method. It should remove the key-value pair by the given key from the map
    public static void removeWord(String hunWord) {
        map.remove(hunWord);

    }

    // Implement these methods. They should return the translation of the given word from the map
    public static String translateToHun(String engWord) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(engWord, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static String translateToEng(String hunWord) {
        String key = "";
        key = map.get(hunWord);
        return key;
    }
}
