package Strings;

public class PrefixArray {
    public static void main(String[] args) {
        String str = "banana";
        String[] prefixes = generatePrefixArray(str);
        for(String prefix : prefixes){
            System.out.println(prefix);
        }
    }
    public static String[] generatePrefixArray(String str){
        int n = str.length();
        String[] prefixes = new String[n];
        for(int i=0;i<n;i++){
            prefixes[i] = str.substring(0, i+1);
        }
        java.util.Arrays.sort(prefixes);
        return prefixes;
    }
}
