package coba;
/**
 *
 * @author Hardiana
 */
public class fx {
    public static void main(String[]args){
        int x = 2;
        int z = 2; //pangkat
        int c = (int) Math.pow(x,z);
        for (int i = 1; 1 < 5; i++){
        if ((2 ^ 2) == 0){
            int angka1 = x * 2;
            int angka2 = x ^ 2;
            int angka3 = x - 4;
            int angka4 = x + 1;
            int Jumlahx = angka1 * angka2 ^ angka3 - angka4 + angka1;
            x = angka1 - angka3;
            System.out.println(Jumlahx+ "");
        }
        else{
            System.out.print(x + " ");
                x = x + 1;
        }
    }
    }
}
