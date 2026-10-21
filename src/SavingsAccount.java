public class SavingsAccount extends BankAccount{
    private String ownerName;

    public SavingsAccount(String ownerName){
        super();
        this.ownerName = ownerName;
        System.out.println("Account Owner: " + ownerName + ".");
    }

    public String getOwnerName(){
        return ownerName;
    }
}
