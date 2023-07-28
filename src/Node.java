public class Node {

    private Organograma organograma;
    private Node noEsquerda;
    private Node noDireita;

    public Node() {}

    public Node(Organograma organograma) {
        this.organograma = organograma;
    }

    public Organograma getOrganograma() {
        return organograma;
    }

    public void setOrganograma(Organograma organograma) {
        this.organograma = organograma;
    }

    public Node getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(Node noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public Node getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(Node noDireita) {
        this.noDireita = noDireita;
    }

    @Override
    public String toString() {
        return "Node{" +
                "organograma=" + organograma +
                '}';
    }
}
