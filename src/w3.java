public class w3 {
    public static void main(String[] args){
        Book b1 = new Book("Dune", 412, true);

        Book b2 = new Book("Tom and Jerry", 10);

        Book b3 = new Book("Third book", 10);
        
        // b1.checkOut();

        // System.out.println("Checkout Result");
        // System.out.println(b1.getAvailibility());

        // System.out.println("\n");
        // System.out.println("PrintInfo Result");
        // b1.printInfo();
        // b2.printInfo();
        // b3.printInfo();

        // System.out.println(Book.count);

        b1.setPages(-50);
        System.out.println("After rejected setPages: " + b1.getPages());


    }

}

