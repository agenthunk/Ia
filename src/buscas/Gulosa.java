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

        long inicio = 0;
        long fim = 0;

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
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getArad());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 2:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getBucharest());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 3:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getCraiova());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 4:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getDobreta());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 5:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getEforie());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 6:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getFagaras());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 7:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getGiurgiu());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 8:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getHirsova());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 9:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getIasi());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 10:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getLugoj());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 11:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getMehadia());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 12:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getNeamt());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 13:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getOradea());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 14:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getPitesti());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 15:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getRimnicuVilcea());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 16:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getSibiu());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 17:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getTimisoara());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 18:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getUrziceni());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 19:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getVaslui());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 20:
                    inicio = System.currentTimeMillis();
                    escolha.buscar(mapa.getZerind());
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

}
