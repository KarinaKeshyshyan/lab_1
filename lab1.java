package com.lab1

public class Dryer {
	private int qimport java.awt.TextArea;
    import java.util.Scanner;
    
    public class Dryer {
        private int maxcapacity;
        private int weight;
        private int consuming;
        private String producer;
        private int size;
        protected String color;
        protected int type;
        static int number = 0;
    
        void setMaxCapacity(int maxcapacity) {
            this.maxcapacity = maxcapacity;
        }
    
        void setWeight(int weight) {
            this.weight = weight;
        }
    
        void setConsuming(String consuming) {
            this.consuming = consuming;
        }
    
        void setProducer(String producer) {
            this.producer = producer;
        }
    
        void setType(String size) {
            this.size = size;
        }
    
        void setColor(String color) {
            this.color = color;
        }
    
        void setType(int type) {
            this.type = type;
        }
    
        int getMaxCapacity() {
            return maxcapacity;
        }
    
        int getWeight() {
            return weight;
        }
    
        String getConsuming() {
            return consuming;
        }
    
        String getProducer() {
            return producer;
        }
    
        String getType() {
            return size;
        }
    
        String getColor() {
            return color;
        }
    
        int getType() {
            return type;
        }
    
        static int getNumber() {
            return number;
        }
    
        public int Number() {
            number++;
            return number;
        }
        public Dryer(){
            
        }
    
        public Dryer(int maxcapacity, int weight, int consuming, String producer) {
            this.maxcapacity = maxcapacity ;
            this.weight = weight;
            this.consuming = consuming ;
            this.producer = producer;
    
        }
    
        public Dryer(String producer, int maxcapacity, int weight, int consuming, String size, String color, int type)
    
        {
    
            this(producer, maxcapacity, weight , consuming);
            this.size=size;
            this.color=color;
            this.type=type;
    
        }
    
    
    
        public String toString() {
            return "MaxCapacity: " + maxcapacity + "\n Weight: " + weight + "Consuming: "
            + consuming;
    
        }
    
        static void printStaticNumber() {
            System.out.println(number);
        }
        
        static void printNumber() {
            System.out.println(number);
        }
    
        
    
        public static void main(String[] args) {
    
            Dryer Samsung = new Dryer(4, 5, "Q","GsFacrory");
            System.out.println("MaxCapacity = " + Samsung.getMaxCapacity());
            System.out.println("Weight = " + Samsung.getWeight());
            System.out.println("Consuming = " + Samsung.getConsuming() + "\n");
    
            Dryer LG = new Dryer(1, 3, "W" ,"LvivFacrory");
            System.out.println("MaxCapacity = " + LG.getMaxCapacity());
            System.out.println("Weight = " + LG.getWeight());
            System.out.println("Consuming = " + LG.getConsuming() + "\n");
    
            Dryer Ariston = new Dryer(222, 33, "E" ,"MetrixFacrory");
            System.out.println("MaxCapacity = " + Ariston.getMaxCapacity());
            System.out.println("Weight = " + Ariston.getWeight());
            System.out.println("Consuming = " + Ariston.getConsuming() + "\n");
    
            Dryer Wirpool = new Dryer(11, 55, "R" ,"VizarFacrory");
            System.out.println("MaxCapacity = " + Wirpool.getMaxCapacity());
            System.out.println("Weight = " + Wirpool.getWeight());
            System.out.println("Consuming = " + Wirpool.getConsuming() + "\n");
    
            Dryer Bosch = new Dryer(66, 7, "T" ,"LGFacrory");
            System.out.println("MaxCapacity = " + Bosch.getMaxCapacity());
            System.out.println("Weight = " + Bosch.getWeight());
            System.out.println("Consuming = " + Bosch.getConsuming() + "\n");
        }
    
    }max;
	private int weight;
	private String consuming;
	private String producer;
	private String size;
	protected String color;
	protected int type;
	static int number = 0;

	void setMaxCapacity(int maxcapacity) {
		this.maxcapacity = maxcapacity;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	void setConsuming(String consuming) {
		this.consuming = consuming;
	}

	void setProducer(String producer) {
		this.producer = producer;
	}

	void setType(String size) {
		this.size = size;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setType(int type) {
		this.type = type;
	}

	int getMaxCapacity() {
		return maxcapacity;
	}

	int getWeight() {
		return weight;
	}

	String getConsuming() {
		return consuming;
	}

	String getProducer() {
		return producer;
	}

	String getType() {
		return size;
	}

	String getColor() {
		return color;
	}

	int getType() {
		return type;
	}

	static int getNumber() {
		return number;
	}

	public int Number() {
		number++;
		return number;
	}
	public Dryer(){
		
	}

	public Dryer(String producer, int maxcapacity, int weight, String consuming) {
        this.producer = producer;
		this.maxcapacity = maxcapacity ;
		this.weight = weight;
		this.consuming = consuming ;
		

	}

	public Dryer(String producer, int maxcapacity, int weight, String consuming, String size, String color, int type)

	{

		this(producer, maxcapacity, weight, consuming);
		this.size=size;
		this.color=color;
		this.type=type;

	}



	public String toString() {
		return " MaxCapacity: " + maxcapacity + "\n Weight: " + weight + "Consuming: "
		+ consuming;

	}

	static void printStaticNumber() {
		System.out.println(number);
	}
	
	static void printNumber() {
		System.out.println(number);
	}

	

	public static void main(String[] args) {

		Dryer Samsung = new Dryer(5, 50, 2000,"Samsung");
		System.out.println("MaxCapacity = " + Samsung.getMaxCapacity());
		System.out.println("Weight = " + Samsung.getWeight());
		System.out.println("Consuming = " + Samsung.getConsuming() + "\n");

		Dryer LG = new Dryer(7, 60, 2500 ,"LG");
		System.out.println("MaxCapacity = " + LG.getMaxCapacity());
		System.out.println("Weight = " + LG.getWeight());
		System.out.println("Consuming = " + LG.getConsuming() + "\n");

		Dryer Ariston = new Dryer(10, 45, 1800 ,"Ariston");
		System.out.println("MaxCapacity = " + Ariston.getMaxCapacity());
		System.out.println("Weight = " + Ariston.getWeight());
		System.out.println("Consuming = " + Ariston.getConsuming() + "\n");

		Dryer Wirpool = new Dryer(8, 66, 1500 ,"Wirpool");
		System.out.println("MaxCapacity = " + Wirpool.getMaxCapacity());
		System.out.println("Weight = " + Wirpool.getWeight());
		System.out.println("Consuming = " + Wirpool.getConsuming() + "\n");

		Dryer Bosch = new Dryer(9, 44, 2200 ,"Bosch");
		System.out.println("MaxCapacity = " + Bosch.getMaxCapacity());
		System.out.println("Weight = " + Bosch.getWeight());
		System.out.println("Consuming = " + Bosch.getConsuming() + "\n");
	}

}