public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem ("Gandalf", "Guerreiro", 6, 70, 15.5);
        Personagem personagem2 = new Personagem ("Frodo Bolseiro", "Entregador", 2, 95, 4.8);
        
        personagem1.exibirFicha();
        personagem2.exibirFicha();
    }
}
