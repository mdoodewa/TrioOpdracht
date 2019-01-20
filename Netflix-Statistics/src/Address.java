public class Address{
    private String street;
    private String houseNr;
    private String houseAnnex;
    private String zipCode;
    private String city;

    public Address(String street, String houseNr, String houseAnnex, String zipCode, String city) {
        this.street = street;
        this.houseNr = houseNr;
        this.houseAnnex = houseAnnex;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getHouseNr() {
        return this.houseNr;
    }

    public String getHouseAnnex() {
        return this.houseAnnex;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCity() {
        return this.city;
    }

}