class Solution {
    public double average(int[] salary) {
        double n = salary.length;
        int max=salary[0],min=salary[0],sum=0;
        for(int i =0;i<n;i++){
            sum += salary[i];
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
        }
        double x = sum-(max+min);
        double avg = x/(n-2);
        return avg;
    }
}