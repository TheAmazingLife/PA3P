package problema28;

import java.util.ArrayList;

public class Problema28 {

    public static void main(String[] args) {
        Expendedor e = new Expendedor(5);
        Moneda m = null;
        Bebida b = null;
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
        m = new Moneda();
        b = e.comprarBebida(m);
        if (b != null) {
            System.out.println(b.beber() + ", " + b.getSerie());
        }
    }

}

class Moneda {

    public Moneda() {

    }
}

class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {
        return "gluglu";
    }

}

class Deposito {

    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList();
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

class Expendedor {

    private Deposito dep;

    public Expendedor(int cant) {
        dep = new Deposito();
        for (int i = 0; i < cant; i++) {
            dep.addBebida(new Bebida(i));
        }
    }

    public Bebida comprarBebida(Moneda mon) {
        if (mon == null) {
            return null;
        } else {
            return dep.getBebida();
        }
    }
}
