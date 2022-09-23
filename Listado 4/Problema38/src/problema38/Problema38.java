package problema38;

public class Problema38 {

    public static void main(String[] args) {
        float n1 = 2;
        float n2 = 4;
        float aux;
        CuatroOperaciones n = new CuatroOperaciones(n1, n2);
        aux = n.multiplica();
        System.out.println(aux);
        aux = n.divide();
        System.out.println(aux);
        aux = n.suma();
        System.out.println(aux);
        aux = n.resta();
        System.out.println(aux);
    }

}

class SumaResta {

    protected float uno;
    protected float dos;

    public SumaResta() {
    }

    public float suma() {
        return uno + dos;
    }

    public float resta() {
        return uno - dos;
    }
}

class CuatroOperaciones extends SumaResta {

    public CuatroOperaciones(float a, float b) {
        uno = a;
        dos = b;
    }

    public float multiplica() {
        return uno * dos;
    }

    public float divide() {
        return uno / dos;
    }
}
