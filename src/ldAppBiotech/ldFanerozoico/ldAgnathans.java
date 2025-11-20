package ldAppBiotech.ldFanerozoico;

public class ldAgnathans extends ldHagfishes{
    private String ldNombre;
    
     public ldAgnathans(String ldNombre) {
        super(); 
        this.ldNombre = ldNombre;
        ldSpinner();
        System.out.println("------------------Agnathans");
        ldSpinner();
        System.out.println("--------------Lampreys");
    }
    //clase con polimorfismo
    @Override
     public void ldSaludar() {
        System.out.println("Hola, soy " + getldNombre() + ", un Agnathan");
    }
    //clase con sobrecarga
    public void ldSaludar(String persona) {
        System.out.println("Hola " + persona + ", te saluda " + getldNombre() );
    }

    public String getldNombre() {
        return ldNombre;
    }

    public void setldNombre(String ldNombre) {
        this.ldNombre = ldNombre;
    }

}
