Count Unique Words in a string

Code

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i].equals(arr[j])){
                        c++;
                    }
                }
            }
            if(c==0){
                count++;
            }
        }
        System.out.print(count);
	}
}
