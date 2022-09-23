package problema41;

import java.util.ArrayList;

public class Problema41 {

    public static void main(String[] args) {
        Deposito d1 = new Deposito();
        Deposito d2 = new Deposito();
        Deposito d3 = new Deposito();
        Deposito d4 = new Deposito();
        d1.addBebida(new CocaCola(10));
        d1.addBebida(new CocaCola(11));
        d2.addBebida(new Kem(20));
        d2.addBebida(new Kem(21));
        d2.addBebida(new Kem(22));
        d3.addBebida(new Fanta(30));
        d3.addBebida(new Fanta(31));
        d3.addBebida(new Fanta(32));
        d3.addBebida(new Fanta(33));
        d4.addBebida(new Sprite(40));
        d4.addBebida(new Sprite(41));
    }

}

class Deposito {

    private ArrayList<Bebida> deposito;

    public Deposito() {
        deposito = new ArrayList();
    }

    public void addBebida(Bebida bebida) {
        deposito.add(bebida);
    }

    public Bebida getBebida() {
        if (deposito.size() == 0) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
}

abstract class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return "fanta";
    }
}

class Kem extends Bebida {

    public Kem(int serie) {
        super(serie);
    }

    public String beber() {
        return "kem";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return "cocacola";
    }
}
