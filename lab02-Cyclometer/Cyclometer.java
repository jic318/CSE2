//Lab-Cyclometer
//jic318
//define a class
public class Cyclometer {
    //add main method
    public static void main (String[] args) {
        int secsTrip1=480; //seconds Trip 1 takes
        int secsTrip2=3220; //seconds Trip 2 takes
        int countsTrip1=1561; //number of rotations of Trip 1
        int countsTrip2=9037; //number of rotations of Trip2
        double wheelDiameter=27.0,
        PI=3.14159, //constant number of π
        feetPerMile=5280, //factor: 1 mile= 5280 feet
        inchesPerFoot=12, //factor: 1 foot= 12 inches
        secondsPerMinutes=60; //factor: 1 minute=60 seconds
        double distanceTrip1, distanceTrip2, totaldistance;
        
        System.out.println("Trip 1 took"+(secsTrip1/secondsPerMinutes)+" minutes and had "+countsTrip1+" counts. ");
        System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinutes)+" minutes and had "+countsTrip2+" counts. ");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //distance counted is in inches
        //for each count, a rotation of wheel travels the diameter in inches time PI
        distanceTrip1/=inchesPerFoot*feetPerMile; //count distanceTrip1 in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //count distanceTrip2 in miles
        totaldistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles ");
        System.out.println("Trip 2 was "+distanceTrip2+" miles ");
        System.out.println("The totaldistance was "+totaldistance+" miles ");
        
    }//end of method
}//end of class