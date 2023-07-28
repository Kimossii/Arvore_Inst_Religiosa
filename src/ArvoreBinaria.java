public class ArvoreBinaria {

    private Node raiz;

    public ArvoreBinaria() {}

    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty(){
        if(raiz == null){return true;}
        return false;}

    public int getAltura(){
        return getAltura(this.raiz);
    }

    private int getAltura(Node raiz){
        if(raiz == null){
            return 0;
        }
        int altEsq = getAltura(raiz.getNoEsquerda());
        int altDir = getAltura(raiz.getNoDireita());
        if(altEsq > altDir){
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public int getQtdNode(){
        return getQtdNode(raiz);
    }

    private int getQtdNode(Node raiz){
        if(raiz == null){
            return 0;
        }
        int qtdNodeEsq = getQtdNode(raiz.getNoEsquerda());
        int qtdNodeDireita = getQtdNode(raiz.getNoDireita());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }

    public void imprimirArvore(){
        if(this.raiz == null)
            System.out.println("Árvore vazia");
        else
            imprimirArvore(this.raiz);
    }

    private void imprimirArvore(Node node){
        if(node.getNoEsquerda() != null){
            imprimirArvore(node.getNoEsquerda());
        }
        if (node.getNoDireita() != null){
            imprimirArvore(node.getNoDireita());
        }
        System.out.println("Nó: " + node.getOrganograma());
    }

    public void inserir(Organograma organograma){
        inserir(this.raiz, organograma);
    }


    public void inserir(Node node, Organograma organograma) {
        if(this.raiz == null){
           if (organograma.getFuncao().equalsIgnoreCase("Paroco")){
               this.raiz = new Node(organograma);
           }
        } else {
            if (organograma.getFuncao().equalsIgnoreCase("padre")){
                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), organograma);
                } else {
                    //Se nodo esquerdo vazio insere o novo no aqui
                    node.setNoEsquerda(new Node(organograma));
                }
                //Verifica se o valor a ser inserido é maior que o no corrente da árvore, se sim vai para subarvore direita
            } else if (organograma.getFuncao().equalsIgnoreCase("vigario")) {
                //Se tiver elemento no no direito continua a busca
                if (node.getNoDireita() != null) {
                    inserir(node.getNoDireita(), organograma);
                } else {
                    //Se nodo direito vazio insere o novo no aqui
                    node.setNoDireita(new Node(organograma));
                }
            }else if (organograma.getFuncao().equalsIgnoreCase("Arcediago")) {
                if (node.getNoDireita() != null) {
                     inserir(node.getNoDireita(), organograma);
                } else {
                    //Se nodo direito vazio insere o novo no aqui
                    node.setNoDireita(new Node(organograma));
                }
            }else if (organograma.getFuncao().equalsIgnoreCase("Diacono")) {

                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), organograma);
                } else {
                    //Se nodo esquerdo vazio insere o novo no aqui
                    node.setNoEsquerda(new Node(organograma));
                }
            }else if (organograma.getFuncao().equalsIgnoreCase("Coordenador")) {
                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), organograma);
                } else {
                    //Se nodo esquerdo vazio insere o novo no aqui
                    node.setNoEsquerda(new Node(organograma));
                }
            }else if (organograma.getFuncao().equalsIgnoreCase("Vice Coordenador")) {

                if (node.getNoEsquerda() != null) {
                    inserir(node.getNoEsquerda(), organograma);
                } else {
                    //Se nodo esquerdo vazio insere o novo no aqui
                    node.setNoEsquerda(new Node(organograma));
                }
            }

        }
    }

    public void remover(Organograma organograma) throws Exception{
        remover(this.raiz, organograma);
    }

    public void remover(Node node,Organograma organograma) throws Exception{
        if (node!= null ){
            boolean flag = false;
            if (organograma.getFuncao().equalsIgnoreCase(node.getOrganograma().getFuncao()) && node.getNoEsquerda()==null && node.getNoDireita()==null){
                node=null;
                flag=true;
            }
            if (!flag){
                remover(node.getNoEsquerda(),organograma);
                remover(node.getNoDireita(),organograma);
            }
            if (flag ==false){
                if (node.getNoEsquerda()==null){
                    node.setNoEsquerda(null);
                }
                if (node.getNoDireita()==null){
                    node.setNoDireita(null);
                }
            }
        }
    }


    public void remover() {
    }
}
