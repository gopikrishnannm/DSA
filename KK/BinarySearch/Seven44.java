package BinarySearch;

public class Seven44 {

    public static void main(String[] args) {
        char[] arr = {'b', 'c', 'h', 'z'};
        char target = 'b';
        System.out.println(largestLetterSmallerThanTarget(arr, target));
    }
    static public char largestLetterSmallerThanTarget(char[] letters, char target) {
        if (target<=letters[0]){
            return target;
        }
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>=letters[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        // here 
        return letters[end-1];
        // if start == letters.length return 0;
    }
}
