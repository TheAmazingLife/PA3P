package problema39;
public class Problema39 {
    public static void main(String[] args) {
        CuatroOperaciones res = new CuatroOperaciones(2, 4);
        float n;
        n = res.suma();
        System.out.println(n);
        n = res.resta();
        System.out.println(n);
        n = res.divide();
        System.out.println(n);
        n = res.multiplica();
        System.out.println(n);
    }
}

class SumaResta {

    private float uno;
    private float dos;

    public SumaResta(float a, float b) {
        uno = a;
        dos = b;
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

class CuatroOperaciones extends SumaResta {

    public CuatroOperaciones(float a, float b) {
        super(a,b);
    }

    public float multiplica() {
        float uno = getUno();
        float dos = getDos();
        return uno * dos;
    }

    public float divide() {
        float uno = getUno();
        float dos = getDos();
        return uno / dos;
    }
}
