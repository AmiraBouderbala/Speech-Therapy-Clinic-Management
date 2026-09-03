public class ExerciceM extends Exercice {
    private String materiel;
    public ExerciceM(String materiel,String consigne){
        super(consigne);
        this.materiel=materiel;
    }
    public void SetExerciceM(String consigne){
        this.materiel=materiel;
    }
    public String GetExerciceM(){
        return this.materiel;
    }
}
