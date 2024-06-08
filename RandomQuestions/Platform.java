import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Platform {
    public static void main (String[] args) {

        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=arr.length;
        int totalCount=findPlatform(arr,dep,n);
        System.out.println("Minimum number of Platforms required "+totalCount);
    }
    static int findPlatform(int[] arr, int[] dep, int n){


        ArrayList<Timing> times = new ArrayList<>();

        int i=0;
        while(i<arr.length) {
            times.add(new Timing(arr[i], 'A'));
            times.add(new Timing(dep[i], 'D'));
            i = i+1;
        }
        int plat = 0;
        int requiredPlat = 0;

        TimingComparator tc = new TimingComparator();

        Collections.sort(times, tc);

        for (int j = 0; j < times.size(); j++) {
            if (times.get(j).aOrD == 'A'){
                plat++;
            }
            if (times.get(j).aOrD == 'D'){
                plat--;
            }
            requiredPlat = Math.max(requiredPlat, plat);
        }

        return requiredPlat;
    }
}
class Timing{
    int time;
    char aOrD;

    public Timing(int time, char aOrD) {
        this.time = time;
        this.aOrD = aOrD;
    }
}
class TimingComparator implements Comparator<Timing>{

    @Override
    public int compare(Timing o1, Timing o2) {
        if (o1.time <= o2.time){
            return -1;
        }
        else{
            return 1;
        }
    }
}