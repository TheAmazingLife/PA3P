package problema43;

import java.util.ArrayList;

public class Problema43 {

    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(30);
        for (int i = 0; i < 30; i++) {
            Moneda moneda = new Moneda();
            Bebida bebida = expendedor.comprarBebida(moneda, 2);
            System.out.println(bebida.getSerie() + " " + bebida.beber());
        }
    }

}

class Expendedor {

    private Deposito coca;
    private Deposito sprite;

    public Expendedor(int cantidad) {
        coca = new Deposito();
        sprite = new Deposito();

        for (int i = 0; i < cantidad; i++) {
            Bebida cocacola = new CocaCola(100 + i);
            coca.addBebida(cocacola);
            Bebida spritee = new Sprite(200 + i);
            this.sprite.addBebida(spritee);
        }
    }

    public Bebida comprarBebida(Moneda moneda, int que) {
        Bebida bebida = null;
        switch (que) {
            case 1:
                bebida = coca.getBebida();
                return bebida;
            case 2:
                bebida = sprite.getBebida();
                return bebida;
        }
        return null;
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

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "cocacola";
    }
}

class Moneda {

}
