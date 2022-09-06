package problema23;

public class Problema23 {

    public static void main(String[] args) {
        float n1 = 2;
        float n2 = 3;
        SumaResta n = new SumaResta(n1, n2);
        float aux;
        aux = n.suma();
        System.out.println(aux);
        aux = n.resta();
        System.out.println(aux);
    }
}
//this.var se refiere a la variable

class SumaResta {

    private float uno;
    private float dos;
    private float total;

    public SumaResta(float n1, float n2) {
        uno = n1;
        dos = n2;
    }

    public float suma() {
        total = uno + dos;
        return total;
    }

    public float resta() {
        total = uno - dos;
        return total;
    }
}
