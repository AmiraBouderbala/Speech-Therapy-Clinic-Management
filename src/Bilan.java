import java.util.ArrayList;

public class Bilan {
    private ArrayList<Test> tabTest;
    private ArrayList<CompteRendu> tabCompteRendu;
   private String observation;
   private String Projettherapeutique;
   private Diagnostic diagnostic;

    public int findindicetest(String nomt) {
        int Index = -1; // Initialize to -1 (not found)
        for (int i = 0; i < this.tabTest.size(); i++) {
            if (this.tabTest.get(i).Getnomtest().equals(nomt)) {
                Index = i; // Found the test, store its index
                break;
            }
        }
        return Index;
    }

    public void ajouterTest(Test test) {
        this.tabTest.add(test);

    }

    public void supprimerTest(int indice) {
        if ((indice >= 0) && (indice < this.tabTest.size())) {
            this.tabTest.remove(indice);

        } else {
            System.out.println("Indice invalide : " + indice);
        }
    }

    public void modifierTest(int i, Test modif) {
        if (i != -1) {
            tabTest.set(i, modif);
        }
    }
    public void ajoutercr(CompteRendu cr) {
        this.tabCompteRendu.add(cr);

    }

    public void supprimercr(int indice) {
        if ((indice >= 0) && (indice < this.tabCompteRendu.size())) {
            this.tabCompteRendu.remove(indice);

        } else {
            System.out.println("Indice invalide : " + indice);
        }
    }

    public void modifiercr(int i, CompteRendu modif) {
        if (i != -1) {
            tabCompteRendu.set(i, modif);
        }
    }

    public ArrayList<Test> getTabTest() {
        return tabTest;
    }

    public void setTabTest(ArrayList<Test> tabTest) {
        this.tabTest = tabTest;
    }

    public ArrayList<CompteRendu> getTabCompteRendu() {
        return tabCompteRendu;
    }

    public void setTabCompteRendu(ArrayList<CompteRendu> tabCompteRendu) {
        this.tabCompteRendu = tabCompteRendu;
    }
}
