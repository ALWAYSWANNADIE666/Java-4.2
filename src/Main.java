public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(72.2, 1.80);
        System.out.println("Индекс массы тела: " + bmi);
    }
}