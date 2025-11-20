package ldAppBiotech.ldFanerozoico;

import ldAppBiotech.ldProterozoico.ldGnathostomata;

public abstract class ldHagfishes extends ldGnathostomata {
    public ldHagfishes() {
        super(); 
        ldSpinner();
        System.out.println("-------------- Hagfishes");
    }
    public void ldSaludar(){
        System.out.println("Hola, estoy Saludando soy hagfish ");
    }
}
