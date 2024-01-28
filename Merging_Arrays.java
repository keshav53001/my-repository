public class DSA {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(50);
        list1.add(80);
        System.out.println("list1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(60);
        list2.add(90);
        list2.add(40);
        list2.add(10);
        list2.add(70);
        System.out.println("list2: " + list2);

        ArrayList<Integer> merged_list = new ArrayList<>();
        merged_list.addAll(list1);
        merged_list.addAll(list2);

        System.out.println("Merged List: " + merged_list);
}}