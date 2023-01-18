import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int number1, sum=0;
        Scanner imp = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            number1 = imp.nextInt();
            if (number1 % 4 == 0) {
                sum += number1;
            }
        }while (number1 %2 ==0);

        System.out.println("Toplam: " + sum);
    }
}