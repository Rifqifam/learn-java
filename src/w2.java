public class w2 {
    public static void main(String[] args) {
        int myShots = 2;
        myShots = Shot(myShots);
        System.out.println("Back in main, myShots = " + myShots);
    }

    static int Shot(int shots) {
        shots = shots + 1;
        System.out.println("Inside method, shots = " + shots);

        return shots;
    }

}
