package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type)
    {
        Car car=new Car(name,modelName,type);
        return car;
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type)
    {
        Bike bike=new Bike(name,modelName,type);
        return bike;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
        String firstType=((AbstractManufacturer)first).getType();
        String secondType=((AbstractManufacturer)second).getType();
        if(firstType!="sports" || secondType!="sports")
        {
            return -1;
        }
        else
        {
            if(first.maxSpeed("Sports")==second.maxSpeed("Sports"))
            {
                return 0;
            }
            else if (first.maxSpeed("Sports")>second.maxSpeed("Sports"))
            {
                return first.maxSpeed("Sports");
            }
            else if (first.maxSpeed("Sports")<second.maxSpeed("Sports"))
            {
                return second.maxSpeed("Sports");
            }
            else {
                return -1;
            }
        }
    }
}
