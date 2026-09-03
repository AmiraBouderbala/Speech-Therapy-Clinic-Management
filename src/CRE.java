import java.util.ArrayList;

public class CRE extends CompteRendu {
    private ArrayList<Integer> tabScore;

    public void setscore(int indice, int score) {
        if ((score <= 10) && (score >= 1)) {
            if (indice >= 0 && indice < tabScore.size()) {
                tabScore.set(indice, score);
            } else {
                System.out.println("Indice invalide");
            }
        }
    }

    public float calculmoyenne(ArrayList<Integer> liste) {
        int som = 0;
        int cpt = 0;
        for (int i = 0; i < tabScore.size(); i++) {
            if (liste.contains(i)) {
                som = som + tabScore.get(i);
                cpt++;
            }
        }
        float moy = som / cpt;
        return moy;
    }

    public float setscoretotal(TestExer test) {
       float som=0;
        for (int i = 0; i < tabScore.size(); i++) {
            ArrayList<Integer> nouvellist=test.sameexo(i);//HOW TO LINK EACH TEST EXO WITH LE COMPTE RENDU ADEQUAT
           som=som+this.calculmoyenne(nouvellist);
        }
        return som;
    }

}