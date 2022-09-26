import ru.mirea.kvbo1.krekova.Dog;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Dog A = new Dog("Sharik", 5);
        System.out.println(A);
        System.out.println("Human Age: " + A.humanAge());
    }
}