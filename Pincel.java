public class Pincel {
    String cor;
    Double tamanho;
    Double diametro;

    public Pincel() {}
    public Pincel(String cor, Double tamanho, Double diametro){
        this.cor = cor;
        this.tamanho = tamanho;
        this.diametro = diametro;

    }

    public void escrever() {
        System.out.println("Estou escrevendo");
    }

       
    public void setCor(String cor) {
        this.cor = cor;
        }
    }
