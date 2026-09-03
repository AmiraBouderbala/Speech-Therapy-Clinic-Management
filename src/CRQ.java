import java.util.ArrayList;

public class CRQ extends CompteRendu{
    private ArrayList<RepScore> tabScore;
    public void remplirscore(int indice,int score){
        if((score<=10)&&(score>=1)){
            if (indice >= 0 && indice < tabScore.size()) {
                RepScore element = tabScore.get(indice);
                element.setScore(score);
            } else {
                System.out.println("Indice invalide");
            }
        }}
    public void remplirreponce(int indice,String rep){

            if (indice >= 0 && indice < tabScore.size()) {
                RepScore element = tabScore.get(indice);
                element.setReponse(rep);
            } else {
                System.out.println("Indice invalide");
            }
       }
       public int setscoretotal(){
        int som=0;
           for (int i = 0; i < tabScore.size(); i++) {
           RepScore element = tabScore.get(i);
           som=som+element.getScore();
       }
           return som;
    }

}
