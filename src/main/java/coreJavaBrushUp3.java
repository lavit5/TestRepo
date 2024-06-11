public class coreJavaBrushUp3 {

    public static void main(String[] args) {

        String l = "test recenica je ovde!";
        String[] podeljenjarecenica = l.split(" ");
        for (String j : podeljenjarecenica) {
            System.out.println(j);
        }

        for (int i=l.length()-1; i>=0; i--) {
            System.out.println(l.charAt(i));
        }


    }
}
