class Computer {
    public void playMusic() {
        System.out.println("Playing guitar music...");
    }

    public String getMePenDrive() {
        return "USB drive";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMePenDrive());
    }
}