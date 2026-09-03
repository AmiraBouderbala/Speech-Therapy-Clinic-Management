public abstract class QuestionAnamnese {
    protected String enonce ;


    public boolean equals(Object obj){
        return ((QuestionAnamnese)obj).getEnonce().equals(this.enonce);
    }
    public String getEnonce(){
        return this.enonce ;
    }
    public int hashCode(){return this.enonce.hashCode();}
}
