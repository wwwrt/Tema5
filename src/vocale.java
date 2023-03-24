public class vocale {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "Hello, World!";
        System.out.println(contineToateVocalele(str1)); 
        System.out.println(contineToateVocalele(str2)); 
    }
    
    public static boolean contineToateVocalele(String str) {
        String vocale = "aeiou";
        for (char vocala : vocale.toCharArray()) {
            if (str.indexOf(vocala) == -1) {
                return false;
            }
        }
        return true;
    }
}
