package hashmap_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tester {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
      Map<String, Integer> mergedMap = new HashMap<>();
      for (String key : mapOne.keySet()) {
          if (mapTwo.containsKey(key)) {
              mergedMap.put(key , mapTwo.get(key));
              mapTwo.remove(key);
          } else {
              mergedMap.put(key, mapOne.get(key));
          }
      }
      mergedMap.putAll(mapTwo);
      return mergedMap;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);
		
		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Andy", 45);
		
		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		Map<String, Integer> mapThree = new HashMap<String, Integer>();
      mapThree.put("Toby", 15);
      mapThree.put("Micheal", 20);
      mapThree.put("Angela", 30);
		
		Map<String, Integer> mapFour = new HashMap<String, Integer>();
      mapFour.put("Toby", 15);
      mapFour.put("Andy", 45);
      mapFour.put("Micheal", 40);
		
		Map<String, Integer> mergedMap2 = mergeMaps(mapThree, mapFour);

		System.out.println("Merged Map\n===========");
		for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		System.out.println("\nMerged Map 2\n=========");
		for (Map.Entry<String, Integer> entry2 : mergedMap2.entrySet()) {
			System.out.println(entry2.getKey()+" = "+entry2.getValue());
		}
	
	}
}
