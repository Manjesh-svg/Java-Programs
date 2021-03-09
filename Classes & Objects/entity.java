public class entity {
    private String Car;         // private variable
    private int wheels;
    private int year;


    entity() {
        Car = "NA";
        wheels = 0;
        year = 0;
    }

    public void ChangeAll(String a, int b, int c){
            Car = a;
            wheels = b;
            year = c;
    }
    public void changeCar(String a) {
        Car = a;
    }

    public void changeWheel(int a ) {
            wheels = a;
    }

    public void changeyear (int a) {
            year = a;
    }

    public String GetCar() {
            return Car;
    }

    public int getWheels() {
            return wheels;
    }

    public int getYear() {
            return year;
    }

    public void viewAll(){

        System.out.println("The car you drive is: " + Car);
        System.out.println("There are " + wheels + " in the car ");
        System.out.println("The year of the make of the car is: " + year);
    }


}
