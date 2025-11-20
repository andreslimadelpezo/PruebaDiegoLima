package ldAppBiotech.ldProterozoico;

public abstract class ldGnathostomata {
    public ldGnathostomata() {
        ldSpinner();
        System.out.println("----------Gnathostomata");
    }
    
    //refactorizacion
    public void ldSpinner() {
        String[] frames = { "\\","|" ,"/", "-","\\" };
        for (int i = 0; i < 20; i++) {
            System.out.print("\r" + frames[i % 3] );
            try { Thread.sleep(100); } catch (Exception e) {}
        }
        System.out.print("\r"); 
    }
}
