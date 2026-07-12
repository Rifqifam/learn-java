public class w3 {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title = "Dune";
        b1.pages= 412;
        b1.available = true;

        Book b2 = new Book();
        b2.title = "Tom and Jerry";
        b2.pages= 10;
        b2.available = true;

        System.out.println(b1.title + " has " + b1.pages + " pages");
        System.out.println(b2.title + " has " + b2.pages + " pages");
        System.out.println("\n");

        checkOut(b1);
        System.out.println("Result : " + b1.available);


    }

    static void checkOut(Book b){
        b.available = false;
    }

}
