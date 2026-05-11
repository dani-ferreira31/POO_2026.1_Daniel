public class instrumento {

    private String nome;
    private String tipo;
    private double preco;


    public instrumento(String nome, String tipo, double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
