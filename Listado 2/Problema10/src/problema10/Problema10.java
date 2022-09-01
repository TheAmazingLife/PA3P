package problema10;

public class Problema10 {

    public static void main(String[] args) {
        Bebida b = new Bebida();
        String tomar = b.beber();
        System.out.println(tomar);
    }
}
class Bebida{
    public Bebida(){
    }
    public String beber(){
        String tomar = new String("gluglu");
        return tomar;
    }
}