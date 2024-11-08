import java.util.Scanner;

public class BMIhesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu girin (kg): ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu girin (metre): ");
        double boy = scanner.nextDouble();
        double bmi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz (BMI): " + bmi);
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi < 24.9) {
            System.out.println("Durum: Normal");
        } else if (bmi < 29.9) {
            System.out.println("Durum: Kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
