import java.util.ArrayList;

public class coreJavaBrushUp2 {

    public static void main(String[] args) {

        int[] arr2 = {1,2,4,5,6,7,8,9,122};

        for(int i=0; i< arr2.length; i++) {
            if (arr2[i] % 2 == 1) {
                System.out.println(arr2[i]);

            }
            else {
                System.out.println("tst");
            }
        }

        ArrayList<String> l = new ArrayList<String>();
        l.add("lav");
        l.add("luka");
        l.add("jovana");

        System.out.println(l.get(1));

        for(String j : l) {
            System.out.println(j);
        }
        for(int i = 0; i<l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println("#################");

        System.out.println(l.contains("jovana"));

    }
}
