import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // 1 Level

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x = 0;
        while (x < number) {
            x++;
            System.out.println("Я начинаю разбираться с циклами");
        }



        // 2 Level

        Scanner scanner2 = new Scanner(System.in);
        String str = scanner2.nextLine();

        int line = str.length(); // длина строки
        int y = 0;

        while (y < line){
            y++;
            System.out.println(str.charAt(0));
        }



    }
}

