public class Main {

    // When you run `java Main`, the JVM hunts for this exact method
    // and starts executing here. Think of it as the front door of your program.
    //
    // Don't worry about `public`, `static`, or `String[] args` yet —
    // we unpack every one of those in later weeks. For today, all you
    // need to know: execution begins on the line below.
    public static void main(String[] args) {
        String name = "Dune";
        int pages = 82;
        double price = 100.00;
        boolean availibility = true;

        System.out.println("Title: " + name);
        System.out.println("pages: " + pages);
        System.out.println("price: " + price);
        System.out.println("availibility: " + availibility);


    }
}
