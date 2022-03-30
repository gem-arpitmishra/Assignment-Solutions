//Assignment 3 for 16/2/2022
// Count the occurrence of each character in a string using collections


import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import java.util.Scanner;


public class characterOccurrenceCount {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>(Collections.nCopies(26,0));
        System.out.println("Enter the string\n");
        String str = scan.nextLine();
        str = str.replace(" ", "");
        str = str.toUpperCase();
        System.out.println(str);
        int count = 0;
        for(int i =0;i<list1.size();i++){
                if(count!=str.length()) {
                    list1.set((int) str.charAt(count) - 65, (int) list1.get(((int) str.charAt(count) - 65)) + 1);
                    count++;
                }
        }


    for(int i =0 ;i< list1.size();i++){
        if((int)list1.get(i)>0)
            System.out.printf(" character %c  has occurred %d times\n",i+65,list1.get(i));
    }}
}
