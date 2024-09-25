package com.sb.redis;

import java.util.*;

public class TestStream {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1,2,1,3,4,7,8,8,9,2);

        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){

            for (int j = i+1; j<list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                   duplicates.add(list.get(i));
                }
            }
        }
        System.out.println(duplicates);*/
//by using map
        List<Integer> list = Arrays.asList(1,2,1,3,4,7,8,8,9,2);
        Map<Integer, Long> map = new HashMap<>();

        for(int i : list){
            if(!map.containsKey(i)){
                map.put(i, 1L);
            }else {
                map.put(i, map.get(i) + 1L);
            }
        }
        /*Set<Map.Entry<Integer, Long>> entries = map.entrySet();
        for(Map.Entry<Integer, Long> entry : entries){
            if (entry.getValue() > 1L){
                System.out.println(entry.getKey());
            }
        }*/

        map.forEach((k, v) -> {
            if(v > 1L){
                System.out.println(k);
            }
        });
    }
}
