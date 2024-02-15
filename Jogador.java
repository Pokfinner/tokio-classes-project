import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {

    String nome;
    int pontosDeVida, pontosDeAtaque, pontosDeDefesa;
    Mesh3D mesh;
    int x, y, z;

    public static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public static void criarJogador(){

        Scanner in = new Scanner(System.in);

        // Receber dados do utilizador
        System.out.println("Introduza o nome");
        String nome = in.nextLine();

        Jogador novoJogador = new Jogador(nome, 50, 5, 5);
        jogadores.add(novoJogador);

    }

    public static void criarJogador(int quantidade){

        for (int i = 0; i < quantidade; i++){

            Scanner in = new Scanner(System.in);

            // Receber dados do utilizador
            System.out.println("Introduza o nome");
            String nome = in.nextLine();

            Jogador novoJogador = new Jogador(nome, 50, 5, 5);
            jogadores.add(novoJogador);

        }

    }

    public Jogador(){}

    public Jogador(String nome, int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public void Load(){
        x = 0;
        y = 20;
        z = 10;
        mesh = new Mesh3D();
    }

    public void Atacar(Jogador alvo){

        System.out.println("O jogador " + nome + " atacou " + alvo.nome + "!");
        alvo.pontosDeVida = alvo.pontosDeVida - (pontosDeAtaque - pontosDeDefesa);
        System.out.println(alvo.nome + " ficou com " + alvo.pontosDeVida + " pontos de vida");

    }

    public void Informações(){
        System.out.println("Jogador - " + nome);
        System.out.println("x - " + x);
        System.out.println("y - " + y);
        System.out.println("z - " + z);
    }

}
