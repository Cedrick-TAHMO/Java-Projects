/* This code is meant to estimate the value Pii
 * FYI this could will run for a while
 */
public class EstPi {

    public static void main(String[] args) {

        System.out.println("$ Java Estimating Pi");

        System.out.println("\n\n n  denomination  \tterm \t\testimatedPi");
        System.out.println("==  ============  =================  =================");
        int n = 1;
        Double denominator = 1.0;
        double estimatePI = 4.0;
        double term;
        double termadd = 0.0;

        while (n < 200000002) {
            System.out.print("\n" + n + "  \t" + denominator
                    + "\t  ");
            term = 4 / denominator;
            System.out.printf("%.15f", term);

            if (n % 2 != 0) {
                estimatePI = estimatePI + termadd;
                System.out.print("  ");
                System.out.printf("%.15f", estimatePI);
            } else {
                estimatePI = estimatePI - termadd;
                System.out.print("  ");
                System.out.printf("%.15f", estimatePI);
            }

            n++;
            denominator = denominator + 2;
            termadd = 4 / denominator;

        }

        System.out.print("\n\nThe number of iterations was: " + n);
        System.out.print("\n         The estimated pi is: " + estimatePI);
        System.out.print("\n                     Math.PI:" + Math.PI);
    }
}