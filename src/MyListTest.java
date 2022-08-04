public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInterger = new MyList<Integer>();
        ListInterger.add(1);
        ListInterger.add(2);
        ListInterger.add(3);
        ListInterger.add(4);
//        ListInterger.Add(6);
        System.out.println("elements3 :" + ListInterger.get(3));
        System.out.println("elements1 :" + ListInterger.get(1));
        System.out.println("elements2 :" + ListInterger.get(2));
//        ListInterger.get(6);
//        System.out.println("elements6 :" + ListInterger.get(6));
//        ListInterger.get(-1);
//        System.out.println("elements-1 :" + ListInterger.get(-1));



    }
}
