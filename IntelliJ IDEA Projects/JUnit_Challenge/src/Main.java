public class Main {

    public static void main(String[] args) {
        System.out.println("App running.");
        Utilities util = new Utilities();
        String test = "AABCDDEFF";
        System.out.println(util.removePairs(test));
    }
}
