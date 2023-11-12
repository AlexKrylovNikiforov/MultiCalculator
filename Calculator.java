public class Calculator {
    public static void main(String[] args) {
        Scalar first = new Scalar(2.2);
        Vector second = new Vector("2.2, 1.3, 5.6");
        Scalar third = new Scalar(3.4);
        Vector fourth = new Vector("2.3, 5.4, 1.1, 7.8");
        System.out.println(first.add(second).toString());
        System.out.println(second.add(first).toString());
        System.out.println(first.add(third));
        System.out.println(second.add(fourth).toString());
    }
}
