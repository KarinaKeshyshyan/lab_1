package ua.lviv.iot;

public class Dryer {
    private int maxcapacity;
    private int weight;
    private int consuming;
    private String producer;
    private int size;
    protected String color;
    protected int type;
    static int number = 0;

    public Dryer() {

    }

    public Dryer(int maxcapacity, int weight, int consuming, String producer) {
        this(maxcapacity, weight, consuming, producer, 0, null,0);

    }

    public Dryer(int maxcapacity, int weight, int consuming, String producer, int size, String color, int type) {

        this.size = size;
        this.color = color;
        this.type = type;
        this.maxcapacity = maxcapacity;
        this.weight = weight;
        this.consuming = consuming;
        this.producer = producer;
    }

    public void resetValues(int maxcapacity, int weight, int consuming, String producer, int size, String color, int type) {
        this.maxcapacity = maxcapacity;
        this.weight = weight;
        this.consuming = consuming;
        this.producer = producer;
        this.size = size;
        this.color = color;
        this.type = type;
    }


    public String toString() {
        return "Dryer{" +
                "maxcapacity=" + maxcapacity +
                ", weight=" + weight +
                ", consuming=" + consuming +
                ", producer='" + producer + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}';
    }

    public static int printStaticNumber (){
       return number;
    }

    public int  printNumber(){
        return number;
    }

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public void setMaxcapacity(int maxcapacity) {
        this.maxcapacity = maxcapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getConsuming() {
        return consuming;
    }

    public void setConsuming(int consuming) {
        this.consuming = consuming;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Dryer.number = number;
    }
}


