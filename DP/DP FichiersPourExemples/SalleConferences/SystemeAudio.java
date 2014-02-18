public class SystemeAudio {
    protected int volumeSon;

    public SystemeAudio() {
        this.volumeSon = 5;
    }

    public void allume() {
        System.out.println("Système audio allumé");
    }

    public void eteint() {
        System.out.println("Système audio arrêté");
    }

    public void setVolumeSon(int volume) {
        this.volumeSon = volume;
    }

}
