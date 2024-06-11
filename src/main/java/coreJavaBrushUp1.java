public class coreJavaBrushUp1 {

    public static void main(String[] args) {

        int broj = 5;
        String test = "testinjo";
        char slovo = 'L';
        float decimala = 5.55F;
        boolean prekidac = true;

        System.out.println(prekidac);



        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1[2]);

        for(int i = 0; i<arr1.length ; i++ ) {
            System.out.println(arr1[i]);
        }

        String[] ime = {"Lav", "Luka", "Jovana"};
        for(int i = 0; i<ime.length; i++) {
            System.out.println(ime[i]);
        }

        for(String l : ime){
            System.out.println(l);
        }



    }

}
