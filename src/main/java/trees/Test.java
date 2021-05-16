package trees;

import java.io.*;
import java.util.*;


public class Test {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Object obj = new Object();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Map<Integer, Object>> revMap = new HashMap<>();
        Map<Integer, Object> intWithSameFreq = new HashMap<>();

        List<Integer>  result = new ArrayList<>();

        for (List<Integer> list : queries)  {
            int operation = list.get(0);
            Integer data = list.get(1);
            if  (operation ==  1)  {

                //map.put(data, map.getOrDefault(data, 0)+1);
                Integer frequency = map.getOrDefault(data, 0);
                handleAddToFrequencyMap(data, frequency, revMap, obj);
                if (frequency !=  0) {
                    map.put(data, ++frequency);
                } else {
                    map.put(data, 1);
                }
            }
            if  (operation ==  2)  {
                Integer  frequency = map.getOrDefault(data, 0);
                handleRemoveToFrequencyMap(data, frequency, revMap, obj);
                if  (frequency == 1)  {
                    map.remove(data);
                } else if (frequency > 1) {
                    map.put(data, --frequency);
                }
            }
            if  (operation ==  3)  {
                Map<Integer, Object> tempMap;
                if ((tempMap = revMap.get(data)) != null && tempMap.size() > 0)  {
                    result.add(1);
                } else  {
                    result.add(0);
                }
            }
        }
        return result;
    }

    private static void handleAddToFrequencyMap (Integer data, int freq, Map<Integer, Map<Integer, Object>> revMap, Object obj) {
        if (freq == 0) {
            //new integer data frequency = 1
            Map<Integer, Object> dataKeysMap = revMap.computeIfAbsent(1, k  -> new HashMap<>());
            dataKeysMap.put(data, obj);
        } else {
            //Remove the data from the datakey-map for fequency key
            Map<Integer, Object>  dataKeysMap1 = revMap.get(freq);
            dataKeysMap1.remove(data);
            Map<Integer, Object>  dataKeysMap2 = revMap.computeIfAbsent(++freq, k -> new HashMap<>());
            dataKeysMap2.put(data, obj);
        }
    }

    private static void handleRemoveToFrequencyMap (Integer data, int freq, Map<Integer, Map<Integer, Object>> revMap, Object obj) {
        if  (freq !=  0) {
            Map<Integer, Object>  dataKeysMap1 = revMap.get(freq);
            dataKeysMap1.remove(data);
            if   (freq > 1)  {
                Map<Integer, Object>  dataKeysMap2 = revMap.computeIfAbsent(--freq, k -> new HashMap<>());
                dataKeysMap2.put(data, obj);
            }
        }
    }

    public static void main(String[] args) throws IOException {
      int c = 'a';
        System.out.println(c);
    }
}
