package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

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
            if(!MapA.containsKey(ele))return false;
            if(MapB.containsKey(ele)){
                int freq = MapB.get(ele);
                MapB.put(ele,freq+1);
            }
            else{
                MapB.put(ele,1);
            }
        }

        for (char ele : b) {
            if (!MapA.get(ele).equals(MapB.get(ele))) return false;
        }return true;
    }
}
