import javax.crypto.Mac;

public class FairyTale {
    public static void main(String[] args) {
        System.out.println("The fairy tale begins....");
        System.out.println();
        //Initialize objects
        Carlson Carlson = new Carlson();
        Machine Machine = new Machine(Objects_Enum.MACHINE);
        Kid Kid = new Kid(Machine);
        Objects Stains = new Objects(Objects_Enum.STAINS);
        Objects Valve = new Objects(Objects_Enum.VALVE);

        Kid.happy();
        System.out.println();
        //test machine
        Machine.repair(Kid, Machine);
        Machine.repair(Carlson, Machine);
        Machine.repair(Carlson, Valve);
        Machine.repair(Kid, Valve);
        System.out.println();

        Machine.test_run();
        Kid.grieve(Stains);

    }
}
