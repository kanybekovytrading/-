import device.Printer;
import device.Smartphone;
import product.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("""
                   1. Register
                   2. Login
                   3. Exit
                   """);
           int choice = scanner.nextInt();
           User user = new User();
           switch (choice){
               case 1:
                   System.out.println("Введи имя нового пользователя:");
                   user.setFirstName(scanner.nextLine());
                   System.out.println("Введи фамилию нового пользователя:");
                   user.setLastName(scanner.nextLine());
                   System.out.println("Введите электронную почту нового пользоваетеля:");
                   user.setEmail(scanner.nextLine());
                   System.out.println("Ведите пароль нового пользоваетеля:");
                   user.setPassword(scanner.nextLine());
                   System.out.println("Вы успешно зарегистрированы!");
                   break;
               case 2:
                   System.out.println("Введите email!");
                   String login = scanner.nextLine();
                   System.out.println("Введите пароль!");
                   String password = scanner.nextLine();
                   boolean key = false;
                   if(login.equals(user.getEmail()) && password.equals(user.getPassword())) {
                       System.out.println("Вы успешно вошли!");
                       key= true;
                   }
                   else {
                       System.out.println("Попробуйте еще раз!");
                   }
                   while (key == true) {
                       System.out.println("""
                               Ваш выбор:
                               1. добавить продукт
                               2. вывести продукты
                               3. вывести электронику
                               4. вывести книги""");
                       System.out.println("Ваш выбор: ");
                       int choise = scanner.nextInt();
                   }

               case 3:
                   System.out.println("Вы успешно покинули программу!");
                   return;


           }

       }
    }
}