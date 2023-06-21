package Empresa;

import java.text.MessageFormat;

public class TesteRegioesClienteseVendedores {
    public static void main(String[] args) {

        //Criando empresa
        EmpresaXyz empresaXyz = new EmpresaXyz();

        //Criando setor de vendas
        SetorVendas vendas = new SetorVendas("Matriz");

        //Criando regioes de vendas
        RegiaoDeVendas regiaoNordeste = new RegiaoDeVendas("Nordeste");
        RegiaoDeVendas regiaoSudeste = new RegiaoDeVendas("Sudeste");

        //Criando representantes de vendas
        RepresentanteDeVendas representante1 = new RepresentanteDeVendas("João");
        RepresentanteDeVendas representante2 = new RepresentanteDeVendas("Maria");

        //Criando zonas de vendas
        ZonaDeVendas bahia = new ZonaDeVendas( "Bahia");
        ZonaDeVendas ceara = new ZonaDeVendas( "Ceará");
        ZonaDeVendas saoPaulo = new ZonaDeVendas( "São Paulo");
        ZonaDeVendas rioDeJaneiro = new ZonaDeVendas( "Rio de Janeiro");

        //Criando vendedores
        Vendedor vendedor1 = new Vendedor("Mathias");
        Vendedor vendedor2 = new Vendedor("Seu Jorge");
        Vendedor vendedor3 = new Vendedor("Seu Jõao");
        Vendedor vendedor4 = new Vendedor("Seu Carlos");

        //Criando cliente
        Cliente Clientinho = new Cliente("123.456.789-10", "Clientinho", "SP");

        //Definindo área de vendas
        empresaXyz.setVendas(vendas);

        //Relacionando as regioes de vendas ao setor de vendas
        vendas.adicionarRegiaoVendas(regiaoNordeste);
        vendas.adicionarRegiaoVendas(regiaoSudeste);

        //Relacionando as zonas de vendas às regioes de vendas
        regiaoNordeste.adicionarZonaVendas(bahia);
        regiaoNordeste.adicionarZonaVendas(ceara);
        regiaoSudeste.adicionarZonaVendas(saoPaulo);
        regiaoSudeste.adicionarZonaVendas(rioDeJaneiro);

        //Relacionando os representantes de vendas às regioes de vendas
        regiaoNordeste.setRepresentante(representante1);
        regiaoSudeste.setRepresentante(representante2);


        //Relacionando vendedores às zonas de vendas
        bahia.setVendedor(vendedor1);
        ceara.setVendedor(vendedor2);
        saoPaulo.setVendedor(vendedor3);
        rioDeJaneiro.setVendedor(vendedor4);

        //Definindo o cliente Clientinho como cliente do vendedor 1 (Mathias)
        vendedor1.adicionarCliente(Clientinho);

        // TESTES:

        //exibindo regiao, zona de vendas de um vendedor

        System.out.println(MessageFormat.format("O vendedor {0} está na zona de vendas {1}, " +
                "que está na regiao de vendas {2}", vendedor1.getNome(),vendedor1.getZonaDeVendas(),vendedor1.getRegiaoDeVendas()));

        //exibindo clientes de um vendedor
        System.out.println(MessageFormat.format("O vendedor {0} possui o(s) cliente(s) cadastrado(s):", vendedor1.getNome()));
        for (int i = 0; i < vendedor1.quantidadeClientes();i++ ) {
            System.out.println(vendedor1.getCliente(i).getNome());
        }

        //exibindo regiao de um representante de vendas

        System.out.println(MessageFormat.format("\nO representante de vendas {0} está na regiao {1}\n", representante1.getNome(), representante1.getRegiaoDeVendas()));

        //exibindo zonas pelas quais um representante está responsável

        System.out.println(MessageFormat.format("O representante de vendas {0} está responsável pelas zonas: \n", representante2.getNome()));
        for (int i = 0; i < representante1.quantideZonaVendas();i++ ) {
            System.out.println(representante1.getZonaVendas(i).getNomeZona() + " ");
        }

        //exibindo nome da zona, regiao e vendedor responsável
        System.out.println(MessageFormat.format("\nA zona de vendas {0} está na regiao {1} e seu vendedor responsável é {2}\n", saoPaulo.getNomeZona(),
                saoPaulo.getNomeRegiao(), saoPaulo.getNomeVendedor()));

        //exibindo nome, cpf uf, regiao, zona e vendedor de um cliente


       System.out.println("O cliente " + Clientinho.getNome() + " cujo cpf é "+ Clientinho.getCpf()  +", é do uf " + Clientinho.getUf()
        + " e está na zona de vendas " + Clientinho.getZona() + ", que está na região " + Clientinho.getRegiao() + " é cliente do vendedor "
       + Clientinho.getVendedor());

    }

}

