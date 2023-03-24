import java.util.LinkedList;

public class produse {
    private static class Produs {

        private double pret;
        
        public Produs(String nume, double pret) {

            this.pret = pret;
        }
        
        public double getPret() {
            return pret;
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Produs> produse = new LinkedList<>();
        produse.add(new Produs("Lapte", 3.5));
        produse.add(new Produs("Paine", 2.0));
        produse.add(new Produs("Mere", 1.5));
        
        double total = 0;
        for (Produs produs : produse) {
            total += produs.getPret();
        }
        
        System.out.println("Total: " + total);
    }
}
