package com.lmonkiewicz.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumPairs {
    public int countPairsOnArray(int[] data, int sum) {
        int count = 0;
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            int a = data[i];
            for (int j = i+1; j < data.length; j++) {
                int b = data[j];
                int currentSum = a + b;
                if (currentSum > sum){
                    return count;
                } else if (currentSum == sum) {
                    count++;
                }
            }
        }
        return count;
    }
    public int countPairsOnMap(int[] data, int sum) {
        Map<Integer, Integer> countUnique = new HashMap<Integer, Integer>();
        for (int val : data) {
            if (countUnique.containsKey(val)) {
                countUnique.put(val, countUnique.get(val) + 1);
            }
            else {
                countUnique.put(val, 1);
            }
        }
        int count = 0;
        for (Integer val : countUnique.keySet()) {
            int lookingFor = sum - val;
            if (countUnique.containsKey(lookingFor)) {
                if (lookingFor == val){
                    int valCount = countUnique.get(lookingFor);
                    int currentCount = countUnique.get(val);
                    count += Math.min(valCount, currentCount);
                }
            }
        }
        return count;
    }



}
