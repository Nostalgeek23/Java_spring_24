package school.redrover.lecture9.users;

public class User {
    private String username;
    private String password;

//    private String fullName;
    private String firstName ;
    public String lastName;

    private boolean active;

    public User(String username){
//        if (username.equals("iphone")) {
//            throw new RuntimeException("Bad username");
//        }
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void setFullName(String fullName){
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public void setPassword(String password){
        if (password.length() < 8) {
            System.out.println("Password is too short");
        } else {
            this.password = password;
        }
    }

    public boolean isPasswordCorrect(String passwordAttempt) {
        return password.equals(passwordAttempt);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }











}
