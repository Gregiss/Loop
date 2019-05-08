package sequenciafibonacci;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        /*
        * Created by kaway404
        * Social | Github: 'https://github.com/kaway404'
        * Social | Github : 'https://github.com/thekaway404'
        * Social | Codepen: 'https://codepen.io/kaway404'
        */
        int atual = 0, proximo = 0, anterior = 1, max = 100;
        for(int i = 0; i < 11; i++){ // Comeca o loop
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
            System.out.print(proximo + "\n");
        } // Termina o loop
    }
    
}
