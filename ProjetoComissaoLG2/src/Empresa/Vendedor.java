package Empresa;


import java.util.ArrayList;

public class Vendedor extends Mercador {

     //lista de clientes cadastrados
    private ArrayList<Cliente> clientes;

    private ZonaDeVendas zonaDeVendas;
    private RegiaoDeVendas regiaoDeVendas;

    public Vendedor(String nome, ArrayList<Cliente> clientes, ZonaDeVendas zonaDeVendas, RegiaoDeVendas regiaoDeVendas) {
        super(nome);
        this.clientes = clientes;
        this.zonaDeVendas = zonaDeVendas;
        this.regiaoDeVendas = regiaoDeVendas;
    }

    public Vendedor(String nome) {
        super(nome);
        clientes = new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        cliente.setVendedor(this);
    }

    public int quantidadeClientes(){
        return clientes.size();
    }

    public Cliente getCliente(int posicao){
        return clientes.get(posicao);
    }


    public String getNome() {
        return super.getNome();
    }


    public String getZonaDeVendas() {
        return zonaDeVendas.getNomeZona();
    }

    public String getRegiaoDeVendas() {
        return regiaoDeVendas.getNomeRegiao();
    }

    public void setZonaDeVendas(ZonaDeVendas zonaDeVendas) {
        this.zonaDeVendas = zonaDeVendas;
    }

    public void setRegiaoDeVendas(RegiaoDeVendas regiaoDeVendas) {
        this.regiaoDeVendas = regiaoDeVendas;
    }


    // Comissao
    public double calcularComissao(Produto produto) {
        double comissao = 0.0;
        String categoria = produto.getCategoria();

        // Defina as porcentagens de comissão por categoria
        if (categoria.equals("eletrônicos")) {
            comissao = produto.getPreco() * 0.02;
        } else if (categoria.equals("vestuário")) {
            comissao = produto.getPreco() * 0.03;
        } else if (categoria.equals("alimentos")) {
            comissao = produto.getPreco() * 0.04;
        }

        return comissao;
    }

}
