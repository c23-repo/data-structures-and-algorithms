package leftJoin;


import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public static ArrayList<Object> leftJoin(HashMap<String, String > hashMapA, HashMap<String, String > hashMapB) {

        ArrayList<Object> result = new ArrayList<>();
        ArrayList<String> subArray;

        // KeySet info from https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
        for (String key : hashMapA.keySet()){

            subArray = new ArrayList<String>();
            subArray.add(key);
            subArray.add(hashMapA.get(key));
            subArray.add(hashMapB.get(key));
            result.add(subArray);
        }

        return result;
    }
}
