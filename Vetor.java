public class Vetor {
    private int[] vet;

    public void criarVetor(int tamanho) {    
        this.vet = new int[tamanho];
        for(int j=0; j<tamanho; j++) {
            this.vet[j]=j+1;

        }

    }

    public void imprimirVetor() {
        for(int j=0; j<this.vet.length; j++){
            System.out.println(this.vet[j]);
        }
   }

   public void novoValor(int indice, int valor){
        this.vet [indice]=valor;
        

   }

}