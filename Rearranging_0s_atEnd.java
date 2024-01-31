 public class DSA {
            public static void main(String[] args) {
                int[] no = {0,0,1,0,0,0,2,5,0,6,4,0,0,0,4,4};
                ArrayList<Integer> arr = new ArrayList<>();
                long count =0;
                for (int j : no){
                    if(j!=0){
                    arr.add(j);
                    }else {
                        count++;
                    }
                }
                for (int i = 0; i < count; i++) {
                    arr.add(0);
                }
                System.out.println(arr);
            }
        }
