
public class Finalize {
    public static void main(String[] args) {

        double sum = 500;
        double sum1 = 1500;
        for (int count = 0; count < 24; count++) {
           sum *= 1.1;
            //if (count > 9) {
                sum += (sum1);
            //}
            //else {
            //    sum += sum1;
            //}
            if (count > 24) {
                sum -= 5000;
            }

           //sum1 += 50;
        }

        System.out.println(sum);
    }

}
