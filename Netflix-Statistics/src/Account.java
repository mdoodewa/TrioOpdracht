public class Account {

    private int id;
    private String name;
    private Address address;

    public Account(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static Account createAccount(String name, Address address){
        //Send this data to the database, and get the id for this account
        int idFromDatabase = 0;
        return new Account(idFromDatabase, name, address);
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}