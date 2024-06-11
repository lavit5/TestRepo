public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo();
        d.getData();
        String ime = d.getData();
        System.out.println(ime);

        MethodsDemo2 d1 = new MethodsDemo2();
        String ime2 = d1.getUserData();
        System.out.println(ime2);
    }


    public String getData() {
        System.out.println("cao!");
        return "kalu";
    }

}
