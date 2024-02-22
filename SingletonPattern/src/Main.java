import com.es2.singleton.Registry;

public class Main {
    public static void main(String[] args) {
        Registry r1 = Registry.getInstance();
        Registry r2 = Registry.getInstance();
        r1.x = r1.x + 10;
        //VERIFICAR SE FUNFA
        System.out.println("Value of a.connectionString = " + r1.x);
        System.out.println("Value of b.connectionString = " + r2.x);
    }
}
