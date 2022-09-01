package problema8;

public class Problema8 {

    public static void main(String[] args) {
        Balde b = new Balde();
        int litros = 15;
        b.llenar(litros);
        int contiene;
        contiene = b.verificar( );
        System.out.println(contiene);
    }
}
class Balde {
    private int contenido;
    public Balde(){
        contenido = 0;
    }
    public void llenar(int volumen){
        if (contenido + volumen > 12) {
            contenido = 12;
        } else {
            contenido = contenido + volumen;
        }
    }
    public int verificar(){
        return contenido;
    }
}