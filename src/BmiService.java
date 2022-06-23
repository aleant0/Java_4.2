public class BmiService {
    public double calculate(int mass, double height){
        return mass / Math.pow(height/100,2);
    }
}
