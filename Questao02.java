package atividade3;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("palavra: ");
        String pala = ler.nextLine();
        System.out.println("Introduza o nº de vezes que a palavra deve repetir");
        int num = ler.nextInt();
        
        for (int i =1; i<=num; i=i+1){
            System.out.println(pala);

            
        }
    ler.close();
    }
}