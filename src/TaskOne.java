import java.util.Scanner;

public class TaskOne {
   //Task1
  // Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";

        while (!name.equals("close")) {
            System.out.println("Введите имя или close для выхода");
            name = scan.nextLine();
            if (!name.equals("close")) {
                System.out.println("Hello " + name);
            } else
                System.out.println("Bye");
        }
        scan.close();
    }
}


