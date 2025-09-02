// 2073. Time Needed to Buy Tickets

//https://leetcode.com/problems/time-needed-to-buy-tickets/description/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;
        while(tickets[k]>0){
            for(int i=0;i<n;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    time++;
                    if(i==k && tickets[k]==0){
                        return time;
                    }
                }
            }
        }
        return time;
    }
}
