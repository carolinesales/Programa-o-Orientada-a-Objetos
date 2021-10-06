public class RegistraVenda {

    public static void main(String[] args) {
        Produto Shampoo = new Produto("Shampoo Yenzah - Essencial",1234,25,13,0);
        Vendedor Caroline = new Vendedor("Caroline Sales","Rua Renato Pollati",3004);
        Venda venda = new Venda(Shampoo, Caroline, 1,0);
        venda.calcularValor();
        venda.calcularComissao();
        venda.imprimir();

    }
}
