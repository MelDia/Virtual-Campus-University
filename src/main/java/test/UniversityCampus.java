package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UniversityCampus {

    public static void main(String[] args) throws SQLException {
        int Action = 1;
        Action action = new Action();
        int idUsuario = 0;
        String username = " ";
        String password = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the virtual campus of the university");
        System.out.println("(Press Enter to continue)");
        String nombre = scanner.nextLine();
        System.out.println(" ");

        while (Action != 0) {
            System.out.println("These are the actions you can take, how do you want to continue? \n"
                    + "1. SELECT \n"
                    + "2. INSERT \n"
                    + "3. UPDATE \n"
                    + "4. DELETE \n"
                    + "0. EXIT");
            Action = scanner.nextInt();

            switch (Action) {
                case 1: //SELECT
                    System.out.println("This is the list of the students");
                    action.Select();
                    System.out.println(" ");
                    break;
                case 2: //INSERT
                    System.out.println("Please, fill in the fields below");
                    System.out.println("Insert a username: ");
                    username = scanner.next();
                    System.out.println("Insert a password: ");
                    password = scanner.next();
                    action.Insert(username, password);
                    System.out.println(" ");
                    break;
                case 3: //UPDATE
                    System.out.println("This is the list of the students");
                    action.Select();
                    System.out.println(" ");
                    System.out.println("Insert id to update: ");
                    idUsuario = scanner.nextInt();
                    System.out.println("Insert a username: ");
                    username = scanner.next();
                    System.out.println("Insert a password: ");
                    password = scanner.next();
                    action.Update(idUsuario, username, password);
                    System.out.println(" ");
                    break;
                case 4: //DELETE
                    System.out.println("This is the list of the students");
                    action.Select();
                    System.out.println(" ");
                    System.out.println("Insert id to delete: ");
                    idUsuario = scanner.nextInt();
                    action.Delete(idUsuario);
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("¡Goodbye!");
                    break;
                default:
                    System.out.println("Please, choose a correct action");
                    break;

            }

        }
    }

}
