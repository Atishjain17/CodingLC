//Given a collection of intervals,merge overlapping ones.
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0;intervals.get(0).start;
 int end = intervals.get(0).end;}
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1) return intervals;
        intervals.sort((i1,i2) -> Integer.compare(i1.start,i2.start));
        
        List<Interval> ans = new ArrayList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for (Interval interval : intervals) {
            if (interval.start <= end) // Overlapping intervals, move the end if needed
                end = Math.max(end, interval.end);
            else {                     // Disjoint intervals, add the previous one and reset bounds
                ans.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
    
    // Add the last interval
    ans.add(new Interval(start, end));
    return ans;
    }
}