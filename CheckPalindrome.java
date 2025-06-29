import java.util.*;
public class CheckPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println("Reversed String: "+s1);
        if(s.equals(s1)){
            System.out.println("Given String is a Palindrome");
        }
        else{
            System.out.println("Given String is not pallindrome");
        }
    }

    
}
