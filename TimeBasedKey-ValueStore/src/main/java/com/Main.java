package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair{
    String value;
    int timestamp;
    public Pair(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }
}

class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<Pair>());
        }
        map.get(key).add(new Pair(value, timestamp));

    }

    public String get(String key, int timestamp) {
        List<Pair> listP = map.get(key);
        if(listP == null || listP.isEmpty()) return "";
        int l = 0;
        int r = listP.size() -1;
        String ans = "";
        while(l <= r){
            int mid = l + (r - l)/2;
            int time = listP.get(mid).timestamp;
            if( time == timestamp) return listP.get(mid).value;
            else if(time < timestamp){
                ans = listP.get(mid).value;
                l = mid + 1;

            }
            else{
                r = mid -1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class   Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
