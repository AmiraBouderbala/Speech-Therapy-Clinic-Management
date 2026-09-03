import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ListIterator;

public class DossierPatient {
    private int NumDossier ;
    private Patient patient ;
    private Orthophoniste orth ;
    private Set<RendezVous> RDV ;
    private ArrayList<FicheSuivi> FS ;
    private ArrayList<Bilan>  listBilan ;
    // ajouter la liste des billans
    // ajouter une methode statique pour récupérer un objet dossier a partir de son numero dans la classe systeme
    public DossierPatient(Patient patient , int NumDossier , Orthophoniste orth  ){
        this.RDV = new TreeSet<RendezVous>();
        this.FS = new ArrayList<FicheSuivi>() ;
        this.patient = patient ;
        this.NumDossier = NumDossier ;
        this.orth = orth ;
    }
    public int getNumDossier(){
        return this.NumDossier ;
    }
    public boolean ajouterRdv(RendezVous rdv){
        return this.RDV.add(rdv) ;
    }
    public void supprimerRdv(RendezVous rdv){
        this.RDV.remove(rdv) ;
    }

    public void ajouterFS(FicheSuivi fs){
        //System.out.println(fs.canAddFichSuivi());
        if(this.FS.size() > 0) {
            System.out.println("this.FS.size() - 1 = "+(this.FS.size() - 1));
            FicheSuivi ls = this.FS.get(this.FS.size() - 1);
        if(ls.canAddFichSuivi()){
            System.out.println(("ajouter avec succee"));
            this.FS.add(fs);
        }
        }else{
            this.FS.add(fs);
        }
    }
    public void supprimerFS(FicheSuivi fs) {
        this.FS.remove(fs);
    }
    public List<FicheSuivi> getFicheSuivi(){
        return this.FS ;
    }
    public void ajouterListBilan(Bilan bl) {
        this.listBilan.add(bl);
    }
    public void supprimerListBilan(Bilan bl) {
        this.listBilan.remove(bl);
    }
    public List<Bilan> getListBilan(){
        return this.listBilan ;
    }
    public Patient getPatient(){
        return this.patient ;
    }
}
