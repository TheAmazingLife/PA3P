package problema12;

public class Problema12 {

    public static void main(String[] args) {
        Persona persona = new Persona("textoDelString", true);
        boolean estado = persona.esCasado();
        String nombre = persona.elNombre();
    }
}

class Persona {
    private String nombre;
    private boolean estado;

    public Persona (String name, boolean est) {
        nombre = name;
        estado = est;
    }
    public boolean esCasado() {
        return estado;
    }
    public String elNombre() {
        String s = nombre;
        return s;
    }
}
