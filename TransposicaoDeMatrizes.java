import java.util.Scanner;

public class TransposicaoDeMatrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[][] matriz = new int[2][3];
        int[][] transposicao = new int[3][2];

        //Input das matrizes
        System.out.println("matriz 2x3 : ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = sc.nextInt();
            }
        }


        //Transpondo a matriz original para outra
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                transposicao[c][l] = matriz[l][c];
                //troca de indice


            }
        }

        //Impressão dos inputs da matriz
        System.out.println("impressão da matriz : ");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();

        }

        //Impressão da matriz transposta
        System.out.println("Matriz transposta : ");
        for (int l = 0; l < transposicao.length; l++) {
            for (int c = 0; c < transposicao[l].length; c++) {
                System.out.print(transposicao[l][c] + " ");
            }
            System.out.println();


        }
        sc.close();
    }
}

