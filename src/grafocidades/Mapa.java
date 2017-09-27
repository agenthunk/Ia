package grafocidades;

/**
 *
 * @author Ueslei e Lucilius 6º Período Sistemas de Informação
 */
public class Mapa {

    private Cidade arad;
    private Cidade bucharest;
    private Cidade craiova;
    private Cidade dobreta;
    private Cidade eforie;
    private Cidade fagaras;
    private Cidade giurgiu;
    private Cidade hirsova;
    private Cidade iasi;
    private Cidade lugoj;
    private Cidade mehadia;
    private Cidade neamt;
    private Cidade oradea;
    private Cidade pitesti;
    private Cidade rimnicuVilcea;
    private Cidade sibiu;
    private Cidade timisoara;
    private Cidade urziceni;
    private Cidade vaslui;
    private Cidade zerind;

    public Mapa() {
        arad = new Cidade("Arad", 366);
        bucharest = new Cidade("Bucharest", 0);
        craiova = new Cidade("Craiova", 160);
        dobreta = new Cidade("Dobreta", 242);
        eforie = new Cidade("Eforie", 161);
        fagaras = new Cidade("Fagaras", 178);
        giurgiu = new Cidade("Giurgiu", 77);
        hirsova = new Cidade("Hirsova", 151);
        iasi = new Cidade("Iasi", 226);
        lugoj = new Cidade("Lugoj", 244);
        mehadia = new Cidade("Mehadia", 241);
        neamt = new Cidade("Neamt", 234);
        oradea = new Cidade("Oredea", 380);
        pitesti = new Cidade("Pitesti", 98);
        rimnicuVilcea = new Cidade("Rimnicu Vilcea", 193);
        sibiu = new Cidade("Sibiu", 253);
        timisoara = new Cidade("Timisoara", 329);
        urziceni = new Cidade("Urzicenti", 80);
        vaslui = new Cidade("Vaslui", 199);
        zerind = new Cidade("Zerind", 374);
        
        arad.addCidadeAdjacente(new Adjacente(zerind, 75));
        arad.addCidadeAdjacente(new Adjacente(sibiu, 140));
        arad.addCidadeAdjacente(new Adjacente(timisoara, 118));
        
        bucharest.addCidadeAdjacente(new Adjacente(giurgiu, 90));
        bucharest.addCidadeAdjacente(new Adjacente(urziceni, 85));
        bucharest.addCidadeAdjacente(new Adjacente(pitesti, 101));
        bucharest.addCidadeAdjacente(new Adjacente(fagaras, 211));
        
        craiova.addCidadeAdjacente(new Adjacente(dobreta, 120));
        craiova.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 146));
        craiova.addCidadeAdjacente(new Adjacente(pitesti, 138));
        
        dobreta.addCidadeAdjacente(new Adjacente(craiova, 120));
        dobreta.addCidadeAdjacente(new Adjacente(mehadia, 75));
        
        eforie.addCidadeAdjacente(new Adjacente(hirsova, 86));
        
        fagaras.addCidadeAdjacente(new Adjacente(bucharest, 211));
        fagaras.addCidadeAdjacente(new Adjacente(sibiu, 99));
        
        giurgiu.addCidadeAdjacente(new Adjacente(bucharest, 90));
        
        hirsova.addCidadeAdjacente(new Adjacente(eforie, 86));
        hirsova.addCidadeAdjacente(new Adjacente(urziceni, 98));
        
        iasi.addCidadeAdjacente(new Adjacente(neamt, 87));
        iasi.addCidadeAdjacente(new Adjacente(vaslui, 92));
        
        lugoj.addCidadeAdjacente(new Adjacente(timisoara, 111));
        lugoj.addCidadeAdjacente(new Adjacente(mehadia, 70));
        
        mehadia.addCidadeAdjacente(new Adjacente(dobreta, 75));
        mehadia.addCidadeAdjacente(new Adjacente(lugoj, 70));
        
        neamt.addCidadeAdjacente(new Adjacente(iasi, 87));
        
        oradea.addCidadeAdjacente(new Adjacente(zerind, 71));
        oradea.addCidadeAdjacente(new Adjacente(sibiu, 151));
        
        pitesti.addCidadeAdjacente(new Adjacente(bucharest, 101));
        pitesti.addCidadeAdjacente(new Adjacente(craiova, 138));
        pitesti.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 97));
        
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(sibiu, 80));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(craiova, 146));
        rimnicuVilcea.addCidadeAdjacente(new Adjacente(pitesti, 97));
        
        sibiu.addCidadeAdjacente(new Adjacente(fagaras, 99));
        sibiu.addCidadeAdjacente(new Adjacente(oradea, 151));
        sibiu.addCidadeAdjacente(new Adjacente(arad, 140));
        sibiu.addCidadeAdjacente(new Adjacente(rimnicuVilcea, 80));
        
        timisoara.addCidadeAdjacente(new Adjacente(lugoj, 111));
        timisoara.addCidadeAdjacente(new Adjacente(arad, 118));
        
        urziceni.addCidadeAdjacente(new Adjacente(hirsova, 98));
        urziceni.addCidadeAdjacente(new Adjacente(vaslui, 142));
        urziceni.addCidadeAdjacente(new Adjacente(bucharest, 85));
        
        vaslui.addCidadeAdjacente(new Adjacente(iasi, 92));
        vaslui.addCidadeAdjacente(new Adjacente(urziceni, 142));
        
        zerind.addCidadeAdjacente(new Adjacente(oradea, 71));
        zerind.addCidadeAdjacente(new Adjacente(arad, 75));
    }

    public Cidade getArad() {
        return arad;
    }

    public void setArad(Cidade arad) {
        this.arad = arad;
    }

    public Cidade getBucharest() {
        return bucharest;
    }

    public void setBucharest(Cidade bucharest) {
        this.bucharest = bucharest;
    }

    public Cidade getCraiova() {
        return craiova;
    }

    public void setCraiova(Cidade craiova) {
        this.craiova = craiova;
    }

    public Cidade getDobreta() {
        return dobreta;
    }

    public void setDobreta(Cidade dobreta) {
        this.dobreta = dobreta;
    }

    public Cidade getEforie() {
        return eforie;
    }

    public void setEforie(Cidade eforie) {
        this.eforie = eforie;
    }

    public Cidade getFagaras() {
        return fagaras;
    }

    public void setFagaras(Cidade fagaras) {
        this.fagaras = fagaras;
    }

    public Cidade getGiurgiu() {
        return giurgiu;
    }

    public void setGiurgiu(Cidade giurgiu) {
        this.giurgiu = giurgiu;
    }

    public Cidade getHirsova() {
        return hirsova;
    }

    public void setHirsova(Cidade hirsova) {
        this.hirsova = hirsova;
    }

    public Cidade getIasi() {
        return iasi;
    }

    public void setIasi(Cidade iasi) {
        this.iasi = iasi;
    }

    public Cidade getLugoj() {
        return lugoj;
    }

    public void setLugoj(Cidade lugoj) {
        this.lugoj = lugoj;
    }

    public Cidade getMehadia() {
        return mehadia;
    }

    public void setMehadia(Cidade mehadia) {
        this.mehadia = mehadia;
    }

    public Cidade getNeamt() {
        return neamt;
    }

    public void setNeamt(Cidade neamt) {
        this.neamt = neamt;
    }

    public Cidade getOradea() {
        return oradea;
    }

    public void setOradea(Cidade oradea) {
        this.oradea = oradea;
    }

    public Cidade getPitesti() {
        return pitesti;
    }

    public void setPitesti(Cidade pitesti) {
        this.pitesti = pitesti;
    }

    public Cidade getRimnicuVilcea() {
        return rimnicuVilcea;
    }

    public void setRimnicuVilcea(Cidade rimnicuVilcea) {
        this.rimnicuVilcea = rimnicuVilcea;
    }

    public Cidade getSibiu() {
        return sibiu;
    }

    public void setSibiu(Cidade sibiu) {
        this.sibiu = sibiu;
    }

    public Cidade getTimisoara() {
        return timisoara;
    }

    public void setTimisoara(Cidade timisoara) {
        this.timisoara = timisoara;
    }

    public Cidade getUrziceni() {
        return urziceni;
    }

    public void setUrziceni(Cidade urziceni) {
        this.urziceni = urziceni;
    }

    public Cidade getVaslui() {
        return vaslui;
    }

    public void setVaslui(Cidade vaslui) {
        this.vaslui = vaslui;
    }

    public Cidade getZerind() {
        return zerind;
    }

    public void setZerind(Cidade zerind) {
        this.zerind = zerind;
    }
}
