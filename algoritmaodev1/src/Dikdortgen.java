import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();
        double cevre = 2 * (kisaKenar + uzunKenar);
        double alan = kisaKenar * uzunKenar;
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }
}
