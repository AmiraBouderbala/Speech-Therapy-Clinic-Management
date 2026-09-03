public class QuestionEnfant extends QuestionAnamnese{
    private CatQuestionEnfant typecat ;
    public QuestionEnfant(String enonce, CatQuestionEnfant typeCat){
        this.enonce = enonce ;
        this.typecat = typeCat ;
    }
    public CatQuestionEnfant getTypecat(){
        return this.typecat ;
    }
}
