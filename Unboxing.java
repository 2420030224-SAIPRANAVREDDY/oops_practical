public class Unboxing {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue(); // explicitly
        int j = a; // unboxing

        System.out.println(a + " " + i + " " + j);
    }
}

