import java.util.ArrayList;
public class TestExer extends Test {
    private ArrayList<Exercice> tabQuestExercice;
    private int nbexer;

    public TestExer(String nom, int capacite) {
        this.capacite = capacite;
        this.nom = nom;
        tabQuestExercice = new ArrayList<>();
    }

    public void setTabQuestExercice(ArrayList<Exercice> tabQuestExercice) {
        this.tabQuestExercice = tabQuestExercice;
    }

    public ArrayList<Exercice> getTabQuestExercice() {
        return this.tabQuestExercice;
    }

    public boolean peutAjouter(String Equestion) {
        boolean possible = false;
        if (this.nbexer < this.capacite) {
           possible=true;
        }
        return possible;
    }

    public int trouverEnonce(String Equestion) {
        int questionIndex = -1; // Initialize to -1 (not found)
        for (int i = 0; i < this.tabQuestExercice.size(); i++) {
            if (this.tabQuestExercice.get(i).GetExercice().equals(Equestion)) {
                questionIndex = i; // Found the question, store its index
                break;
            }
        }
        return questionIndex;
    }

    public void ajouterExercice(Exercice ex) {
        this.tabQuestExercice.add(ex);
        this.nbexer++;
    }

    public void supprimerExercice(int indice) {
        if ((indice >= 0) && (indice < this.tabQuestExercice.size())) {
            this.tabQuestExercice.remove(indice);
            this.nbexer--; // Décrémenter le nombre d'exercices
        } else {
            System.out.println("Indice invalide : " + indice);
        }
    }

    public void modifierExercice(int i, Exercice modif) {
        if (i != -1) {
            tabQuestExercice.set(i, modif);
        }
    }
    public ArrayList<Integer> sameexo(int indice){
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        Exercice element=this.tabQuestExercice.get(indice);
        String enonce=element.GetExercice();
        for (int i = 0; i < this.tabQuestExercice.size(); i++) {
            if (this.tabQuestExercice.get(i).GetExercice().equals(enonce)) {
               listeEntiers.add(i);
            }
        }
return listeEntiers;
    }

    public int getNbexer() {
        return nbexer;
    }

    public void setNbexer(int nbexer) {
        this.nbexer = nbexer;
    }
}



