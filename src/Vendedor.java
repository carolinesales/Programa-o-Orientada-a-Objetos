public class Vendedor {

    private String nome;
    private String endereco;
    private double codigo;
    private float comissao = 10;

    public Vendedor(String nome, String endereco, double codigo) {
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }



}



