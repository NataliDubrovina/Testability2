public class BmiService {
    public int index(double weightKg, double heightMetre) {

        double result = (weightKg / (heightMetre * heightMetre));
        return (int) result;


    }
}
