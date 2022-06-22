public class BmiService {
    public double calculate(int m, double h){
        return m / Math.pow(h/100,2);
    }
}
