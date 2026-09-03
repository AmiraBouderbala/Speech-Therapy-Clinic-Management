import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FicheSuivi {
    private String nomFichSuivi ;
    private List<Objectifs> listobjs ;
    public FicheSuivi(String nomFichSuivi ){
        this.nomFichSuivi = nomFichSuivi ;
        this.listobjs = new ArrayList<Objectifs>();
    }
    public void ajouterobj(String enonceObj  ,TypeObjectifs typeobj){
        this.listobjs.add(new Objectifs(enonceObj  ,typeobj)) ;
    }
    public void supprimerobj(Objectifs Objf){
        this.listobjs.remove(Objf) ;
    }
   /* public boolean canAddFichSuivi(){
        boolean a = true ;
        Iterator<Objectifs> it = listobjs.iterator() ;
        boolean nx = it.hasNext() ;
        System.out.println("it.hasNext()"+nx);
        while (nx){
            boolean bl = it.next().isAtteint() ;
            System.out.println("bl"+bl);
           if(!bl){
               a =  false ;

           }
            nx = it.hasNext() ;
        }
         return a ;
    }*/
    public List<Objectifs> getListobjs(){
        return this.listobjs;
    }
    public void afficherObjs(){
        ListIterator<Objectifs>  it = listobjs.listIterator();
        while (it.hasNext()){
            Objectifs obj = it.next();
            System.out.println(obj.getEnonceObj());
            System.out.println("note"+obj.getNote());
            System.out.println("isAtteint "+obj.isAtteint());
        }
    }
    public boolean canAddFichSuivi(){
       /* ListIterator<Objectifs>  it1 = listobjs.listIterator();
        boolean nx = it1.hasNext() ;
        System.out.println("it.hasNext()"+nx);
        boolean a = true ;
        while (nx){
            boolean bl = it1.next().isAtteint() ;
            System.out.println("bl"+bl);
            if(!bl){
                a =  false ;

            }
            nx = it1.hasNext() ;
        }
        return a ;*/
        boolean a = true ;
        System.out.println("this.listobjs.size() "+this.listobjs.size());
        for(int i = 0 ; i< this.listobjs.size() ; i++){
            if( this.listobjs.get(i).isAtteint() == false ){
             a = false ;
             System.out.println("hello");
            }
        }
        System.out.println("a"+a);
        return  a ;
    }
}
