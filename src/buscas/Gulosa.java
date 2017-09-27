package buscas;

import estruturas.VetorOrdenado;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;
import java.util.Scanner;
import mensagens.Mensagem;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Gulosa {

    private VetorOrdenado fronteira;
    private Cidade objetivo;
    private boolean achou;

    public Gulosa(Cidade objetivo) {
        this.objetivo = objetivo;
        achou = false;
    }

    public void buscar(Cidade atual) {
        System.out.println("\nAtual: " + atual.getNome());

        if (atual == objetivo) {
            achou = true;
        } else {
            fronteira = new VetorOrdenado(atual.getAdjacentes().size());

            for (Adjacente a : atual.getAdjacentes()) {
                    fronteira.inserir(a.getCidade());
            }

            fronteira.mostrar();

            if (fronteira.getPrimeiro() != null) {
                buscar(fronteira.getPrimeiro());
            }
        }
    }

    public static void main(String[] args) {

        Scanner java = new Scanner(System.in);
        Mapa mapa = new Mapa();

        System.out.println("Busca Gulosa ");
        Mensagem.menu();

        while (true) {
            System.out.println("Escolha uma Cidade para chegar em Bucharest ou Digite 0 para sair");
            int opcao = Integer.parseInt(java.nextLine());
            
            Gulosa escolha = new Gulosa(mapa.getBucharest());
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    escolha.buscar(mapa.getArad());
                    Mensagem.separador();
                    break;
                case 2:
                    escolha.buscar(mapa.getBucharest());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 3:
                    escolha.buscar(mapa.getCraiova());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 4:
                    escolha.buscar(mapa.getDobreta());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 5:
                    escolha.buscar(mapa.getEforie());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 6:
                    escolha.buscar(mapa.getFagaras());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 7:
                    escolha.buscar(mapa.getGiurgiu());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 8:
                    escolha.buscar(mapa.getHirsova());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 9:
                    escolha.buscar(mapa.getIasi());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 10:
                    escolha.buscar(mapa.getLugoj());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 11:
                    escolha.buscar(mapa.getMehadia());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 12:
                    escolha.buscar(mapa.getNeamt());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 13:
                    escolha.buscar(mapa.getOradea());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 14:
                    escolha.buscar(mapa.getPitesti());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 15:
                    escolha.buscar(mapa.getRimnicuVilcea());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 16:
                    escolha.buscar(mapa.getSibiu());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 17:
                    escolha.buscar(mapa.getTimisoara());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 18:
                    escolha.buscar(mapa.getUrziceni());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 19:
                    escolha.buscar(mapa.getVaslui());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 20:
                    escolha.buscar(mapa.getZerind());
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
            }
        }
    }

}
