package Empresa;
import java.util.ArrayList;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        // Criando o vendedor
        Vendedor vendedor = new Vendedor("Mathias");

        // Criando o pedido
        Pedido pedido = new Pedido(vendedor);

        // Adicionando os produtos ao pedido
        pedido.adicionarProduto(new Produto("Computador", "eletrônicos", 4000.0));
        pedido.adicionarProduto(new Produto("Calça Jeans", "vestuário", 89.90));
        pedido.adicionarProduto(new Produto("Coca-Cola 2L", "alimentos", 10.90));

        // Obtendo a lista de produtos do pedido
        ArrayList<Produto> produtos = pedido.getProdutos();

        // Calculando a comissão total
        double comissaoTotal = Comissao.calcularComissaoTotal(produtos);

        // Limitando a quantidade de dígitos decimais para 2
        DecimalFormat df = new DecimalFormat("#.00");
        String comissaoTotalFormatada = df.format(comissaoTotal);

        System.out.println("Comissão total para o vendedor " + pedido.getVendedor().getNome() + ": R$ " + comissaoTotalFormatada);
    }
}