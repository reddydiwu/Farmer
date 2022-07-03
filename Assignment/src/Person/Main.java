package Person;

import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("Diwakar Reddy",(long) 1222233344);

        Farmer f1 = new Farmer("Kiran", (long) 123456781);
        Farmer f2 = new Farmer("Nagi", (long) 123456782);
        Farmer f3 = new Farmer("Basha", (long) 123456783);
        Farmer f4 = new Farmer("Vineeth", (long) 123456785);
        Farmer f5 = new Farmer("Prathap", (long) 123456786);
        Farmer f6 = new Farmer("Pavan", (long) 123456788);
        try {
            wholeSaler1.addFarmer(f1);
            wholeSaler1.addFarmer(f2);
            wholeSaler1.addFarmer(f3);
            wholeSaler1.addFarmer(f4);
            wholeSaler1.addFarmer(f5);
            wholeSaler1.addFarmer(f6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }
        
        System.out.println();
        System.out.println("List of Farmers");
        System.out.println("-----------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n name: %s,  contact number: %s", f.getName(), f.getContact());
        }

    }

}
