import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Agenda {
    private Set<RendezVous> RDV;

    public Agenda() {
        this.RDV = new TreeSet<RendezVous>();
    }
    public boolean ajouterRdv(RendezVous rdv){
     return RDV.add(rdv) ;
    }
    public void supprimerRdv(RendezVous rdv){
         RDV.remove(rdv) ;
    }
    public void afficherRdvs(){
        System.out.println("here 1") ;
        Iterator<RendezVous> it = RDV.iterator() ;

        while(it.hasNext()){
            RendezVous rdv = it.next() ;
            if (rdv instanceof Consultation) {
                Consultation consultation = (Consultation) rdv;
                System.out.println("that = " + consultation.getNom());
            } else if (rdv instanceof Atelier) {
                Atelier atelier = (Atelier) rdv;
                System.out.println("those = ");
                atelier.afficherlistPatients();
            }
           System.out.println(rdv.date);
            System.out.println(rdv.heureDebut);
            System.out.println(rdv.duree);
        }
    }
   /* public RendezVous rechercherRDV(String
                                        nom){
        Compte c=null;
        Iterator<Compte> it =
                lesComptes.iterator();
        while (it.hasNext()){
            c=it.next();
            if
            (nom.equalsIgnoreCase(c.getNom()))
                return c;
        }
        return null;
    }*/


}
