package phones;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    private int callCount = 0;
    private int smsCount = 0;

    public Phone() {
        System.out.println("phones.Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getCallCount() {
        return callCount;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setCallCount(int callCount) {
        this.callCount = callCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public void call(String number) {
        System.out.println("phones.Phone class is calling " + number);
        setCallCount(getCallCount() + 1);
    }

    public abstract void sendSMS(String number, String message);

}
