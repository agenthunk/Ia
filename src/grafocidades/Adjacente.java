package grafocidades;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Adjacente {

    private Cidade cidade;
    private int distancia;
    private int distanciaAEstrela;

    public Adjacente(Cidade cidade, int distancia) {
        this.cidade = cidade;
        this.distancia = distancia;
        //Distancia em linha reta + distancia pela estrada
        this.distanciaAEstrela = this.cidade.getDistanciaObjetivo() + this.distancia;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistanciaAEstrela() {
        return distanciaAEstrela;
    }
}
