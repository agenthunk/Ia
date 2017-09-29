package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Pilha {

    private int tamanho;
    private Cidade[] cidades;
    private int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[this.tamanho];
        topo = -1;
    }

    public void empilhar(Cidade cidade) {
        if (!pilhaCheia()) {
            this.cidades[++topo] = cidade;
        } else {
            System.out.println("A pilha já está cheia!");
        }
    }

    public Cidade desempilhar() {
        if (!pilhaVazia()) {
            return cidades[topo--];
        } else {
            System.out.println("A pilha já está vazia");
            return null;
        }
    }

    public Cidade getTopo() {
        return cidades[topo];
    }

    private boolean pilhaVazia() {
        return (topo == -1);
    }

    private boolean pilhaCheia() {
        return (topo == tamanho - 1);
    }
    
    public static void main (String args[]){
        Pilha pilha = new Pilha(19); // Deixando uma posição a menos para testar a pilha vazia
        Mapa mapa = new Mapa();
        
        pilha.empilhar(mapa.getArad());
        pilha.empilhar(mapa.getBucharest());
        pilha.empilhar(mapa.getCraiova());
        pilha.empilhar(mapa.getDobreta());
        pilha.empilhar(mapa.getEforie());
        pilha.empilhar(mapa.getFagaras());
        pilha.empilhar(mapa.getGiurgiu());
        pilha.empilhar(mapa.getHirsova());
        pilha.empilhar(mapa.getIasi());
        pilha.empilhar(mapa.getLugoj());
        pilha.empilhar(mapa.getMehadia());
        pilha.empilhar(mapa.getNeamt());
        pilha.empilhar(mapa.getOradea());
        pilha.empilhar(mapa.getPitesti());
        pilha.empilhar(mapa.getRimnicuVilcea());
        pilha.empilhar(mapa.getSibiu());
        pilha.empilhar(mapa.getTimisoara());
        pilha.empilhar(mapa.getUrziceni());
        pilha.empilhar(mapa.getVaslui());
        pilha.empilhar(mapa.getZerind());
        
        System.out.println(pilha.getTopo().getNome());
        
        pilha.desempilhar();
        
        System.out.println(pilha.getTopo().getNome());
    }
}
