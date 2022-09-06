package problema24;

public class Problema24 {

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

class CuatroOperaciones {

    private SumaResta sr;

    public CuatroOperaciones(float a, float b) {
        sr = new SumaResta(a, b);
    }

    public float multiplica() {
        return sr.getUno() * sr.getDos();
    }

    public float divide() {
        return sr.getUno() / sr.getDos();
    }

    public float suma() {
        return sr.suma();
    }

    public float resta() {
        return sr.resta();
    }
}

class SumaResta {

    private float uno;
    private float dos;

    public SumaResta(float n1, float n2) {
        uno = n1;
        dos = n2;
    }

    public float suma() {
        return uno + dos;
    }

    public float resta() {
        return uno - dos;
    }

    public float getUno() {
        return uno;
    }

    public float getDos() {
        return dos;
    }
}
