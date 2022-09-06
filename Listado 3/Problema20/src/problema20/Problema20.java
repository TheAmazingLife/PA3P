package problema20;

public class Problema20 {

    public static void main(String[] args) {
        Pelota p = new Pelota(5);
        int s = p.dameTuSerie();
        System.out.println(s);
    }
}

class Pelota {

    private int serie;

    public Pelota(int nro) {
        serie = nro;
    }

    public int dameTuSerie() {
        return serie;
    }
}
