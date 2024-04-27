public class TvUser {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on? " + smartTv.turnedOn);
        System.out.println("TV current channel? " + smartTv.channel);
        System.out.println("TV current volume? " + smartTv.volume);

        smartTv.turnOn();
        smartTv.goToBackwardChannel();
        smartTv.goToForwardChannel();
        smartTv.changeChannel(28);

        System.out.println("New current channel: " + smartTv.channel);
    }
}
