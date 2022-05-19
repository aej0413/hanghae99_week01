public class main {
    public static void main(String[] args) {

        System.out.println("----------------BUS01-------------------");
        Bus bus = new Bus();
        System.out.println("---------------------------------------------------");
        bus.drive(10);
        bus.drive(30);
        bus.check_fuel(bus.fuel);
        System.out.println("---------------------------------------------------");
        bus.take(12);
        System.out.println("---------------------------------------------------");
        bus.speedUp(50 );
        bus.speedDown(20);
        System.out.println("---------------------------------------------------");
        bus.drive(75);
        System.out.println("---------------------------------------------------");


        System.out.println("----------------BUS02-------------------");
        Bus bus1 = new Bus();
        System.out.println("---------------------------------------------------");
        bus1.drive(50);
        bus1.drive(10);
        bus1.check_fuel(bus1.fuel);
        System.out.println("---------------------------------------------------");
        bus1.take(12);
        System.out.println("---------------------------------------------------");
        bus1.speedUp(50 );
        bus1.speedDown(20);
        System.out.println("---------------------------------------------------");
        bus1.drive(40);
        System.out.println("---------------------------------------------------");


        System.out.println("---------------------------------------------------");


        System.out.println("----------------Taxi01-------------------");
        Taxi taxi = new Taxi();
        System.out.println("---------------------------------------------------");
        taxi.drive(50);
        taxi.drive(10);
        taxi.check_fuel(taxi.fuel);
        System.out.println("---------------------------------------------------");
        taxi.take(3,"서울역",7);
        System.out.println("---------------------------------------------------");
        taxi.speedUp(50 );
        taxi.speedDown(20);
        System.out.println("---------------------------------------------------");
        taxi.drive(40);
        taxi.check_fuel(taxi.fuel);
        System.out.println("---------------------------------------------------");


        System.out.println("----------------Taxi02-------------------");
        Taxi taxi2 = new Taxi();
        System.out.println("---------------------------------------------------");
        taxi2.drive(40);
        taxi2.drive(30);
        taxi2.check_fuel(taxi2.fuel);
        System.out.println("---------------------------------------------------");
        taxi2.take(1,"남양주",18);
        System.out.println("---------------------------------------------------");
        taxi2.speedUp(50 );
        taxi2.speedDown(20);
        System.out.println("---------------------------------------------------");
        taxi2.drive(30);
        taxi2.check_fuel(taxi2.fuel);
        System.out.println("---------------------------------------------------");














    }
}
