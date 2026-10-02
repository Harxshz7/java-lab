public class GettersAndSetters {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        GettersAndSetters user = new GettersAndSetters();
        user.setUsername("Leena");
        user.setAge(22);
        System.out.println(user.getUsername() + " is " + user.getAge());
    }
}
