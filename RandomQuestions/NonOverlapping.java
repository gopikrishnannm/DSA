import java.util.Arrays;

public class NonOverlapping {
    public static void main(String[] args) {
        int[][] arr = {
                {1,100},{11,22},{1,11},{2,12}
        };
        System.out.println(eraseOverlapIntervals(arr));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int startIndex = intervals[0][0];
        int endIndex = intervals[0][1];
        int notRemovedCount = 1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= endIndex){
                endIndex = intervals[i][1];
                notRemovedCount++;
            }
        }
        return intervals.length-notRemovedCount;
    }
}
