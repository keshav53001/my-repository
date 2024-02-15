import java.util.HashMap;

public class DSA{
    public static void main(String[] args){
        System.out.println(Number_to_Text(96));
    }
    public static String Number_to_Text(int n){
        String ans= "";
        HashMap<Integer, String>map1=new HashMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        map1.put(5, "five");
        map1.put(6, "six");
        map1.put(7, "seven");
        map1.put(8, "eight");
        map1.put(9, "nine");
        map1.put(10, "ten");
        map1.put(11, "eleven");
        map1.put(12, "twelve");
        map1.put(13, "thirteen");
        map1.put(14, "fourteen");
        map1.put(15, "fifteen");
        map1.put(16, "sixteen");
        map1.put(17, "seventeen");
        map1.put(18, "eighteen");
        map1.put(19, "nineteen");
        map1.put(0, "");
        if (n<1){
            ans="zero";
        }
        if(n<20){
            ans=ans+map1.get(n);
        }
        if(n>=20) {
            String val=String.valueOf(n);
            int first = Character.getNumericValue(val.charAt(0));
            int second = Character.getNumericValue(val.charAt(1));
            HashMap<Integer, String>map=new HashMap<>();
            map.put(2, "twenty");
            map.put(3, "thirty");
            map.put(4, "forty");
            map.put(5, "fifty");
            map.put(6, "sixty");
            map.put(7, "seventy");
            map.put(8, "eighty");
            map.put(9, "ninety");
            ans=ans+map.get(first);
            ans=ans+map1.get(second);

    }
        return ans;
    }
}