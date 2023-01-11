import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turk, kimya, muzik;
        int ttl = 0, ds = 0;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat <= 100 && 0 <= mat) {
            ttl = ttl + mat;
            ds++;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik <= 100 && 0 <= fizik) {
            ttl = ttl + fizik;
            ds++;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextInt();
        if (turk <= 100 && 0 <= turk) {
            ttl = ttl + turk;
            ds++;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya <= 100 && 0 <= kimya) {
            ttl = ttl + kimya;
            ds++;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik <= 100 && 0 <= muzik) {
            ttl = ttl + muzik;
            ds++;
        }
        double ort = ttl / ds;
        if (ort < 55) {
            System.out.println("Kaldınız");
        } else {
            System.out.println("Tebrikler geçtiniz");
        }
        System.out.println("Ortalamanız: " + ort);
    }
}