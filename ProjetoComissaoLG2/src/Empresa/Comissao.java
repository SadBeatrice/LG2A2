package Empresa;

import java.util.ArrayList;

class Comissao {
    private static final double COMISSAO_ELETRONICOS = 0.05;
    private static final double COMISSAO_VESTUARIO = 0.07;
    private static final double COMISSAO_ALIMENTOS = 0.10;

    public static double calcularComissao(Produto produto) {
        double comissao = 0.0;
        String categoria = produto.getCategoria();

        if (categoria.equals("eletrônicos")) {
            comissao = produto.getPreco() * COMISSAO_ELETRONICOS;
        } else if (categoria.equals("vestuário")) {
            comissao = produto.getPreco() * COMISSAO_VESTUARIO;
        } else if (categoria.equals("alimentos")) {
            comissao = produto.getPreco() * COMISSAO_ALIMENTOS;
        }

        return comissao;
    }

    public static double calcularComissaoTotal(ArrayList<Produto> produtos) {
        double comissaoTotal = 0.0;

        for (Produto produto : produtos) {
            double comissao = calcularComissao(produto);
            comissaoTotal += comissao;
        }

        return comissaoTotal;
    }
}