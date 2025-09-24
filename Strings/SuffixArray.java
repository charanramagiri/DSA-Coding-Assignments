package Strings;

public class SuffixArray {
    public static void main(String[] args) {
        String str = "banana";
        String[] suffixes = generateSuffixArray(str);
        for(String suffix : suffixes){
            System.out.println(suffix);
        }
    }
    private static String[] generateSuffixArray(String str){
        int n = str.length();
        String[] suffixes = new String[n];
        for(int i=0;i<n;i++){
            suffixes[i] = str.substring(i);
        }
        java.util.Arrays.sort(suffixes);
        return suffixes;
    }
}
