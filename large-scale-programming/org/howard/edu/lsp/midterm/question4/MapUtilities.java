import java.util.HashMap;

public class MapUtilities {
    // Static method to count common key/value pairsMapU
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {

        int commonPairs = 0; //set matching pairs to 0

        // go through hashmap
        for (String key : map1.keySet()) {
            // Check for matching key value pairs
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonPairs++;
            }
        }

        return commonPairs;
    }
}

