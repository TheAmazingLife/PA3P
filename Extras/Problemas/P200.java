public class P200 {
    public static void main(String[] args) {
        Uno u = new Uno();
    }
}

class Comun {
    protected Comun otro;
}

class Uno extends Comun {
    public Uno() {
        this.otro = new Dos(this);
    }
}

class Dos extends Comun {
    public Dos(Uno u) {
        this.otro = u;
    }
}