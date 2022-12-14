public class Main {

    public static void main(String[] args) {
        MyArrayList<String> str = new MyArrayList<String>();
        str.add("dfgg");
        str.add("dfgg");
        str.add("dfgg");
        str.add("dfgg");


        str.remove(3);
        str.remove(0);
        System.out.println(str.size());
    }

}