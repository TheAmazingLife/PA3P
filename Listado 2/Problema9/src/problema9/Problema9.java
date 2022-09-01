package problema9;

public class Problema9 {

    public static void main(String[] args) {
        PrimeraClase p = new PrimeraClase("blabla");
        String s = p.getString();
        System.out.println(s);
    }
}
class PrimeraClase {
    private String palabra;
    public PrimeraClase(String p){
        palabra = p;
    }
    public String getString(){
        return palabra;
    }
}