package problema27;

public class Problema27 {

    public static void main(String[] args) {
        Expendedor exp = new Expendedor();
        Moneda m1 = new Moneda();
        Moneda m2 = null;
        Bebida b1 = exp.comprarBebida(m1);
        Bebida b2 = exp.comprarBebida(m2);
        System.out.println(b1);
        System.out.println(b1.beber());
        System.out.println(b2);
    }
}

class Moneda {

    public Moneda() {

    }
}

class Bebida {

    public Bebida() {

    }

    public String beber() {
        return "gluglu";
    }
}

class Expendedor {
    
    public Expendedor() {
        
    }
    
    public Bebida comprarBebida(Moneda mon) {
        if (mon == null) {
            return null;
        } else {
            return new Bebida();
        }
    }
}