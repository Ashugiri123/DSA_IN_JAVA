package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MaximumNumberofBalloons {
    public int maxNumberOfBalloons(String str) {
        char[] b = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        ArrayList<Integer> list = new ArrayList<>();

        char[] a = str.toCharArray();
        HashMap<Character,Integer> MapA= new HashMap<>();
        HashMap<Character,Integer> MapB= new HashMap<>();
        for(char ele : a){
            if(MapA.containsKey(ele)){
                int freq = MapA.get(ele);
                MapA.put(ele,freq+1);
            }
            else{
                MapA.put(ele,1);
            }
        }
        for(char ele : b){
            if(!MapA.containsKey(ele))return 0;
            if(MapB.containsKey(ele)){
                int freq = MapB.get(ele);
                MapB.put(ele,freq+1);
            }
            else{
                MapB.put(ele,1);
            }
        }


        for(char ele : b){
            if((!MapA.containsKey(ele)) || MapA.get(ele)<MapB.get(ele))return 0;
            if(ele == 'l' || ele == 'o'){
                list.add(MapA.get(ele)/2);}
            else  list.add(MapA.get(ele));
        }

        int min = Collections.min(list);
        return min;

    }
}
