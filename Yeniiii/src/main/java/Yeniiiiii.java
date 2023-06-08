import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        int sayi,adet,toplam;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        sayi = inp.nextInt();
        toplam=0;
        adet=0;
        for (int i=0; i<=sayi; i++){
            if (i%3==0&&i%4==0&&i!=0){
              adet++;
              toplam+=i;
            }
        }
        ort=toplam/adet;
        System.out.println("Ortalama :"+ ort);
    }

}
