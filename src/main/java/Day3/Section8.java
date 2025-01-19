package Day3;

public class Section8 {
        //Composition Challenge
    public class Bedroom {
        // write code here
        private String name;
        private Wall wall1;
        private Wall wall2;
        private Wall wall3;
        private Wall wall4;
        private Ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

        public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
            this.name = name;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.wall3 = wall3;
            this.wall4 = wall4;
            this.ceiling = ceiling;
            this.bed = bed;
            this.lamp = lamp;
        }

        public Lamp getLamp() {
            return lamp;
        }

        public void makeBed() {
            System.out.print("Bedroom -> Making bed | ");
            bed.make();
        }
    }
    public class Wall {
        // write code here
        private String direction;

        public Wall(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }
    public class Ceiling {
        // write code here
        private int height;
        private int paintedColor;

        public Ceiling(int height, int paintedColor) {
            this.height = height;
            this.paintedColor = paintedColor;
        }

        public int getHeight() {
            return height;
        }

        public int getPaintedColor() {
            return paintedColor;
        }
    }
    public class Bed{
        // write code here
        private String style;
        private int pillows;
        private int height;
        private int sheets;
        private int quilt;

        public Bed(String style, int pillows, int height, int sheets, int quilt) {
            this.style = style;
            this.pillows = pillows;
            this.height = height;
            this.sheets = sheets;
            this.quilt = quilt;
        }

        public void make() {
            System.out.print("Bed -> Making | ");
        }

        public String getStyle() {
            return style;
        }

        public int getPillows() {
            return pillows;
        }

        public int getHeight() {
            return height;
        }

        public int getSheets() {
            return sheets;
        }

        public int getQuilt() {
            return quilt;
        }
    }
    public class Lamp {
        // write code here
        private String style;
        private boolean battery;
        private int globRating;

        public Lamp(String style, boolean battery, int globRating) {
            this.style = style;
            this.battery = battery;
            this.globRating = globRating;
        }

        public void turnOn() {
            System.out.print("Lamp -> Turning on");
        }

        public String getStyle() {
            return style;
        }

        public boolean isBattery() {
            return battery;
        }

        public int getGlobRating() {
            return globRating;
        }
    }
    //Printer Challenge
    public class Printer {
        // write code here
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            if (tonerLevel > -1 && tonerLevel <= 100) {
                this.tonerLevel = tonerLevel;
            } else {
                this.tonerLevel = -1;
            }

            this.duplex = duplex;

            this.pagesPrinted = 0;
        }

        public int addToner(int tonerAmount) {
            if (tonerAmount > 0 && tonerAmount <= 100) {
                if (tonerLevel + tonerAmount > 100) {
                    return -1;
                } else {
                    tonerLevel += tonerAmount;
                    return tonerLevel;
                }
            } else {
                return -1;
            }
        }

        // Method to print pages
        public int printPages(int pages) {
            int pagesToPrint = pages;

            if (duplex) {
                pagesToPrint = (int) Math.ceil(pages / 2.0);
            }

            pagesPrinted += pagesToPrint;

            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }
    }
    //Polymorphism Challenge
    public class Car {
        // write code here
        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.engine = true;
            this.wheels = 4;
            this.cylinders = cylinders;
            this.name = name;
        }

        public String startEngine() {
            return "Car -> " + name + " engine is starting.";
        }

        public String accelerate() {
            return "Car -> " + name + " is accelerating.";
        }


        public String brake() {
            return "Car -> " + name + " is braking.";
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
    }
    public class Mitsubishi extends Car {
        // write code here
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi -> " + getName() + " engine is starting.";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi -> " + getName() + " is accelerating.";
        }

        @Override
        public String brake() {
            return "Mitsubishi -> " + getName() + " is braking.";
        }
    }
    public class Holden extends Car {
        // write code here
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Holden -> " + getName() + " engine is starting.";
        }

        @Override
        public String accelerate() {
            return "Holden -> " + getName() + " is accelerating.";
        }

        @Override
        public String brake() {
            return "Holden -> " + getName() + " is braking.";
        }
    }
    public class Ford extends Car {
        // write code here
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> " + getName() + " engine is starting.";
        }

        @Override
        public String accelerate() {
            return "Ford -> " + getName() + " is accelerating.";
        }

        @Override
        public String brake() {
            return "Ford -> " + getName() + " is braking.";
        }
    }
    //
    public static void main(String[] args) {

    }
}
