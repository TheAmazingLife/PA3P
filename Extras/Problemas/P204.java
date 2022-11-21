public class P204 {

    public static void main(String[] args) {
        Uno uno = new Uno();
        uno.yama();
    }
}

class Uno {
    private Dos aux;

    public Uno() {
        aux = new Dos(this);
    }

    public void yama() {
        aux.yama();
    }

    public void objetivo() {
        System.out.println("objetivo");
    }
}

class Dos {

    private Tres aux;

    public Dos(Uno u) {
        aux = new Tres(u);
    }

    public void yama() {
        aux.yama();
    }
}

class Tres {
    private Uno aux;

    public Tres(Uno u) {
        aux = u;
    }

    public void yama() {
        aux.objetivo();
    }
}
