import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int toplam = 0;

        System.out.println("Bir sayı giriniz :");
        n = input.nextInt();

        for(int i = 1; i < n; i++){

            if(n%i==0){
                toplam += i;
            }

        }
        if(toplam == n ){
            System.out.println(n + " sayısı bir mükemmel sayıdır.");
        }else{
            System.out.println(n + " sayısı mükemmel sayı değildir.");
        }
    }
}
