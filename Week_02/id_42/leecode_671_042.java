import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class leecode_671_042 {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> wordsCount = new TreeMap<String,Integer>();
        // statistic
        for(String word:words){
            if(wordsCount.containsKey(word)){
                int count = wordsCount.get(word);
                count++;
                wordsCount.put(word, count);
            }else{
                wordsCount.put(word, 1);
            }

        }

        //sort

        List<Map.Entry<String,Integer>> list  = new ArrayList<Map.Entry<String,Integer>>(wordsCount.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }

        });

        List<String> result = new  ArrayList<String>();

        for(int i=0;i<k;i++){
            result.add(list.get(i).getKey());
        }

        return result;

    }
}