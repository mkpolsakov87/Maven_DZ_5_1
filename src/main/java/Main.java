public class Main {

    public static void main(String[] args) {
        RestService service = new RestService();

        int rest = service.calculate(100000, 60000, 150000);
        System.out.println(rest);
    }
}
