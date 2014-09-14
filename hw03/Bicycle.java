//hw03
//jic318
//import
import java.util.Scanner;
//define a class 
public class Bicycle {
    //define a method
    public static void main(String[] args) {;
    //Begin
    Scanner myScanner;
    myScanner= new Scanner( System.in );
    System.out.println("Enter the number of seconds (an integer): ");
    int secsTrip=myScanner.nextInt();   //input the time of the trip
    System.out.println("Enter the number of counts (an integer): ");
    int countsTrip=myScanner.nextInt();    //input the rotations of the trip
    double wheelDiameter=27.0, //the diameter of the wheel
    PI=3.1415927, //constant of π
    feetPerMile=5280, //factor: 1 mile=5280 feet
    inchesPerFoot=12, //factor: 1 foot=12 inches
    secondsPerMinutes=60, //factor: 1 minutes= 60 seconds
    minutesPerHour=60; //factor: 1 hour=60 seconds
    double distance, time, averageMph;
    time=secsTrip/secondsPerMinutes; //counting the time in minutes
    distance=countsTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile; //counting the distance in miles
    averageMph=distance/time*minutesPerHour; //counting the average mph 
    System.out.println("The distance was "+distance+" miles, and took "+time+" minutes.");
    System.out.println("The average mph was "+averageMph+".");
    }
}