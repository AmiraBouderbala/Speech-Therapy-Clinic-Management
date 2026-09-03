public class Question {
    protected String enonce ;
    public Question(String quest){
        this.enonce=quest;
    }
    public String getQuest(){
        return this.enonce;
    }
    public void setQuest(String ques){
        this.enonce=ques;
    }
}
