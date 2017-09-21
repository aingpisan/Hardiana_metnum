package coba;
import java.util.Scanner;
/**
 *
 * @author Hardiana
 */
public class Coba {
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
		int a=27;
		int b=3;
                int c = (int) Math.pow(a, b);
                int sum;
		System.out.println("Bilangan Yang Diketahui");
		System.out.println("a="+a);
		System.out.println("b="+b);


		//Add
		System.out.println("Pekalian");
                sum = a * b;
                System.out.println("1. Pekalian = " +sum);

		//Sub
		System.out.println("Pembagian ");
                sum = a / b;
                System.out.println("2. Pembagian = " +sum);

		//Multi
		System.out.println("Penjumlahan ");
                sum = a + b;
                System.out.println("3. Penjumlahan = " +sum);

		//Devide
		System.out.println("Pengurangan ");
                sum = a - b;
                System.out.println("4.Pengurangan = " +sum);

                //Counting
		System.out.println("Pangkat ");
                sum = a ^ c;
                System.out.println("5. Pangkat = " +sum);
	}
}