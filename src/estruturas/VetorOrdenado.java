package estruturas;

import grafocidades.Cidade;
import grafocidades.Mapa;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class VetorOrdenado {

    private Cidade[] cidades;
    private int numeroElementos;

    public VetorOrdenado(int tamanho) {
        cidades = new Cidade[tamanho];
        numeroElementos = 0;
    }

    public void inserir(Cidade cidade) {
        int posicao;
        
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (cidades[posicao].getDistanciaObjetivo() > cidade.getDistanciaObjetivo()) {
                break;
            }
        }
        
        for(int k = numeroElementos; k > posicao; k--){
            cidades[k] = cidades[k - 1];
        }
        
        cidades[posicao] = cidade;
        numeroElementos++;
    }
    
    public void mostrar(){
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(cidades[i].getNome() + " - " + cidades[i].getDistanciaObjetivo());
        }
    }
    
    public Cidade getPrimeiro(){
        return cidades[0];
    }
    
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        VetorOrdenado vetor = new VetorOrdenado(20);
        
        vetor.inserir(mapa.getArad());//366
        vetor.inserir(mapa.getCraiova());//160
        vetor.inserir(mapa.getZerind());//374
        vetor.inserir(mapa.getDobreta());//374
        
        vetor.mostrar();
    }

}
