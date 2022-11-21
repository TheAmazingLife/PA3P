public class P201 {
    public static void main(String[] args) {
        Uno u = new Uno();
    }
}

class Comun {
    protected Comun otro;
}

class Uno extends Comun {
    public Uno() {
        this.otro = new Dos();
    }
}

class Dos extends Comun {
    public Dos() {
        this.otro = new Tres(this);
    }
}

class Tres extends Comun{
    public Tres(Dos u) {
        this.otro = u;
    }
}