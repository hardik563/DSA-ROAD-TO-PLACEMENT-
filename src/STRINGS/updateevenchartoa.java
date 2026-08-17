package STRINGS;

public class updateevenchartoa {
    public static void main(String[] args) {
        String s="Hardik is a good boy";
        String str=" ";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                str=str+'a';
            }
            else{
                str +=s.charAt(i);
            }
        }
        System.out.println(str);


    }
}
