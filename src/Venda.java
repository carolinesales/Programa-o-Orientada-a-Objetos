public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private float quantidadeDeItens;
    private float valor=0;



    public Venda(Produto produto, Vendedor vendedor, float quantidadeDeItens, float desconto) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = desconto;
        this.quantidadeDeItens = quantidadeDeItens;
    }



    public float calcularValor() {
        if (produto.getPromocao() == 1) {
            valor = (quantidadeDeItens * produto.getValorVenda()) - (aplicarDesconto(desconto));
        } else {
            valor = quantidadeDeItens * produto.getValorVenda();
        }
        return valor;
    }



    public float calcularComissao() {
        float comissao;


        if (produto.getPromocao() == 1) {
            comissao = (vendedor.getComissao() / 100) * valor / 2;
        } else {
            comissao = (vendedor.getComissao() / 100) * valor;
        }

        return comissao;
    }



    public float aplicarDesconto(float desconto) {
        float des;
        des = quantidadeDeItens * (produto.getValorVenda() * (desconto / 100));

        if (produto.getValorVenda() - (produto.getValorVenda() * (desconto / 100)) < produto.getValorCusto()) {
            des = 0;
        }
        return des;
    }



    public void imprimir() {
        int a;

        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Código de funcionário: " + vendedor.getCodigo());
        System.out.println("Comissão do funcionário: " + calcularComissao());
        System.out.println("Número de itens: " + quantidadeDeItens);
        System.out.println("Valor do produto: " + produto.getValorVenda());

        a = produto.getPromocao();
        if (a == 0) {
            System.out.println("O produto selecionado não está em promoção");
        }
        if (a == 1) {
            System.out.println("O produto selecionado está em promocao!");

            if (aplicarDesconto(desconto) == 0) {
                System.out.println("Invalido");
            } else {

                System.out.println("Valor antes dos descontos: " + quantidadeDeItens * produto.getValorVenda());
                System.out.println("Porcentagem de descontos: " + desconto + "%");
                System.out.println("Valor dos descontos: " + aplicarDesconto(desconto));
            }
        }
        System.out.println("Valor final: " + calcularValor());


    }





    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(float quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}