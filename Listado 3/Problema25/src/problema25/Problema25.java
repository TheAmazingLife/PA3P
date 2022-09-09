package problema25;

public class Problema25 {

    public static void main(String[] args) {
        Bebida b = new Bebida(18);
        b.llenar(1211);
        Bebida bb = new Bebida(19);
        bb.llenar(200);
        Bebida bbb = new Bebida(20);
        bbb.llenar(500);
    }

}

class Bebida {

    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;

    public Bebida(int serie) {
        contenido = 0;
        this.serie = serie;
    }

    public void llenar(int llenado) {
        if (llenado + contenido > Bebida.VOLUMEN) {
            contenido = VOLUMEN;
        } else {
            contenido = llenado + contenido;
        }
    }

    public int beber(int bebido) {
        if (bebido > contenido) {
            int aux;
            aux = contenido;
            contenido = 0;
            return aux;
        } else {
            contenido = contenido - bebido;
            return bebido;
        }
    }

    public int getSerie() {
        return serie;
    }
}
