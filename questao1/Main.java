package questao1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nomeUsuario, dataNascimento, senha;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o nome do usuário: ");
    nomeUsuario = ler .nextLine();
    System.out.println("Digite sua data de nascimento: ");
    dataNascimento = ler .nextLine();
    System.out.println("Digite sua senha: ");
    senha = ler .nextLine();

    RedeSocial redeSocial = new RedeSocial(nomeUsuario, dataNascimento, senha);

    System.out.println("Digite um texto para sua primeira publicação:");
    String textoPublicacao = ler .nextLine();
    System.out.println("Link da mídia:");
    String linkMidia = ler .nextLine();
    Publicacao publicacao = new Publicacao(textoPublicacao, linkMidia);
    redeSocial.inserePublicacao(publicacao);

    int opcao = 0;
    do {
      System.out.println("Deseja inserir outra publicação? \n <1> Sim e <2> Não ");
      opcao = ler .nextInt();

      switch (opcao) {
        case 1:
        ler  = new Scanner(System.in);
          System.out.println("Faça uma publicação:");
          textoPublicacao = ler .nextLine();
          System.out.println("Link da mídia:");
          linkMidia = ler .nextLine();
          publicacao = new Publicacao(textoPublicacao, linkMidia);
          redeSocial.inserePublicacao(publicacao);
          break;
        case 2:
          opcao = 2;
          break;
        default:
          opcao = 2;
          break;
      }
    } while (opcao != 2);

    redeSocial.imprimePublicacoes();
  }

}