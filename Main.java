import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c,u,alan;
        Scanner mec = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        a = mec.nextDouble();
        System.out.print("2. Kenarı Giriniz: ");
        b = mec.nextDouble();
        System.out.print("3. Kenarı Giriniz: ");
        c = mec.nextDouble();

        u=(a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin Alanı: " + alan);
    }
}