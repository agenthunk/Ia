package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Fila {

    private int tamanho;
    private Cidade[] cidades;
    private int inicio;
    private int fim;
    private int numeroElementos;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        cidades = new Cidade[tamanho];

        inicio = 0;
        fim = -1;
        numeroElementos = 0;
    }

    public void enfileirar(Cidade cidade) {

        if (!filaCheia()) {
            if (fim == tamanho - 1) {
                fim = -1;
            }

            cidades[++fim] = cidade;
            numeroElementos++;
        } else {
            System.out.println("A fila já está cheia!");
        }
    }

    public Cidade desenfileirar() {

        if (!filaVazia()) {
            Cidade temp = cidades[inicio++];

            if (inicio == tamanho) {
                inicio = 0;
            }

            numeroElementos--;
            return temp;
        } else {
            System.out.println("A fila já está vazia");
            return null;
        }
    }

    public Cidade getPrimeiro() {
        return cidades[inicio];
    }

    public boolean filaVazia() {
        return (numeroElementos == 0);
    }

    public boolean filaCheia() {
        return (numeroElementos == tamanho);
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }
    
    public static void main(String[] args) {
        Fila fila = new Fila(19); // Deixando uma posição a menos para testar a pilha cheia
        Mapa mapa = new Mapa();
        
        fila.enfileirar(mapa.getArad());
        fila.enfileirar(mapa.getBucharest());
        fila.enfileirar(mapa.getCraiova());
        fila.enfileirar(mapa.getDobreta());
        fila.enfileirar(mapa.getEforie());
        fila.enfileirar(mapa.getFagaras());
        fila.enfileirar(mapa.getGiurgiu());
        fila.enfileirar(mapa.getHirsova());
        fila.enfileirar(mapa.getIasi());
        fila.enfileirar(mapa.getLugoj());
        fila.enfileirar(mapa.getMehadia());
        fila.enfileirar(mapa.getNeamt());
        fila.enfileirar(mapa.getOradea());
        fila.enfileirar(mapa.getPitesti());
        fila.enfileirar(mapa.getRimnicuVilcea());
        fila.enfileirar(mapa.getSibiu());
        fila.enfileirar(mapa.getTimisoara());
        fila.enfileirar(mapa.getUrziceni());
        fila.enfileirar(mapa.getVaslui());
        fila.enfileirar(mapa.getZerind());
        
    }

}
