import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        Observer o1= new HexObserver(sub);
        Observer o2= new OctObserver(sub);
        Observer o3=new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }

}
