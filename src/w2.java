public class w2 {
        public static void main(String[] args) {
            
            printReceipt("Jonathan", 3);
        }

        static double coffeePrice(int shots){
            double base = 3;
            double total = base + (shots * 0.80);
            
            return total;
        
        }

        static void printReceipt(String customer, int shots){
            double price = coffeePrice(shots);

            System.out.println("Hi "+ customer + " your coffee price is " + price);
        }
}
