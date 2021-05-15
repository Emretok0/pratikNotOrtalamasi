import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int turkce, tarih, muzik, mat, fizik, kimya, toplam, ortalama;
	    Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();

		System.out.print("Türkçe notunuz: ");
	    turkce = input.nextInt();

		System.out.print("Tarih notunuz: ");
	    tarih = input.nextInt();

		System.out.print("Müzik notunuz: ");
	    muzik = input.nextInt();

		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();

		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();

	    toplam = turkce+tarih+muzik+mat+fizik+kimya;
	    ortalama= toplam /6;

	    String durum = (ortalama>60) ? "Geçti" : "Kaldı";
		System.out.println(durum);
    }
}
