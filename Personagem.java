public class Personagem {
     // atributos
    String nome;
    String classe;
    int level;
    int pontosDeVida;
    double poderBase;

    // construtor
    public Personagem( String nome, String classe, int level, int pontosDeVida, double poderBase ){
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // exibir informações
    public void exibirFicha(){
        System.out.println("\n Ficha do Personagem \n Nome: " + nome + "\n Classe: " + classe + "\n Level: " + level + "\n Pontos de Vida: " + pontosDeVida + "\n Poder Base: " + poderBase);
    }

    }
}

