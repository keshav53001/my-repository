  public class DSA {
            public static void main(String[] args) {
                int[] no = {0,1,2,5,1,6,4,0,4,6,6};
                int j=0;
                    for (int i=0;i< no.length;i++){
                        if(no[i]!=0) {
                            int temp=no[j];
                            no[j]=no[i];
                            no[i]=temp;
                            j++;
                        }

                }

                System.out.println(Arrays.toString(no));
            }
        }