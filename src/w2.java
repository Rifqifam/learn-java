public class w2 {
    // public static void main(String[] args) {
    //     int myShots = 2;
    //     myShots = Shot(myShots);
    //     System.out.println("Back in main, myShots = " + myShots);
    // }

    // static int Shot(int shots) {
    //     shots = shots + 1;
    //     System.out.println("Inside method, shots = " + shots);

    //     return shots;
    // }

    public static void main(String[] args){
        int[] cups = {12, 19, 8, 22, 15};
        int cup = 5;
        // int total = 0;

        // for(int i = 0; i < cups.length; i++){
        //     int days = i+1;
        //     total = total + cups[i];
        //     System.out.println("Day " + days + " " + cups[i]);
        // }
        // System.out.println("\n");
        // System.out.println("total :" + total);

        bumpFirst(cup);
        System.out.println("cups[0] is now " + cups[0]);
    }

    static void bumpFirst(int arr) {
        arr = 1;
    }



}
