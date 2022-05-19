import java.util.UUID;

public class Bus extends PublicTransport implements BusPassenger {

    Bus(){
        setCarNumber();
        initialDrive();
        check_fuel(fuel);
    }

    @Override
    public void setCarNumber() {
        this.carNumber = UUID.randomUUID().toString().substring(0,3);
        System.out.println("이 버스는 " + "("+this.carNumber+")" + "번 버스 입니다.");
    }


    @Override
    public void check_fuel(int fuel) {
        this.fuel = fuel;
        if (this.fuel > 10) {
            System.out.println("현재 주유량은 " +"["+fuel+"]" + "입니다.");
        }else {
            System.out.println("현재 주유량은 " + "["+fuel+"]" + "입니다. 주유가 필요합니다.");
        }
    }

    public void initialDrive() {
        if (this.operation = true) {
            System.out.println("최초 운행상태입니다.");
        }
    }
    public void stopdrive() {
        System.out.println("연료가 부족하여 차고지로 돌아갑니다.");
    }

    @Override
    public void drive(int x) {
        this.fuel = fuel - x;
        int temp = fuel;
        this.fuel = temp;
        System.out.println("연료가 " + "["+x+"]" + "만큼 줄어 들어 현재 주유량은 " + "["+temp+"]" + " 입니다.");
        if (fuel < 5) {
            stopdrive();
        }
    }

    @Override
    public void speedUp(int x) {
        this.speed = speed + x;
        int temp = speed;
        this.speed = temp;
        System.out.println("현재 속도는 " + "["+(speed-x)+"]" + "이며 " + "["+x+"]" + "만큼 증가되어 속도는 " + "["+temp+"]" + "입니다.");
    }

    @Override
    public void speedDown(int x) {
        this.speed = speed -x;
        int temp = speed;
        this.speed = temp;
        System.out.println("현재 속도가 " + "["+x+"]" + "만큼 감소되어 속도는 "+ "["+temp+"]"+ "입니다.");
    }

    @Override
    public void take(int passengerCount) {
        this.passenger = passenger + passengerCount;
        int temp = passenger;
        this.passenger = temp;
        if (temp > 30) {
            System.out.println("현재 탐승하신 승객은 " + passengerCount+ "입니다. 정원은 30명 입니다. 현재 승객은 " + temp + "명이므로 정원을 초과하였습니다. " + (temp-30) + "명은 다음 버스를 이용해주세요.");
        } else {
            this.money = 1000;
            money = passenger * money;
            System.out.println("현재 탑승하신 승객은 " + "["+temp+"]" + "명이며, " + "["+carNumber+"]" + "번 버스의 수입은 " + "["+money+"]" + "입니다."+" 잔여 승객수는 " + "["+(30-temp)+"]" + "입니다.");
        }
    }

}
