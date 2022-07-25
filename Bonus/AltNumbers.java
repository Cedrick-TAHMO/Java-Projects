
/*This code tells you if the numbers you alternating that is, 
 * if the first is > than the second the third is > than the 
 * second and so on.
 */
import java.util.Scanner;

public class AltNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("********* Alternating Numbers *********");
        System.out.println("Enter four intergers: ");

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();

        if (first < second) {
            if (second > third) {
                if (third < fourth) {
                    System.out.println("Alternating");
                } else {
                    System.out.println("Not Alternating");
                }
            } else {
                System.out.println("Not Alternating");
            }
        } else {
            if (second < third) {
                if (third > fourth) {
                    System.out.println("Alternating");
                } else {
                    System.out.println("Not Alternating");
                }
            } else {
                System.out.println("Not Alternating");
            }
        }
    }
}
