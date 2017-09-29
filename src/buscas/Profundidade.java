package buscas;

import estruturas.Pilha;
import grafocidades.Cidade;
import grafocidades.Adjacente;
import grafocidades.Mapa;
import java.util.Scanner;
import mensagens.Mensagem;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Profundidade {

    private Pilha fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Profundidade(Cidade inicio, Cidade objetivo) {

        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;

        fronteira = new Pilha(20);
        fronteira.empilhar(inicio);
        achou = false;
    }

    public void buscar() {

        Cidade topo = fronteira.getTopo();
        System.out.println("Topo: " + topo.getNome());

        if (topo == objetivo) {
            achou = true;
        } else {
            for (Adjacente a : topo.getAdjacentes()) {
                if (!achou) {
                    System.out.println("Verificando se já visitado: " + a.getCidade().getNome());
                    if (!a.getCidade().isVisitado()) {
                        a.getCidade().setVisitado(true);
                        fronteira.empilhar(a.getCidade());
                        buscar();
                    }
                }
            }
        }

        System.out.println("Desempilhou: " + fronteira.desempilhar().getNome());
    }

    public static void main(String[] args) {

        long inicio;
        long fim;
        Mapa mapa = new Mapa();
        Scanner java = new Scanner(System.in);
        Mensagem.menu();

        while (true) {
            System.out.println("Escolha uma Cidade para chegar em Bucharest ou Digite 0 para sair");
            int opcao = Integer.parseInt(java.nextLine());

            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Profundidade a = new Profundidade(mapa.getArad(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    a.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                case 2:
                    Profundidade b = new Profundidade(mapa.getBucharest(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    b.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 3:
                    Profundidade c = new Profundidade(mapa.getCraiova(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    c.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 4:
                    Profundidade d = new Profundidade(mapa.getDobreta(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    d.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 5:
                    Profundidade e = new Profundidade(mapa.getEforie(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    e.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 6:
                    Profundidade f = new Profundidade(mapa.getFagaras(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    f.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 7:
                    Profundidade g = new Profundidade(mapa.getGiurgiu(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    g.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 8:
                    Profundidade h = new Profundidade(mapa.getHirsova(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    h.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 9:
                    Profundidade i = new Profundidade(mapa.getIasi(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    i.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 10:
                    Profundidade l = new Profundidade(mapa.getLugoj(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    l.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 11:
                    Profundidade m = new Profundidade(mapa.getMehadia(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    m.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 12:
                    Profundidade n = new Profundidade(mapa.getNeamt(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    n.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 13:
                    Profundidade o = new Profundidade(mapa.getOradea(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    o.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 14:
                    Profundidade p = new Profundidade(mapa.getPitesti(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    p.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 15:
                    Profundidade r = new Profundidade(mapa.getRimnicuVilcea(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    r.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 16:
                    Profundidade s = new Profundidade(mapa.getSibiu(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    s.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 17:
                    Profundidade t = new Profundidade(mapa.getTimisoara(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    t.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 18:
                    Profundidade u = new Profundidade(mapa.getUrziceni(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    u.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 19:
                    Profundidade v = new Profundidade(mapa.getVaslui(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    v.buscar();
                    fim = System.currentTimeMillis();
                    System.out.println("Tempo de execução: " + (fim - inicio));
                    break;
                case 20:
                    Profundidade z = new Profundidade(mapa.getZerind(), mapa.getBucharest());
                    inicio = System.currentTimeMillis();
                    z.buscar();
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
