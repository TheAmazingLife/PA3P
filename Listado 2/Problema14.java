class Problema14{
    public static void main(String[] args) {
        Promediador p = new Promediador();
        p.agregaNumero(10);
        int num = p.numero();
        System.out.println(num);
        float promedio = p.promedio();
        System.out.println(promedio);
    }
}

class Promediador {
    private int s;
    private int n;

    public Promediador() {
        s = 0;
        n = 0;
    }

    public void agregaNumero(int num) {
        n = n + 1;
        s = s + num;
    }

    public float promedio() {
        float promedio = (float) s / (float) n;
        return promedio;
    }

    public int numero() {
        int aux = n;
        return aux;
    }
}