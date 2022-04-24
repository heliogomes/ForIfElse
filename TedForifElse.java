import groovy.console.ui.SystemOutputInterceptor;
import java.util.Scanner;

public class TedForifElse {
        public static void main(String[] args) {
        int maior = 0;
        int menor = 0;
        int countMasc = 0;
        int countFem = 0;
        float mediaAlturaMasc = 0;
        int soma = 0;


        int [][] array = new int[4][2];

        Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j==0) {
                    System.out.println("Digite o gênero da " + (i + 1) + " pessoa. Digite 1 para masculino ou 2 para feminino.");
                } else{
                    System.out.println("Digite a altura da " + (i + 1) + " pessoa.");
                }
                array[i][j] = sc.nextInt();
                if(array[i][j] > maior){
                    maior = array[i][j];
                }
                if(array[i][j] == 2){
                    countFem++;
                }
                if(array[i][j] == 1){
                    countMasc++;
                }
                if(array[i][0] == 1){
                    soma = soma + array[i][1];
                }
            }
        }

        mediaAlturaMasc = soma/countMasc;
        System.out.println("Maior altura: " + maior);
        System.out.println("Quantidade de pessoas do gênero feminino: " + countFem);
        System.out.println("Média altura homens: " + mediaAlturaMasc);
    }
}

