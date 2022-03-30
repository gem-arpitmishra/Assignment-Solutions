import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;


public class charCount_in_a_string {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        s = s.replace(" ","");
        s= s.toUpperCase();
        char[] ch = s.toCharArray();
        for(char ch1: ch )
             System.out.println(ch1);

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i =0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }
            else{
                map.put(ch[i],map.get(ch[i])+1);
            }
        }
        System.out.println(map);

    }
}
