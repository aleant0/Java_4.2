public class Main {
    public static void main(String[] args) {
        double height = 163;   //Введите ваш рост в сантиметрах
        int mass = 48;        //Введите ваш вес в килограммах

        BmiService service = new BmiService();
        double bmi = service.calculate(mass, height);

        System.out.println();
        System.out.printf("Ваш индекс массы тела: " + "%.2f", bmi);

    }
}
