package phones;

public class IPhone5 extends IPhone {

    public IPhone5() {
        System.out.println("phones.IPhone5 constructor");

        screenSize = 4;
    }

	/*@Override
	public void call(String number) {
		System.out.println("phones.IPhone class is calling " + number);
	}*/ // ������ �.�. ����� final

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("phones.IPhone5 class is sending sms " + message + " to " + number);
        setSmsCount(getSmsCount() + 1);
    }
}
