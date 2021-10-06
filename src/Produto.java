public class Produto {

    private String descricao;
    private double codigo;
    private float valorVenda, valorCusto;
    private int promocao;

    public Produto(String descricao, double codigo, float valorVenda, float valorCusto, int promocao) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }
    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getPromocao() {
        return promocao;
    }
    public void setPromocao(int promocao) {
        this.promocao = promocao;
    }
}
