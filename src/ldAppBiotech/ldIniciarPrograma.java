package ldAppBiotech;

import java.util.Scanner;

import ldAppBiotech.ldFanerozoico.ldAgnathans;
import ldAppBiotech.ldMutacion.ldTanqueMutacion.ldIA;

public class ldIniciarPrograma {
    public void ldEjecutar() {
        System.out.println("\n--------------Bienvenido----------\n");
        System.out.println(".........MOSTRANDO ÁRBOL FILOGENÉTICO.........");
        ldAgnathans ldAnimal = new ldAgnathans("Agnathans");
        ldIA ia = new ldIA();
        Scanner ldIngresoDatos = new Scanner(System.in);
        int ldOpcion = 0;

        do {
            try {
                System.out.println("\n========= MENÚ BIOTECH =========");
                System.out.println("1. Ver qué está haciendo el animal");
                System.out.println("2. Mutar animal");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                ldOpcion = Integer.parseInt(ldIngresoDatos.nextLine());
                if (ldOpcion < 1 || ldOpcion > 3) {
                    System.out.println("...........Ingrese un numero valido, intente de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println(".............Ingrese solo numeros......");
            }

            switch (ldOpcion) {
                case 1:
                    System.out.println("El biologo esta observando el animal " + ldAnimal.getldNombre());
                    ldAnimal.ldSaludar();
                    ldAnimal.ldSaludar("Diego Lima");
                    break;
                case 2:
                    int ldMuta = 0;
                    do {

                        try {
                            System.out.println("\n===Biologo agregue un animal para mutar ===");
                            System.out.println("1. Lobe-finned fishes");
                            System.out.println("2. Amphibias");
                            System.out.println("3. Reptiles");
                            System.out.println("4. Mammals");
                            System.out.println("5. Agnathans");
                            System.out.print("Opción: ");

                            ldMuta = Integer.parseInt(ldIngresoDatos.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("............Ingrese solo numeros.......");
                        }

                        if (ldMuta == 5) {
                            ia.ldMutar(ldAnimal);
                        }
                        if (ldMuta < 5 && ldMuta >= 1) {
                            ia.ldMutar(null);
                            break;

                        }
                        if (ldMuta > 5 || ldMuta < 1) {
                            System.out.println("........Ingrese un numero valido..........");
                        }
                    } while (ldMuta > 5 || ldMuta < 1);
                    break;
                case 3:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    break;
            }

        } while (ldOpcion != 3);
        ldIngresoDatos.close();

    }

}
