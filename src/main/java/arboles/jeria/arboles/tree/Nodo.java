package arboles.jeria.arboles.tree;

public class Nodo {
    public Nodo p;
    public Nodo der;
    public Nodo izq;
    public int llave;
    public Object valor;

    public Nodo(int key) {
        this.llave = key;
        this.der=null;
        this.izq=null;
        p=null;
        valor=null;
    }
}