//homework 02
//jic318
//define a class
public class Arithmetic {
    //define a method
    public static void main(String[] args){
        //Begin
        int nSocks=3; //Number of pairs of socks
        int nGlasses=6; //Number of glasses
        int nEnvelopes=1; //Number of boxes of envelopes
        double socksCost$=2.58, //cost per pair of socks
        glassesCost$=2.29, //cost per glass
        envelopeCost$=3.25, //cost per box of envelopes
        taxesCost$=0.06; //taxes rate
        //Expected outputs
        double totalcostSocks, totalcostGlasses, totalcostEnvelopes, totalcostTaxes, totalcostBeforeTaxes, totalcostPaid;
        //Calculation
        totalcostSocks=nSocks*socksCost$; //The total cost of socks
        System.out.println("Total cost of socks is "+totalcostSocks+" dollars."); 
        totalcostGlasses=nGlasses*glassesCost$; //The total cost of drinking glasses
        System.out.println("Total cost of glasses is "+totalcostGlasses+" dollars.");
        totalcostEnvelopes=nEnvelopes*envelopeCost$; //The total cost of boxes of envelopes
        System.out.println("Total cost of envelopes is "+totalcostEnvelopes+" dollars.");
        totalcostTaxes=(totalcostSocks+totalcostGlasses+totalcostEnvelopes)*taxesCost$; //The total cost of taxes
        System.out.println("Total cost of taxes is "+totalcostTaxes+" dollars.");
        totalcostBeforeTaxes=totalcostSocks+totalcostGlasses+totalcostEnvelopes; //The total cost before counting the taxes
        System.out.println("Total cost before counting the taxes is "+totalcostBeforeTaxes+" dollars.");
        totalcostPaid=totalcostBeforeTaxes+totalcostTaxes; //The total cost that should be paid
        System.out.println("Total cost that is paid is "+totalcostPaid+" dollars.");
    }
}