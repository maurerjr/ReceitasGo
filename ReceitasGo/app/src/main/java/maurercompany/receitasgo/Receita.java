package maurercompany.receitasgo;

public class Receita {

    private String ed1;
    private String ed2;
    private String preparo;
    private String nome;

    public Receita(String ed1, String ed2, String nome, String preparo) {
        this.ed1 = ed1;
        this.ed2 = ed2;
        this.nome = nome;
        this.preparo = preparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEd1() {
        return ed1;
    }

    public void setEd1(String ed1) {
        this.ed1 = ed1;
    }

    public String getEd2() {
        return ed2;
    }

    public void setEd2(String ed2) {
        this.ed2 = ed2;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "ed1='" + ed1 + '\'' +
                ", ed2='" + ed2 + '\'' +
                ", preparo='" + preparo + '\'' +
                '}';
    }
}