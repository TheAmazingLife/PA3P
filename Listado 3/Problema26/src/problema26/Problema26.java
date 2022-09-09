package problema26;

import java.util.ArrayList;

public class Problema26 {

    public static void main(String[] args) {
        Deposito dep = new Deposito();
        Bebida b1 = new Bebida(1111);
        dep.addBebida(b1);
        Bebida b2 = new Bebida(2222);
        dep.addBebida(b2);
        dep.getBebida();
        dep.getBebida();
        dep.getBebida();
    }

}

class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public void beber() {

    }

    public int getSerie() {
        return serie;
    }
}

class Deposito {

    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        al.add(b);
    }

    public Bebida getBebida() {
        if (al.isEmpty()) {
            return null;
        } else {
            Bebida aux = al.get(0);
            al.remove(0);
            return aux;
        }
    }
}
