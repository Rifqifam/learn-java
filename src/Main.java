public class Main {

    // When you run `java Main`, the JVM hunts for this exact method
    // and starts executing here. Think of it as the front door of your program.
    //
    // Don't worry about `public`, `static`, or `String[] args` yet —
    // we unpack every one of those in later weeks. For today, all you
    // need to know: execution begins on the line below.
    public static void main(String[] args) {

        // Day 1

        String name = "Dune";
        int pages = 82;
        double price = 100.00;
        boolean availibility = true;

        // System.out.println("Title: " + name);
        // System.out.println("pages: " + pages);
        // System.out.println("price: " + price);
        // System.out.println("availibility: " + availibility);


        // Day 2

        // if(availibility){
        //     System.out.println("You can borrow it!");
        // } else{
        //     System.out.println("Book is not available to borrow");
        // }

        // if(pages<100){
        //     System.out.println("This will be a quick read");
        // } else if (pages<400){
        //     System.out.println("A medium length read");
        // } else{
        //     System.out.println("Definitely a long read");
        // }


        // Day 3

        // int copies = 5;
        // for (int i = 1; i<= copies; i++){
        //     System.out.println("Copy #" + i +" is ready to lend");
        // }

        // while(copies > 0){
        //     System.out.println( copies + " Copies remaining");
        //     copies--;
        // }

        int sumToResult = sumTo(10);

        System.out.println("Result " +sumToResult);

    }
        static int sumTo(int n) {
            int total = 0;                  // the accumulator gets its own box
            for (int i = 1; i <= n; i++) {
                total = total + i;          // add into total — NOT into n
            }
            return total;                   // n never moved; it stayed 3 the whole time
        }
}

