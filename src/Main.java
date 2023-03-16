public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double index = service.calculate(50, 167);
        int bmi = (int)index;

        System.out.println("Индекс массы тела" + bmi);
    }
}
