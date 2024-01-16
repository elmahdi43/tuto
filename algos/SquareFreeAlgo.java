import java.util.Scanner;

public class SquareFreeAlgo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        SquareFreeAlgo sfa = new SquareFreeAlgo();
        System.out.println(sfa.squareFree(n));

    }

    private String squareFree(int n) {
        int i = 2;
        StringBuilder result = new StringBuilder();
        while (i <= n) {
            if (n % (i * i) == 0) {
                result.append(i).append(" ");
            }
            i++;
        }
        if (!result.isEmpty()) {
            return result.toString();
        }
        return "Square Free";
    }


}
