package problema19;

public class Problema19 {

    public static void main(String[] args) {
        Balde b = new Balde(5);
        b.llenar(12);
        int s = b.verificar();
        System.out.println(s);
    }
}

class Balde {
    private int capacidad;
    private int contenido;

    public Balde(int cont) {
        capacidad = cont;
        contenido = 0;
    }

    public void llenar(int volumen) {
        if (volumen >= 0) {
            if (contenido + volumen > capacidad) {
                contenido = capacidad;
            } else {
                contenido = contenido + volumen;
            }
        }
    }

    public int verificar() {
        return contenido;
    }

    public int vaciar(int litros) {
        if (litros >= 0) {
            if (contenido - litros >= 0) {
                contenido = contenido - litros;
                return contenido;
            } else {
                contenido = 0;
                return contenido;
            }
        } else {
            return 0;
        }
    }
}