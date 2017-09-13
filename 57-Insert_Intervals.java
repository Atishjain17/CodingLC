/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> ans = new ArrayList<Interval>();
        int i = 0;

        // add all the intervals ending before newInterval starts
        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            ans.add(intervals.get(i++));
        if (i<intervals.size()) //Imp corner case when intervals list is empty
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
        newInterval.end = newInterval.end;
        
        // merge all overlapping intervals to one considering newInterval
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        
        ans.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.size()) ans.add(intervals.get(i++)); 
        return ans;   
    }
}