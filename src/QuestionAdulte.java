public class QuestionAdulte extends QuestionAnamnese{
    private CatQuestionAdulte typecat ;
    public QuestionAdulte (String enonce , CatQuestionAdulte typeCat){
        this.enonce = enonce ;
        this.typecat = typeCat ;
    }
    public CatQuestionAdulte getTypecat(){
        return this.typecat ;
    }
}
