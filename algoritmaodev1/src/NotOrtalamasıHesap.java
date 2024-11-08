import java.util.Scanner;

public class NotOrtalamasıHesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. notu girin: ");
        double not1 = scanner.nextDouble();
        System.out.print("2. notu girin: ");
        double not2 = scanner.nextDouble();
        System.out.print("3. notu girin: ");
        double not3 = scanner.nextDouble();
        double ortalama = (not1 + not2 + not3) / 3;
        if (ortalama >= 50) {
            System.out.println("Ortalama: " + ortalama + " - Başarılı");
        } else {
            System.out.println("Ortalama: " + ortalama + " - Başarısız");
        }
    }
}
