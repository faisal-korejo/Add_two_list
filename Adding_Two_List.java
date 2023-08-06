import java.util.LinkedList;

public class Adding_Two_List {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        LinkedList<Integer> result = new LinkedList<>();
        for (int i : list1) {
            result.add(i);
        }
        for (int i : list2) {
            result.add(i);
        }

        System.out.println(result);
    }
}
