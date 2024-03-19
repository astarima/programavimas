public class Main {
    public static void main(String[] args) {

        boolean[] invert = new boolean[] {true, true, false};
        for(boolean e:invert){
            boolean a = invert(e);
            System.out.println(a);
        }
    }

    private static boolean invert(boolean yep) {
        return !yep;
    }
}