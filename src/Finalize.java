
public class Finalize {
    public static void main(String[] args) {

        FDemo ob = new FDemo(0);

        for (int count = 0; count < 500000; count++) {
            ob.generator(count);

        }
    }

}
