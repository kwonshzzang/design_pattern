package kr.co.kwonshzzang.designpattern.adapter.ex01;

public class Main {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    //콘센트 110V
    public static void connect(Electronic110V electronic110V) {
        electronic110V.poweOn();
    }
}
