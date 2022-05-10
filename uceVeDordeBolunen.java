import java.util.Scanner;
public class uceVeDordeBolunen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        int toplam = 0;
        int sayiAdeti = 0;

        System.out.print("Sayı Giriniz : ");
        x = inp.nextInt();

        for (int r = 0; r <= x; r++) {
            if ((r % 3 == 0) && (r % 4 == 0)){
                toplam += r;
                sayiAdeti++;

            }
        }
        int sonuc = toplam/sayiAdeti;
        System.out.println(sonuc);
    }
}
