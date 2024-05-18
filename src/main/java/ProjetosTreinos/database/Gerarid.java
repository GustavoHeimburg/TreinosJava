package ProjetosTreinos.database;
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

        System.out.println("Digite seu nome de usuário e senha para login:");
        String loginUsername = scanner.nextLine();
        String loginPassword = scanner.nextLine();

        if (authenticateUser(loginUsername, loginPassword)) {
            System.out.println("Login bem sucedido! Seu ID de acesso único é: " + ids.get(loginUsername));
        } else {
            System.out.println("Falha no login. Verifique seu nome de usuário e senha.");
        }
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

