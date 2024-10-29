public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String password;

    // Constructor with parameters
    public Person(String name, String address, String phoneNumber, String password) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password; // Store password
    }

    // Default constructor
    public Person() {
    }

    // Getters and Setters
    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getPassword() {
        return password; // Password getter
    }

    public void setPassword(String password) {
        this.password = password; // Password setter
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

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}
