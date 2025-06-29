import java.util.*;
public class NoOfVowelsInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        int vowelCount=0;
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
    
}
