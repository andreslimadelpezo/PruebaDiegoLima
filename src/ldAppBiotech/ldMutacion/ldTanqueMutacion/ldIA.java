package ldAppBiotech.ldMutacion.ldTanqueMutacion;

import java.util.Random;

import ldAppBiotech.ldFanerozoico.ldAgnathans;


public class ldIA {

    public void ldMutar(ldAgnathans agna) {

        if (agna == null) {
            System.out.println("Mutación fallida");
            return;
        }
        Random ldNum = new Random();
        int ldAvance = ldNum.nextInt(901) + 100;

        for (int i = 0; i <= ldAvance; i++) {
            System.out.print(
                "\r" + "Mutación en proceso: " +
                "------------------- " + i + " de " + ldAvance + " (mSv)"
            );

            try {
                Thread.sleep(10); // velocidad del spinner
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        String nuevaEspecie = agna.getldNombre() + "Lima";
        ldSpinner();
       System.out.println("------------------------- " + agna.getldNombre());
       ldSpinner();
        System.out.println( "------------------------------- " + nuevaEspecie);
       

    }

    // refactorizacion
    public String ldSpinner() {
        String[] sp = { "|", "/", "-", "\\" };
        int pos = (int) (Math.random() * sp.length);
        return sp[pos];
    }
}
