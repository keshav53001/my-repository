public class DSA {
    public static void main(String[] args) {
        int[]no={0,0,1,2,5,6,5,4,0,5,6,6,5,0,44,4,44,4,4,4};
        ArrayList<Integer> arr=new ArrayList<>();
       for (int j:no){
           arr.add(j);
       }
            for (int i=0;i<no.length-1;i++){
                if(arr.get(i) ==0){
                    int temp=arr.remove(i);
                    arr.add(temp);
            }}
        System.out.println(arr);
}}