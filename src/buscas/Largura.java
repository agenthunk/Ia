package buscas;

import estruturas.Fila;
import grafocidades.Adjacente;
import grafocidades.Cidade;
import grafocidades.Mapa;
import java.util.Scanner;
import mensagens.Mensagem;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Largura {

    private Fila fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Largura(Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;

        fronteira = new Fila(20);
        fronteira.enfileirar(inicio);

        achou = false;
    }

    public void buscar() {

        Cidade primeiro = fronteira.getPrimeiro();
        System.out.println("Primeiro: " + primeiro.getNome());

        if (primeiro == objetivo) {
            achou = true;
        } else {
            System.out.println("Desenfileirou: " + fronteira.desenfileirar().getNome());

            for (Adjacente a : primeiro.getAdjacentes()) {
                System.out.println("Verificando se já visitado: " + a.getCidade().getNome());

                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.enfileirar(a.getCidade());
                }
            }

            if (fronteira.getNumeroElementos() > 0) {
                buscar();
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner java = new Scanner(System.in);
        Mapa mapa = new Mapa();
        Mensagem.menu();
        
        while (true) {
            System.out.println("Escolha uma Cidade para chegar em Bucharest ou Digite 0 para sair");
            int opcao = Integer.parseInt(java.nextLine());

            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Largura a = new Largura(mapa.getArad(), mapa.getBucharest());
                    a.buscar();
                    Mensagem.separador();
                case 2:
                    Largura b = new Largura(mapa.getBucharest(), mapa.getBucharest());
                    b.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 3:
                    Largura c = new Largura(mapa.getCraiova(), mapa.getBucharest());
                    c.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 4:
                    Largura d = new Largura(mapa.getDobreta(), mapa.getBucharest());
                    d.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 5:
                    Largura e = new Largura(mapa.getEforie(), mapa.getBucharest());
                    e.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 6:
                    Largura f = new Largura(mapa.getFagaras(), mapa.getBucharest());
                    f.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 7:
                    Largura g = new Largura(mapa.getGiurgiu(), mapa.getBucharest());
                    g.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 8:
                    Largura h = new Largura(mapa.getHirsova(), mapa.getBucharest());
                    h.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 9:
                    Largura i = new Largura(mapa.getIasi(), mapa.getBucharest());
                    i.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 10:
                    Largura l = new Largura(mapa.getLugoj(), mapa.getBucharest());
                    l.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 11:
                    Largura m = new Largura(mapa.getMehadia(), mapa.getBucharest());
                    m.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 12:
                    Largura n = new Largura(mapa.getNeamt(), mapa.getBucharest());
                    n.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 13:
                    Largura o = new Largura(mapa.getOradea(), mapa.getBucharest());
                    o.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 14:
                    Largura p = new Largura(mapa.getPitesti(), mapa.getBucharest());
                    p.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 15:
                    Largura r = new Largura(mapa.getRimnicuVilcea(), mapa.getBucharest());
                    r.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 16:
                    Largura s = new Largura(mapa.getSibiu(), mapa.getBucharest());
                    s.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 17:
                    Largura t = new Largura(mapa.getTimisoara(), mapa.getBucharest());
                    t.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 18:
                    Largura u = new Largura(mapa.getUrziceni(), mapa.getBucharest());
                    u.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 19:
                    Largura v = new Largura(mapa.getVaslui(), mapa.getBucharest());
                    v.buscar();
                    Mensagem.separador();
                    Mensagem.menu();
                    break;
                case 20:
                    Largura z = new Largura(mapa.getZerind(), mapa.getBucharest());
                    z.buscar();
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
