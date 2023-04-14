public class Notebook {

    private String title;
    private String os;
    private String color;
    private int ram;
    private int hd;

    public Notebook(String title, String os, String color, int ram, int hd){
        this.title = title;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.hd = hd;
    }

    String displayInfo(){
        return String.format(
                "%s: %s, %s, %d RAM, %d HD.",
                title, os, color, ram, hd
        );
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getHd() {
        return hd;
    }

}
