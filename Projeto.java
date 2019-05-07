package projeto;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        /*
        * Created by kaway404
        * Social | Github: 'https://github.com/kaway404'
        * Social | Github : 'https://github.com/thekaway404'
        * Social | Codepen: 'https://codepen.io/kaway404'
        */
        Scanner leia = new Scanner(System.in);
        int NumMaior = 0;
        int NumMenor = 0;
        int NumPar = 0;
        String aux = "";
        int saida = 0;
        int i = 0;
        while(true){ // Criar o loop
            System.out.println("Qual o número? \nCaso deseja sair da aplicação digite sair");
            aux = leia.next();
            if(aux.equals("sair")){ // Verifica a saida do usuario
                System.out.println("Operação finalizada");
                break;
            }else{
            saida = Integer.parseInt(aux);
            if(saida <= NumMenor | i == 0){ //Pegar número menor
                NumMenor = saida;
            }
            if(saida >= NumMaior | i == 0){ //Pegar número maior
                NumMaior = saida;
            }
            if(saida% 2 == 0){ //Verificar número par
                NumPar = saida;
            }
            i++; // Insere + 1 no indice
            System.out.println("O menor " + NumMenor); // Imprimi o menor número na tela
            System.out.println("O maior " + NumMaior);// Imprimi o maior número na tela
            System.out.println("O ultimo número é par " + NumPar); // Imprimi o ultimo numero par
            }
        }
    }
    
}
