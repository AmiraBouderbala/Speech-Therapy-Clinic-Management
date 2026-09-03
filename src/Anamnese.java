import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Anamnese {
    private  Set<QuestionAnamnese> question ;
    public Anamnese(){
        this.question = new HashSet<QuestionAnamnese>();
    }
    public void AjouterQuestion(String enonce , CatQuestionAdulte typeCat ){
        question.add( new QuestionAdulte (enonce,typeCat) );

    }
    public void AjouterQuestion(String enonce , CatQuestionEnfant typeCat ){
        question.add( new QuestionEnfant (enonce,typeCat) );

    }
    public void ModifierQuestion(String oldQuestion , String newQuestion){
        QuestionAnamnese questomodify = null ;
        for(QuestionAnamnese ques : question ){// parcourir pour chercher l'objet qui a cette valeur de enonce et puis utiliser remove pour le supprimer
            if( ques.getEnonce().equals(oldQuestion)){
                questomodify  = ques ;
                if(ques instanceof  QuestionEnfant){
                    QuestionEnfant  tired = (QuestionEnfant) ques;
                    CatQuestionEnfant  category = tired.getTypecat();
                    this.AjouterQuestion(newQuestion,category);
                }else if (ques instanceof  QuestionAdulte ){
                    QuestionAdulte tired = (QuestionAdulte) ques;
                    CatQuestionAdulte  category = tired.getTypecat();
                    this.AjouterQuestion(newQuestion,category);
                }
                break ;
            }
        }
        question.remove(questomodify);

    }
    public void supprimerQuestion(String enonce  ){
        QuestionAnamnese questodelete = null ;
        for(QuestionAnamnese ques : question ){// parcourir pour chercher l'objet qui a cette valeur de enonce et puis utiliser remove pour le supprimer
         if( ques.getEnonce().equals(enonce)){
             questodelete = ques ;
             break ;
         }
        }
        question.remove(questodelete);
    }
    public void afficherQuestionsAnamnese(){
        System.out.println("here 1") ;
        Iterator<QuestionAnamnese> it = question.iterator() ;

        while(it.hasNext()){
            QuestionAnamnese rdv = it.next() ;
            System.out.println(rdv.getEnonce());
            if (rdv instanceof QuestionEnfant) {
                QuestionEnfant consultation = (QuestionEnfant) rdv;
                System.out.println("that = " + consultation.getTypecat());
            } else if (rdv instanceof QuestionAdulte) {
                QuestionAdulte atelier = (QuestionAdulte) rdv;
                System.out.println("those = "+atelier.getTypecat());

            }
            //System.out.println(rdv.get());
        }
    }
}
