public class SmartTv {
    boolean turnedOn = false;
    int channel = 1;
    int volume = 15;

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    public void changeChannel(int desiredChannel) {
        channel = desiredChannel;
    }

    public void goToForwardChannel() {
        channel++;
    }

    public void goToBackwardChannel() {
        channel--;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

}
