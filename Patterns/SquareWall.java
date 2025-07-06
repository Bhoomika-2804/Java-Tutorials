import java.util.Scanner;
public class SquareWall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = "*";
        System.out.print("Enter the size of the wall (number of bricks per side): ");
        int size = scanner.nextInt();
        System.out.println("\nGenerated Square Wall:\n");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
