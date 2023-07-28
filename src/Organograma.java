public class Organograma {

    private String nome;
    private String funcao;
    private String congregacao;

    public Organograma() {}

    public Organograma(String nome, String funcao, String congregacao) {
        this.nome = nome;
        this.funcao = funcao;
        this.congregacao = congregacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(String congregacao) {
        this.congregacao = congregacao;
    }

    @Override
    public String toString() {
        return "Organograma{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", congregacao='" + congregacao + '\'' +
                '}';
    }
}
