import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class Suivi extends RendezVous{
    private int NDossier ;
    private String typeSuivi ; // presentielle ou en ligne

    public Suivi(LocalTime heureDebut , LocalDate date , int NDossier , String typeSuivi  ){
        this.heureDebut = heureDebut ;
        this.NDossier = NDossier ;
        this.typeSuivi = ""; // presentielle ou en ligne
        if(typeSuivi.equals("presentielle") || typeSuivi.equals("en ligne")){
            this.typeSuivi = typeSuivi ;
        }

        this.date = date ;
        this.duree = Duration.ofHours(1) ;
    }
}
