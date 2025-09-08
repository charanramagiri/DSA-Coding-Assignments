// 621. Task Scheduler

//link: https://leetcode.com/problems/task-scheduler/description/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();

        for(char t : tasks){
            map.put(t, map.getOrDefault(t,0)+1);
        }

        int fmax = 0, cnt=0;
        for(int f : map.values()){
            if(f>fmax){
                fmax=f;
                cnt=1;
            }else if(f==fmax){
                cnt++;
            }
        }

        int total = tasks.length;
        return Math.max(total, (fmax-1)*(n+1)+cnt);
    }
}
