import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fzk,kmy,trkc,mzk,derstoplam = 0,nottoplam = 0;
        double ort;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematk notunu giriniz");
        mat = inp.nextInt();
        if(!(mat > 0 && mat < 100)) {
            System.out.println("1-100 arası değer giriniz!");}
        else{
            nottoplam += mat;
            derstoplam++;
        }
        System.out.print("Fizik notunu giriniz");
        fzk = inp.nextInt();
        if(!(fzk > 0 && fzk < 100)) {
            System.out.println("1-100 arası değer giriniz!");}
        else{
            nottoplam += fzk;
            derstoplam++;}
        System.out.print("Kimya notunu giriniz");
        kmy = inp.nextInt();
        if(!(kmy > 0 && kmy < 100)) {System.out.println("1-100 arası değer giriniz!");}
        else{
            nottoplam += kmy;
            derstoplam++;}

        System.out.print("Turkce notunu giriniz");
        trkc = inp.nextInt();
        if(!(trkc > 0 && trkc < 100)) {System.out.println("1-100 arası değer giriniz!");}
        else{
            nottoplam += trkc;
            derstoplam++;}

        System.out.print("Muzik notunu giriniz");
        mzk = inp.nextInt();
        if(!(mzk > 0 && mzk < 100)) {System.out.println("1-100 arası değer giriniz!");}
        else{
            nottoplam += mzk;
            derstoplam++;}
        int ortalama = nottoplam/derstoplam;

        if(nottoplam/derstoplam>55){
            System.out.println("Tebrikler sınıfı geçtiniz!\nOrtalamanız:" + ortalama);}
        else{
            System.out.println("Üzgünüm kaldınız\nOrtalamanız:" + ortalama);}


    }
}