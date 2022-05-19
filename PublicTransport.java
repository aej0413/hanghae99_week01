import java.util.UUID;

public abstract class PublicTransport {

    int passenger;
    static String carNumber;
    int money;
    int fuel = 100;
    int speed;
    int basicPrice =2500;
    boolean operation; // Bus 운전상태 최초 '운행'
    int fare_Per_Distance; // 거리당 요금 5마다 500원 상승.
    int basicDistance = 5; //기본 거리
    String destination; // 목적지
    int distanceDestination; // 목적지까지의 거리
    String general = "일반"; // 택시상태 = 일반일 때만 탑승 가능.
    String driving = "운행중"; // 택시가 승객 태우면 운행중으로 변경.

    public abstract void check_fuel(int fuel);

    public abstract void drive(int fuel);

    public abstract void speedUp(int x);

    public abstract void speedDown(int x);

    public abstract void setCarNumber();


}
