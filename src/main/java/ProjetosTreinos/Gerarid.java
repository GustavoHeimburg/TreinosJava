package ProjetosTreinos;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Scanner;

public class Gerarid {
    private static Map<String, String> users = new HashMap<>();
    private static Map<String, String> ids = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String username = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String password = scanner.nextLine();

        registerUser(username, password);
    System.out.println("precione (ENTER) e faça login com o cadastro que criou anteriormente. 'O login é obrigatorio para receber o seu ID unico de usuario!'");
        String lerProxLinha = scanner.nextLine();
        System.out.println("Digite seu nome:");
        String loginUsername = scanner.nextLine();
        System.out.println("Digte sua senha:");
        String loginPassword = scanner.nextLine();

        if (authenticateUser(loginUsername, loginPassword)) {
            System.out.println("Login bem sucedido! Seu ID de acesso único é: " + ids.get(loginUsername));
        } else {
            System.out.println("Falha no login. Verifique seu nome de usuário e senha.");
        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite 'd':");
//        String input1 = scanner.nextLine();
//
//        System.out.println("Digite 'e':");
//        String input2 = scanner.nextLine();
//
//        System.out.println("Digite 'human':");
//        String input3 = scanner.nextLine();
//
//        if (input1.equals("d") && input2.equals("e") && input3.equals("human")) {
//            System.out.println("Autenticação bem-sucedida!");
//        } else {
//            System.out.println("Autenticação falhou!");
//        }


    }

    public static void registerUser(String username, String password) {
        users.put(username, password);
        ids.put(username, UUID.randomUUID().toString());
    }

    public static boolean authenticateUser(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}

