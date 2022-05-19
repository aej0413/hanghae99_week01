import java.util.UUID;

public class Taxi extends PublicTransport implements TaxiPassenger {

    Taxi() {
        setCarNumber();
        check_fuel(fuel);
        readydrive();
    }

    @Override
    public void setCarNumber() {
        this.carNumber = UUID.randomUUID().toString().substring(0, 3);
        System.out.println("이 택시의 번호는 " + "[" + this.carNumber + "]" + " 입니다.");
    }

    public void readydrive() {
        this.general = general;
        System.out.println("상태는 " + general + "이며 승객 탑승 가능합니다.");
    }

    @Override
    public void check_fuel(int fuel) {
        this.fuel = fuel;
        if (this.fuel > 10) {
            System.out.println("현재 주유량은 " + "[" + fuel + "]" + "입니다.");
        } else {
            System.out.println("현재 주유량은 " + "[" + fuel + "]" + "입니다.");
            stopdrive();
        }
    }

    @Override
    public void drive(int x) {
        this.fuel = fuel - x;
        int temp = fuel;
        this.fuel = temp;
        System.out.println("연료가 " + "["+x+"]" + "만큼 줄어 들어 현재 주유량은 " + "["+temp+"]" + " 입니다.");

    }

    public void stopdrive() {
        System.out.println("연료가 부족하여 운행을 중단합니다.");
    }

    @Override
    public void speedUp(int x) {
        this.speed = speed + x;
        int temp = speed;
        this.speed = temp;
        System.out.println("현재 속도는 " + (speed - x) + "이며 " + x + "만큼 증가되어 속도는" + temp + "입니다.");
    }

    @Override
    public void speedDown(int x) {
        this.speed = speed - x;
        int temp = speed;
        this.speed = temp;
        System.out.println("현재 속도가 " + x + "만큼 감소되어 속도는 " + temp + "입니다.");
    }

    public void imcomeTaxi() {
        this.money = money;
        System.out.println("택시의 수입은 " + money + "원 입니다.");
    }

    @Override
    public void take(int passengerCnt, String destination, int distanceDestination) {
        this.general = "[운행중]";
        System.out.println("손님이 탑승하여 " + this.general + "으로 변경됩니다.");
        this.passenger = passenger + passengerCnt;
        int temp = passenger;
        this.passenger = temp;
        if (temp < 4) {
            System.out.println("현재 승객은 " + temp + "이며 잔여 승객은 " + (4 - temp) + "입니다.");
        }
        this.basicPrice = 3000;
        this.basicDistance = 2;
        if (distanceDestination == basicDistance) {
            money = basicPrice;
        } else {
            money = (distanceDestination / 2) * basicPrice;
        }
        System.out.println("손님의 목적지는 " + destination + "이며, " + "목적지까지의 거리는 " + distanceDestination + "km 입니다." +
                " 기본요금은 " + basicDistance + "km당 " + basicPrice + "원 이며, 지불하실 금액은 " + money + "원 입니다.");
        imcomeTaxi();
    }
}