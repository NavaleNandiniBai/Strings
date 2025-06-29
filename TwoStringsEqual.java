import java.util.*;
public class TwoStringsEqual {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.nextLine();
        System.out.println("Enter Second String: ");
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Two Strings are Equal");
        }
        else{
            System.out.println("Two Strings are not Equal");
        }
        
    } 
    
}
