public class Orthophoniste {
    private int idO   ;
    private String nom ;
    private String prenom ;
    private String adresse ;
    private String adresseEmail ;
    private String numeroTele   ;
    private String motPasse   ;
    private static int sommeOrtho = 0  ;
    private Agenda agenda ;
    private Anamnese anamnese ;
    // tableau des test + reponce anamnese et compte rendue dans billan
    public Orthophoniste (String nom ,String prenom,String adresse,String adresseEmail,String numeroTele,String motPasse) {
        this.nom = nom ;
        this.idO =  sommeOrtho ;
        this.prenom = prenom ;
        this.adresse = adresse ;
        this.adresseEmail = adresseEmail ;
        this.numeroTele = numeroTele ;
        this.motPasse = motPasse ;
        sommeOrtho  ++  ;
        this.agenda = new Agenda() ;
        this.anamnese = new Anamnese() ;
    }

    public Agenda getAgenda(){
        return this.agenda ;
    }
    public Anamnese getAnamnese(){
        return this.anamnese ;
    }
    public String getNom(){
        return this.nom ;
    }
}
