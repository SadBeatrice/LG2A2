package Empresa;
import java.util.ArrayList;

public class RepresentanteDeVendas extends Mercador {

    private RegiaoDeVendas regiaoDeVendas;

    private ArrayList<ZonaDeVendas> zonasDeVendas;
    public RepresentanteDeVendas(String nome) {
        super(nome);
        zonasDeVendas = new ArrayList<>();
    }

    public String getNome() {
        return super.getNome();
    }

    public String getRegiaoDeVendas() {
        return regiaoDeVendas.getNomeRegiao();
    }

    public void setRegiaoDeVendas(RegiaoDeVendas regiaoDeVendas) {
        this.regiaoDeVendas = regiaoDeVendas;
    }

    public double getValorVendas() {
        return super.getValorVendas();
    }

    public double getComissao() {
        return super.getComissao();
    }

    public void setZonasDeVendas(ArrayList<ZonaDeVendas> zonasDeVendas){
       this.zonasDeVendas = (ArrayList<ZonaDeVendas>) zonasDeVendas.clone();
    }

    public int quantideZonaVendas(){
        return zonasDeVendas.size();
    }

    public ZonaDeVendas getZonaVendas(int posicao){
        return zonasDeVendas.get(posicao);
    }

}
