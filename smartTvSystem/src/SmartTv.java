public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume=25;

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void increaseChannel(){
        channel++;
    }
    public void decreaseChannel(){
        channel--;
    }
}
