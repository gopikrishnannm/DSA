public class Lemonade {
    public static void main(String[] args) {
        int[] l = {
                5,5,5,10,20
        };
        System.out.println(lemonadeChange(l));
    }
    static public boolean lemonadeChange(int[] bills) {
        if(bills[0] > 5){
            return false;
        }
        int wallet5 = 1;
        int wallet10 = 0;
        for(int i=1;i<bills.length;i++){
            if(bills[i] == 5){
                wallet5 = wallet5 + 1;
            }
            else if(bills[i] == 10){
                if(wallet5 >= 1){
                    wallet10 = wallet10 + 1;
                    wallet5 = wallet5 - 1;
                }
                return false;
            }
            else{
                if(wallet5 >=1 && wallet10 >=1){
                    wallet5 = wallet5 - 1;
                    wallet10 =wallet10 -1;
                }
                else if(wallet5 >= 3){
                    wallet5 =wallet5 - 3;
                }
                else{
                    return false;
                }
            }

        }
        return true;

    }
}
