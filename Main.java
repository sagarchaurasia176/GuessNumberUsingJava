import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int myNumber=(int)(Math.random()*100);

    do {
        System.out.println("guess any num :");
        num= sc.nextInt();

        if (num ==myNumber) {
            System.out.println("ohohoh you choose right number");
            break;
        } else if (num > myNumber) {
            System.out.println("to small number choose another number");
        } else {
            System.out.println("to large number choose another number");
        }
    }
    while (num >= 0);
        System.out.println("my number was");
        System.out.println(myNumber);
    };





}