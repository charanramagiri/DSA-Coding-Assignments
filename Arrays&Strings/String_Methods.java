public class String_Methods {
    public static void main(String[] args) {
        String str = "#12 I Am%%23 A Java{&9} Developer#123";
        char[] ch=str.toCharArray();
        int sum=0;
        for(char c:ch){
            if(Character.isDigit(c)){
                //sum+=c-'0';
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
