package problema42;

import java.util.ArrayList;

public class Problema42 {

    public static void main(String[] args) {
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

class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {
        return "sabor: ";
    }
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "fanta";
    }
}

class Kem extends Bebida {

    public Kem(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "kem";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "cocacola";
    }
}
