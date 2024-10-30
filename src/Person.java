public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String password;
    private String email;

    public Person(String name, String address, String phoneNumber, String password, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password; 
        this.email = email;
    }

    public Person() {
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getPassword() {
        return password; 
    }

    public void setPassword(String password) {
        this.password = password; 
    }

    public String getAddress() { 
        return address; 
    }

    public void setAddress(String address) { 
        this.address = address; 
    }

    public String getPhoneNumber() { 
        return phoneNumber; 
    }

    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; 
    }
    public String getEmail(){
        return email;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}
