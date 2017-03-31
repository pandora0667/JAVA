package HashMap;
import java.util.HashMap;

/**
 * Created by seongwonlee on 2017. 3. 24..
 */
public class Capital {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("영국", "런던");
        hashMap.put("캐나다", "오타와");
        hashMap.put("스위스", "베른");




//        Set<String> keySet = hashMap.keySet();
//        Iterator<String> keyIterator = keySet.iterator();
//        while (keyIterator.hasNext()) {
//            String key = keyIterator.next();
//            String value = hashMap.get(key);
//
//            System.out.println("Key : " + key + " Value : " + value);
//        }


        System.out.println(hashMap.get(args[0]));

    }
}
