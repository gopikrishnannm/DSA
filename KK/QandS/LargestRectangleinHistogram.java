package QandS;

public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(bruteforce(heights));
    }
    public static int bruteforce(int[] heights){
        int maxarea = 0;
        int minheight = 0;
        for (int i = 0; i < heights.length; i++) {
            minheight = heights[i];
            maxarea = Math.max(heights[i], maxarea);
            for (int j = i-1; j >=0 ; j--) {
                minheight = Math.min(minheight, heights[j]);
                int width = i-j+1;
                maxarea = Math.max(minheight * width , maxarea);
            }
        }
        return maxarea;
    }
    public static int usingStack(int height){
        return 0;
    }
}
