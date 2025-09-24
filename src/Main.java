import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int[] valores = {10, 20, 30, 40, 50};

        for(int i = 0; i < valores.length; i++){
            sum += valores[i];
            }
        System.out.println("A soma total das receitas é: " + sum);
        }
    }
