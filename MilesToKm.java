public class MilesToKm {
    public static void main(String[] args) throws Exception {
        System.out.println("Miles       Kilometers");
        for (int i = 1; i <= 10; i++){
            double finalKilometer = i * 1.609;
            System.out.println(i +"            " + finalKilometer);
        }

}
}