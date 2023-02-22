public class Droid {
    String name;
    double batteryLevel;
     
    // constructor
    public Droid(String name, double batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    // metodo para generar acciones
    public void performTask(String task) {
    System.out.println (name + " " + "esta haciendo esta accion" + " " + task);
    batteryLevel = batteryLevel - 10;
    }

    // metodo para controlar bateria
    public void battery() {
        
    }

    // metodo para acceder a los datos
    public String dataRobot() {
    return "Hola, soy un robot y mi nombre es" + " " + name;
    }

    // reporta el estado de bateria del robot
    public void energyReport() {
    System.out.println("el estado de bateria del robot es de" + " " + batteryLevel);
    } 

    // transfiere energia entre robots 
public void energyTransfer(Droid robot, double energy) {
    if (batteryLevel >= energy) {
        batteryLevel -= energy;
        robot.batteryLevel += energy;
        System.out.println(name + " transfirió " + energy + " de energía a " + robot.name);
    } else {
        System.out.println(name + " no tiene suficiente energía para transferir");
    }
}


    public static void main(String[] args) {
     Droid robotRoy = new Droid("Roy", 100);
     Droid robotFrey = new Droid("Frey", 30);

     System.out.println(robotRoy.dataRobot());
     robotRoy.energyReport();
     robotRoy.performTask("bailar");
     robotRoy.energyReport();
     robotRoy.energyTransfer(robotFrey, 40);
     robotRoy.energyReport();

     System.out.println(robotFrey.dataRobot());
     robotFrey.energyReport();
     robotFrey.performTask("bailar");
     robotFrey.energyReport();
     robotFrey.performTask("cocinar");
     robotFrey.energyReport();
    }
}
