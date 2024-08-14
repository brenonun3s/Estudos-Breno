public class Principal {

    public static void main(String[]args){
        Pincel p1 = new Pincel();
        p1.cor="Verde";
        p1.tamanho=10.0;
        p1.diametro=1.0;
        Pincel p2 = new Pincel();
        p2.cor = "Roxo";
        p2.tamanho=11.0;
        p2.diametro=1.5;

        System.out.println("Cor de p1:"+p1.cor);
        System.out.println("Cor de p1:"+p2.cor);

        
        final Double tamanho = 10.0;
        final Double diametro = 1.0;
        String[] vetorCores = {"Verde", "Amarelo", "Azul"};
        Pincel[] vetorPinceis = new Pincel[9];

        int indice=0;
        while(indice < vetorPinceis.length){
            for(int i=0; i < vetorCores.length; i++) {
            vetorPinceis[indice] = new Pincel(vetorCores[i], tamanho, diametro);
            System.out.println("Pincel "+(i+1)+" - cor: "+ vetorPinceis[indice].cor);
            indice++;

}
        Vetor vet = new Vetor();
        vet.criarVetor(10);
        vet.imprimirVetor();
        vet.novoValor(3, 94);
        System.out.println("/n/n");
        vet.imprimirVetor();

        }
    }
   }