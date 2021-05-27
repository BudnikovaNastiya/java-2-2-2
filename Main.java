public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int height  = 175;
        int weight = 62;
        float index = (int) service.calculate(height, weight);
        System.out.println(index);
    }
}
