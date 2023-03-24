import java.util.TreeMap;

public class cuvinte {
    public static void main(String[] args) {
        String[] cuvinte = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        TreeMap<String, Integer> frecventaCuvinte = countWords(cuvinte);
        System.out.println(frecventaCuvinte);
    }
    
    public static TreeMap<String, Integer> countWords(String[] cuvinte) {
        TreeMap<String, Integer> frecventaCuvinte = new TreeMap<String, Integer>();
        for (String cuvant : cuvinte) {
            if (frecventaCuvinte.containsKey(cuvant)) {
                frecventaCuvinte.put(cuvant, frecventaCuvinte.get(cuvant) + 1);
            } else {
                frecventaCuvinte.put(cuvant, 1);
            }
        }
        return frecventaCuvinte;
    }
}
