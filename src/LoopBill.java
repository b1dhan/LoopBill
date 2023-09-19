import java.util.Scanner;

public class LoopBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qty_momo = 0;
        int qty_chowmein = 0;
        int qty_cola = 0;
        double total_momo = 0;
        double total_cola = 0;
        double total_chowmein = 0;
        double grand_total = 0;

        int i;
        System.out.println("Enter the number of items you want to calculate: ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Choose your item; 1:Momo 2:Cola 3:Chowmein: ");
            int menu = sc.nextInt();

            if(menu==1) {
                System.out.println("enter the quantity of momo: ");
                qty_momo = sc.nextInt();
                total_momo = 170 * qty_momo;

            }
            else if(menu==2) {
                System.out.println("enter the quantity of cola: ");
                qty_cola = sc.nextInt();
                total_cola = 65 * qty_cola;

            }
            else if (menu==3) {
                System.out.println("enter the quantity of chowmein: ");
                qty_chowmein = sc.nextInt();
                total_chowmein = 120 * qty_chowmein;

            }
            else{
                System.out.println("Try again");
            }
        }

        double discount = 0;
        double total = total_chowmein + total_momo + total_cola;
        System.out.println("Do you have membership? (yes/no): ");
        String yn = sc.next();
        if (yn.equals("yes")) {
            discount = 0.1 * total;
            grand_total = total - (0.1 * total);
        } else {
            grand_total = total;
        }
        System.out.println("\t\n Item\tQty  \tRate\tAmount\nMomo    \t" + qty_momo + "\t250   \t" + total_momo + "\nCake    \t" + qty_cola + "\t50   \t" + total_cola + "\nChowmein\t" + qty_chowmein + "\t200   \t" + total_chowmein + "\n");

        System.out.println("Total: " + total + "\n");
        System.out.println("Discount: " + discount + "\n");
        System.out.println("Grand Total: " + grand_total);

    }
}
