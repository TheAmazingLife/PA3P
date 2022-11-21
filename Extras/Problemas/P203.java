
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

    public String yama() {
        Dos aux = (Dos) otro;
        String string = aux.yama();
        return string;
    }

    public String vuelta() {
        String string = new String("logrado");
        return string;
    }
}

class Dos extends Comun {

    public Dos(Uno u) {
        this.otro = u;
    }

    public String yama() {
        Uno aux = (Uno) otro;
        String string = aux.vuelta();
        return string;
    }
}
