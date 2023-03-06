public class No {

    No esq,dir;
    Person novo_contato;

    public No() {
        this(null);
    }

    public No(Person novo_contato) {
        this.novo_contato = novo_contato;
        esq = dir = null;
    }
    
}
