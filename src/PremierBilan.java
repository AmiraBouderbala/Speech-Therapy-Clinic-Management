import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PremierBilan extends Bilan {
    private Anamnese ana ;
    private Map<Integer, String> tabreponceana = new HashMap<>();
    public int findindicetest(String nomt) {
        int Index = -1; // Initialize to -1 (not found)
        for (int i = 0; i < this.tabreponceana.size(); i++) {
            if (this.tabreponceana.get(i).equals(nomt)) {
                Index = i; // Found the test, store its index
                break;
            }
        }
        return Index;
    }

    public void ajouterTest(int i, String res) {
        this.tabreponceana.put(i,res);
    }


    public void supprimerTest(int cle) {
        if (tabreponceana.containsKey(cle)) {
            this.tabreponceana.remove(cle);
        } else {
            System.out.println("Indice invalide : " + cle);
        }
    }

    public void modifierTest(int cle, String modif) {
        if (tabreponceana.containsKey(cle)){
            this.tabreponceana.put(cle, modif);
        }
    }
    public Map<Integer, String> getTabreponceana() {
        return tabreponceana;
    }

    public void setTabreponceana(Map<Integer, String> tabreponceana) {
        this.tabreponceana = tabreponceana;
    }
}
