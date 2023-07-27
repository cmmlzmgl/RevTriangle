import java.util.Scanner;

public class RevTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int line;

        System.out.print("Lütfen Satır Sayısını Giriniz: ");
        line = input.nextInt();

        for (int i = line; i >= 1; i--)
        {
            for (int j = 1; j <= line - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i) - 1  ; k++)
            {
                System.out.print("*");
            }System.out.println();

        }
    }
}
