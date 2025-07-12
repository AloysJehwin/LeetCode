class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if(month<3){
            month+=12;
            year-=1;
        }
        int q=day;
        int m=month;
        int k=year%100;
        int j=year/100;

        int n = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[n];
    }
}