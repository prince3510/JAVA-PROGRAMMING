import java.util.*;


public class prac9 {

    static String double_char(String s){
        int a=s.length();
        String str3="";
    
        for(int i=0;i<a;i++){
            char result = s.charAt(i);
            str3= str3+result+result;
        }
        return str3;

    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s;
        System.out.print("Enter a String : ");
        s=ip.next();
       
        System.out.println(double_char(s));
        System.out.print("\nName : PRINCE MALAVIYA_23DCS057 ");

        ip.close();
    }
}