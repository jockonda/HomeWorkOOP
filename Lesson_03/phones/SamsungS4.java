package phones;

public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("phones.SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

    @Override
    final public void call(String number) {
        System.out.println("phones.IPhone class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("phones.SamsungS4 class is sending sms " + message + " hello" + " to " + number);
        setSmsCount(getSmsCount() + 1);
    }
}
