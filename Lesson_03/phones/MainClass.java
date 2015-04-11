package phones;

public class MainClass {

    public static void main(String[] args) {
        // phones.Phone p = new phones.Phone(); ������ �.�. ����� �����������

        Nokia3310 nokia = new Nokia3310();
        System.out.println("phones.Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");
        System.out.println(nokia.getSmsCount());
        System.out.println(nokia.getCallCount());

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("phones.IPhone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");
        System.out.println(iphone.getSmsCount());
        System.out.println(iphone.getCallCount());

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("phones.IPhone screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.call("111-22-33");
        iphone5.sendSMS("567-78-89", "text message");
        iphone5.sendSMS("555-77-88", "text message");
        iphone5.sendSMS("333-44-99", "text message");
        System.out.println(iphone.getSmsCount());
        System.out.println(iphone5.getCallCount());

        System.out.println("----------------------------------");

        SamsungS4 samsungs4 = new SamsungS4();
        System.out.println("phones.SamsungS4 screen size: " + samsungs4.getScreenSize());
        samsungs4.call("123-45-67");
        samsungs4.call("222-22-22");
        samsungs4.call("111-11-11");
        samsungs4.sendSMS("567-78-89", "text message");
        samsungs4.sendSMS("555-77-88", "text message");
        System.out.println(samsungs4.getSmsCount());
        System.out.println(samsungs4.getCallCount());
    }
}
