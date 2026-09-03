public class Objectifs {
    //private int idobj ;
    private String enonceObj ;
    private TypeObjectifs typeobj ;
    private int note ;
    public Objectifs(String enonceObj  ,TypeObjectifs typeobj){
        this.enonceObj = enonceObj ;
        this.typeobj = typeobj ;
        this.note = 0 ;

    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if(note <= 5 && note >= 0) {
            System.out.println("setting note");
            this.note = note;
        }
    }
    public String getEnonceObj(){
        return this.enonceObj ;
    }
    public boolean isAtteint(){
        boolean a = false ;
        if( this.note == 5){
            a = true ;
        }
        return a ;
    }
}
