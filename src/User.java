public class User {

    String userName = "userName";
    String password = "password";
    String email = "email";
    String number = "number";
    String birth = "2000-01-01";
    String regdate = "2024-09-01";

    public static void main(String[] args) throws Exception {
        User user = new User();
        System.out.println("Hello, World!");
        User user2 = user.getter();
        System.out.println(user2.userName);
        System.out.println(user2.password);
        System.out.println(user2.email);
        System.out.println(user2.number);
        System.out.println(user2.birth);
        System.out.println(user2.regdate);
    }

    public void setter(
            String userName,
            String password,
            String email,
            String number,
            String birth,
            String regdate) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.number = number;
        this.birth = birth;
        this.regdate = regdate;
    }

    public User getter() {
        return this;
    }

}
