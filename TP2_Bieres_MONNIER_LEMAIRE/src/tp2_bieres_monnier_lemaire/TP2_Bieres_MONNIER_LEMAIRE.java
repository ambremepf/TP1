/*
TP2 bières, Ambre Monnier et Jean Lemaire, 08/10/2021
 */
package tp2_bieres_monnier_lemaire;

/**
 *
 * @author jeanl
 */
public class TP2_Bieres_MONNIER_LEMAIRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        BouteilleBiere uneBiere = new BouteilleBiere("cuvée des trolls",(float) 7.0,"Dubuisson");
       
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("8.6",(float) 8.9, "pref dodo");
        
        deuxiemeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Chouffe Blanche",(float) 54,"Pour te mettre dans la cuvette des toillettes");
       
        troisiemeBiere.lireEtiquette();
        
        troisiemeBiere.decapsuler();
        
        troisiemeBiere.lireEtiquette();
        
        troisiemeBiere.toString();
        
        System.out.println(troisiemeBiere);
       
    }
    
    
}
