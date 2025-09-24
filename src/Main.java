import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int escada = scanner.nextInt();

        for(int i = 1; i <= escada; i++){
            System.out.println("Subindo o degrau: " + i);
        }

        System.out.println("Você chegou ao topo!");
        scanner.close();
        }
    }
