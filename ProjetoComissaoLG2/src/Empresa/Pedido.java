package Empresa;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    final private String codigo;
    private ArrayList<Produto> produtos;
    private Vendedor vendedor;
    private Cliente cliente;

    public Pedido(Vendedor vendedor) {
        this.codigo = String.valueOf((new Date().getTime()));
        this.produtos = new ArrayList<>();
        this.vendedor = vendedor;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public int quantidadeProdutos(){
        return produtos.size();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}

