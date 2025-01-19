package Day3;

public class Section7 {
    //Simple Calculator challenge
    public class SimpleCalculator {
        // write code here
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return firstNumber;
        }

        public double getSecondNumber(){
            return secondNumber;
        }

        public void setFirstNumber(double firstNumber){
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber){
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult(){
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult(){
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult(){
            return firstNumber * secondNumber;
        }

        public double getDivisionResult(){
            return (secondNumber == 0)? 0 : firstNumber / secondNumber;
        }

    }
    //Person Challenge
    public class Person {
        // write code here
        private String firstName , lastName;
        private int age;

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public int getAge(){
            return age;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setAge(int age){
            this.age = (age < 0 || age > 100)? 0 : age;
        }

        public boolean isTeen(){
            return (age> 12 && age < 20);
        }

        public String getFullName(){
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else if (firstName.isEmpty()) {
                return lastName;
            } else if (lastName.isEmpty()) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }
    //Wall Area Challenge
    public class Wall {
        // write code here
        private double width;
        private double height;

        public Wall() {
            this.width = 0;
            this.height = 0;
        }

        public Wall(double width, double height) {
            this.width = (width < 0) ? 0 : width;
            this.height = (height < 0) ? 0 : height;
        }


        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public void setWidth(double width) {
            this.width = (width < 0) ? 0 : width;
        }

        public void setHeight(double height) {
            this.height = (height < 0) ? 0 : height;
        }

        public double getArea() {
            return width * height;
        }
    }
    //Point Challenge
    public class Point {
        // write code here
        private int x, y;

        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Method to get the value of x
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        public double distance(Point other) {
            int dx = other.x - this.x;
            int dy = other.y - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double distance(int x, int y) {
            int dx = x - this.x;
            int dy = y - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }
    //Carpet Challenge
    public class Floor {
        // write code here
        private double width;
        private double length;

        public Floor(double width, double length) {
            this.width = (width < 0) ? 0 : width;
            this.length = (length < 0) ? 0 : length;
        }

        public double getArea() {
            return width * length;
        }
    }
    public class Carpet {
        // write code here
        private double cost;

        public Carpet(double cost) {
            this.cost = (cost < 0) ? 0 : cost;
        }

        public double getCost() {
            return cost;
        }
    }
    public class Calculator {
        // write code here
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }
    //Cylinder Challenge
    public class Circle {
        // write code here
        private double radius;
        public Circle(double radius) {
            this.radius = (radius < 0) ? 0 : radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }
    public class Cylinder extends Circle {
        // write code here
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = (height < 0) ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea() * height;
        }
    }
    //Cuboid Challenge
    public class Rectangle {
        // write code here
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = (width < 0) ? 0 : width;
            this.length = (length < 0) ? 0 : length;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        public double getArea() {
            return width * length;
        }
    }
    public class Cuboid extends Rectangle{
        // write code here
        private double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            this.height = (height < 0) ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea() * height;
        }
    }
    public static void main(String[] args) {

    }
}
