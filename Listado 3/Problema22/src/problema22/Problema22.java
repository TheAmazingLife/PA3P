package problema22;

public class Problema22 {

    public static void main(String[] args) {
        Tubo t = new Tubo();
        Pelota sale;
        Pelota nueva;
        t.verTubo();
        nueva = new Pelota(1003);
        sale = t.meteB(nueva);
        if (sale != null) {
            System.out.print(sale.dameTuSerie() + "<-");
        } else {
            System.out.print(sale + "<-");
        }
        System.out.println("[       ]<-"+1003);
        t.verTubo();
        nueva = new Pelota(5002);
        sale = t.meteA(nueva);
        System.out.print(5002 + "->[       ]");
        if (sale != null) {
            System.out.println("->" + sale.dameTuSerie());
        } else {
            System.out.println("->" + sale);
        }
        t.verTubo();
        for (int i = 0; i < 5; i++) {
            int s = 13 + i;
            nueva = new Pelota(s);
            sale = t.meteB(nueva);
            if (sale != null) {
                System.out.print(sale.dameTuSerie() + "<-");
            } else {
                System.out.print(sale + "<-");
            }
            System.out.println("[       ]<-" + s);
            t.verTubo();
        }
        for (int i = 0; i < 5; i++) {
            int s = 52 + i;
            nueva = new Pelota(s);
            sale = t.meteA(nueva);
            System.out.print(s + "->[       ]");
            if (sale != null) {
                System.out.println("->" + sale.dameTuSerie());
            } else {
                System.out.println("->" + sale);
            }
            t.verTubo();
        }
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

class Tubo {

    private Pelota p[];

    public Tubo() {
        p = new Pelota[2];
        p[0] = null;
        p[1] = null;
    }

    public Pelota meteA(Pelota pel) {
        Pelota aux;
        if (p[1] != null && null != p[0]) {
            aux = p[1];
            p[1] = p[0];
            p[0] = pel;
            return aux;
        } else {
            if (p[0] == null) {
                p[0] = pel;
                return null;
            } else {
                p[1] = p[0];
                p[0] = pel;
                return null;
            }
        }
    }

    public Pelota meteB(Pelota pel) {
        Pelota aux;
        if (p[1] != null && null != p[0]) {
            aux = p[0];
            p[0] = p[1];
            p[1] = pel;
            return aux;
        } else {
            if (p[1] == null) {
                p[1] = pel;
                return null;
            } else {
                p[0] = p[1];
                p[1] = pel;
                return null;
            }
        }
    }

    public void verTubo() {
        String aux[] = new String[2];
        for (int i = 0; i < 2; i++) {
            if (p[i] == null) {
                aux[i] = "null";
            } else {
                aux[i] = "" + p[i].dameTuSerie();
            }
        }
        System.out.println("A:[" + aux[0] + "," + aux[1] + "]:B");
    }

}
