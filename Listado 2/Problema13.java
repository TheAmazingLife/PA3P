class Problema13  {
    public static void main(String[] args) {
        Bebida vaso = new Bebida(true);
        String s = vaso.beber();
        System.out.println(s);
        vaso = new Bebida(false);
        s = vaso.beber();
        System.out.println(s);
    }
}

class Bebida {
    private boolean llena;

    public Bebida(boolean aux) {
        llena = aux;
    }

    public String beber() {
        String s;
        if (llena) {
            s = new String("gluglu");
            llena = false;
        } else {
            s = null;
        }
        return s;
    }
}