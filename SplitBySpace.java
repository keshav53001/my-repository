public class DSA {
    public static void main(String[] args) {
        String a = "keshav love coding. he will became a java developer";
        String[] b = a.split(" ");
        int size=b.length-1;
        String result = "";
        for (int i = size; i >= 0; i--) {
            if (i == 0) {
                result = result + b[i];
            } else {
                result = result + b[i] + " ";
            }
        }
        System.out.println(result);


    }}