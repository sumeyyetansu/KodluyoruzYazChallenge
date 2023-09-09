import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String word = scan.nextLine();
        word = word.trim();
        System.out.print(word.toUpperCase() );
    }
}