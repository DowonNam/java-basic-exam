import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        int height = 3;

        for (int i = 1; i <= height; i++) {
            for (int j = height-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i*2)-1); k++) {
                System.out.print("*");
            }
            for (int l = height-1; l >= 0; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}