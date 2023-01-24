public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.on);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("TV Ligada ?" + smartTv.on);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        System.out.println("Volume atual ?" + smartTv.volume);
        smartTv.decreaseVolume();
        System.out.println("Volume atual ?" + smartTv.volume);

        

        

    }
}
