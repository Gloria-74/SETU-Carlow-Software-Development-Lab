package Q2;

public class CarTest{

    public static void main(String args[])
    {
        RoadVehicle[] roadVehicles = new RoadVehicle[2];

        roadVehicles[0] = new Car("SUV", 4, 6);
        roadVehicles[1] = new Hgv(4,1,1);

        System.out.println(roadVehicles[0]);
        System.out.println("The Tax costs " + roadVehicles[0].calculateDuty() + " Euros");

        System.out.println(roadVehicles[1]);
        System.out.println("The Tax costs " + roadVehicles[1].calculateDuty() + " Euros");

    }
}
