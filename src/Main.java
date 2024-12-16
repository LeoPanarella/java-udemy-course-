import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner somaCalculadora = new Scanner(System.in);
        System.out.println("digite o primeiro numero : ");
        int numeroUm = somaCalculadora.nextInt();


        System.out.println(" digite o segundo numero : ");
        int numeroDois  = somaCalculadora.nextInt();


        int soma = numeroUm + numeroDois ;

        System.out.println( "A SOMA É : " + soma );
    }
}

