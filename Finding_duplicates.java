 public class DSA {
            public static void main(String[] args) {
                int[] no = {0,1,2,5,1,6,4,0,4,6,6,6};
                Arrays.sort(no);
                for (int i=0;i< no.length-1;i++){
                    if(no[i]==no[i+1]){
                        System.out.println(" Duplicates : "+no[i]);
                    }
                }
            }
        }