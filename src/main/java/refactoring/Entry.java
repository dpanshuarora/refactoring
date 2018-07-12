package refactoring;

public class Entry {
    public static void main(String[] args) {

        Movie perksOfBeingAWallflower = new NewReleaseMovie("Perks");
        Movie meanGirls = new RegularMovie("Mean Girl");
        Rental one = new Rental(perksOfBeingAWallflower, 4);
        Rental two = new Rental(meanGirls, 3);

        Customer customer = new Customer("Deepanshu");
        customer.addRental(one);
        customer.addRental(two);

        System.out.print(customer.generateStatement());
    }
}
