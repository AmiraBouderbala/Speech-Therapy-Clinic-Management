
import java.util.ArrayList;

public class TestQuest extends Test {
    private ArrayList<Question> tabQuestSimpl;
    private int nbquest;

    public TestQuest(String nom, int capacite) {
        this.capacite = capacite;
        this.nom = nom;
        tabQuestSimpl = new ArrayList<>();
    }

    public void SetTabQues(ArrayList<Question> tabQuestSimpl) {
        this.tabQuestSimpl = tabQuestSimpl;
    }

    public ArrayList<Question> GetTabQues() {
        return this.tabQuestSimpl;
    }

    public boolean Peutajouter(String Equestion){
        boolean questionExists = false;
        if (this.nbquest < this.capacite) {
            for (Question quest : this.tabQuestSimpl) {
                if (quest.getQuest().equals(Equestion)) {
                    questionExists = true;
                    break;
                }
            }
    }
        return questionExists;
    }
        public int trouverenonce(String Equestion){
            int questionIndex = -1; // Initialize to -1 (not found)
            for (int i = 0; i < this.tabQuestSimpl.size(); i++) {
                if (this.tabQuestSimpl.get(i).getQuest().equals(Equestion)) {
                    questionIndex = i; // Found the question, store its index
                    break;
                }
            }
            return questionIndex;
        }


            public void ajouterquest(Question question) {
             this.tabQuestSimpl.add(question);
             this.nbquest++;}

    public void supprimerQuestion(int indice) {
        if ((indice >= 0) && (indice < this.tabQuestSimpl.size())) {
            this.tabQuestSimpl.remove(indice);
            this.nbquest--; // Décrémenter le nombre de questions
        } else {
            System.out.println("Indice invalide : " + indice);
        }
    }


    public void modifierquest(int i, Question modif) {
        if (i != -1) {
            tabQuestSimpl.set(i,modif);
        }
    }

    public int getNbquest() {
        return nbquest;
    }

    public void setNbquest(int nbquest) {
        this.nbquest = nbquest;
    }
}
