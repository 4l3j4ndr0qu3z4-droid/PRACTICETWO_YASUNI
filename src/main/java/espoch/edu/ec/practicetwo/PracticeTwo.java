package espoch.edu.ec.practicetwo;

import espoch.edu.ec.practicetwo.access.InterfaceAssignment;
import espoch.edu.ec.practicetwo.data.Assignments;
import espoch.edu.ec.practicetwo.object.Assignment;
import espoch.edu.ec.practicetwo.object.Device;
import espoch.edu.ec.practicetwo.object.Guide;
import espoch.edu.ec.practicetwo.object.RegularTour;
import espoch.edu.ec.practicetwo.object.Tour;
import espoch.edu.ec.practicetwo.object.Trail;

public class PracticeTwo {

    public static void main(String[] args) {

        
        
        
        Trail[] trailOrellana = new Trail[3];
        trailOrellana[0] = new Trail("Loreto", 1234.0f, 60.0f, true);
        trailOrellana[1] = new Trail("Coca", 14.0f, 20.0f, true);
        trailOrellana[2] = new Trail("Huaticocha", 12.0f, 28.0f, true);

        Trail[] trailNapo = new Trail[3];
        trailNapo[0] = new Trail("Tena", 234.0f, 30.0f, true);
        trailNapo[1] = new Trail("Cotapino", 14.0f, 20.0f, true);
        trailNapo[2] = new Trail("Ahuano", 12.0f, 28.0f, true);

        Trail[] trailSpain = new Trail[3];
        trailSpain[0] = new Trail("Valencia", 1234.0f, 60.0f, true);
        trailSpain[1] = new Trail("Madrid", 14.0f, 20.0f, true);
        trailSpain[2] = new Trail("Barcelona", 12.0f, 28.0f, true);

        Tour[] tourOne = new RegularTour[3];
        tourOne[0] = new RegularTour("111", "Tour 1", trailOrellana, 1.0f);
        tourOne[1] = new RegularTour("222", "Tour 2", trailNapo, 1.0f);
        tourOne[2] = new RegularTour("333", "Tour 3", trailSpain, 1.0f);

        Guide[] guide = new Guide[3];
        guide[0] = new Guide("2200650102", " Jostin", true);
        guide[1] = new Guide("1258645378", " Alveiro", true);
        guide[2] = new Guide("3437613676", " Edwin", true);
        Device[] device = new Device[3];
        device[0] = new Device("Window", "Computer", true);
        device[1] = new Device("Android", "Sansung S26", true);
        device[2] = new Device("IOS", "Iphone 17", true);

        Assignment ass = new Assignment();
        ass.setTour(tourOne);
        ass.setGuide(guide);
        ass.setDevice(device);

        ass.setAssignGuide(guide[0]);
        ass.setAssignDevice(device[0]);
        ass.setAssignTour(tourOne[0]);

        ass.setNewPerson(true);
        ass.setTimeLimited(false);

        InterfaceAssignment InterAss = new Assignments();
        // --- PROBAR Y VERIFICAR VALIDATE ---
        System.out.println("=== PROBANDO VALIDATE ===");
        System.out.println("Estado inicial guía 0 (disponible): " + guide[0].isStateGuide());
        System.out.println("Estado inicial dispositivo 0 (disponible): " + device[0].isStateDevice());

        boolean resValidate = InterAss.validate(ass);
        System.out.println("Validate: " + resValidate);

        // Comprobamos si cambiaron a false tras la asignación exitosa
        System.out.println("Estado guía 0 después de validate: " + guide[0].isStateGuide());
        System.out.println("Estado dispositivo 0 después de validate: " + device[0].isStateDevice());

        // --- PROBAR Y VERIFICAR ORDER RUTE ---
        System.out.println("\n=== PROBANDO ORDER RUTE ===");
        System.out.println("Senderos del Tour 1 antes de ordenar (por longitud):");
        for (int i =0;i< trailOrellana.length;i++) {
            System.out.println(" - " + trailOrellana[i].getLengthTrail()+ " (Longitud: " + trailOrellana[i].getLengthTrail()+ ")");
        }

        boolean resOrder = InterAss.orderRute(ass);
        System.out.println("OrderRute: " + resOrder);

        System.out.println("Senderos del Tour 1 después de ordenar:");
        for (int i =0;i< trailOrellana.length;i++) {
            System.out.println(" - " + trailOrellana[i].getLengthTrail()+ " (Longitud: " + trailOrellana[i].getLengthTrail()+ ")");
        }
    }
}
