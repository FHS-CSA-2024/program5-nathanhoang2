//import stuff here?
class program5{
    public static void main(String[] args){
        String vehicle;
        int miles = 0;
        int gallons = 0;
        double milesGallon = 0.0;
        milesGallon = (double)miles/gallons;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println();
        
        vehicle = "Royale";
        miles = 286;
        gallons = 9;
        milesGallon = (double)miles/gallons;
        milesGallon = milesGallon * 10;
        milesGallon = milesGallon + 0.5;
        milesGallon = (int) milesGallon;
        milesGallon = milesGallon/10.0;
        System.out.println(vehicle+" averaged "+milesGallon+" m/g");
        System.out.println();
        
        vehicle = "Koopa King";
        miles = 412;
        gallons = 40;
        milesGallon = (double)miles/gallons;
        milesGallon = milesGallon * 10;
        milesGallon = milesGallon + 0.5;
        milesGallon = (int) milesGallon;
        milesGallon = milesGallon/10.0;
        System.out.println(vehicle+" averaged "+milesGallon+" m/g");
        System.out.println();
        
        vehicle = "Pipe Frame";
        miles = 361;
        gallons = 18;
        milesGallon = (double)miles/gallons;
        milesGallon = milesGallon * 10;
        milesGallon = milesGallon + 0.5;
        milesGallon = (int) milesGallon;
        milesGallon = milesGallon/10.0;
        System.out.println(vehicle+" averaged "+milesGallon+" m/g");
        System.out.println();
        
        vehicle = "Badwagon";
        miles = 161;
        gallons = 11;
        milesGallon = (double)miles/gallons;
        milesGallon = milesGallon * 10;
        milesGallon = milesGallon + 0.5;
        milesGallon = (int) milesGallon;
        milesGallon = milesGallon/10.0;
        System.out.println(vehicle+" averaged "+milesGallon+" m/g");
    }
}
//Your code here

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g

*/
