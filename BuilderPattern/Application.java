package BuilderPattern;

public class Application {
    public static void main(String[] args)
    {
        User angelica = new User.UserBuilder()
                .firstName("Angelica Mae")
                .lastName("Manliguez")
                .email("angelica.manliguez@neu.edu.ph")
                .address("Quezon City")
                .phone("0922-3344-556")
                .age(21)
                .build();

        System.out.println("USER'S INFORMATION\n");
        System.out.println("First Name: " + angelica.firstName);
        System.out.println("Last Name: " + angelica.lastName);
        System.out.println("Email: " + angelica.email);
        System.out.println("Address: " + angelica.address);
        System.out.println("Phone: " + angelica.phone);
        System.out.println("Age: " + angelica.age);

        User carrenn = new User.UserBuilder()
                .lastName("Macapinlac")
                .age(25)
                .email("carrenn.macapinlac@neu.edu.ph")
                .firstName("Carrenn")
                .address("Quezon City")
                .phone("0998-8776-655")
                .build();

        System.out.println();
        System.out.println("First Name: " + carrenn.firstName);
        System.out.println("Last Name: " + carrenn.lastName);
        System.out.println("Email: " + carrenn.email);
        System.out.println("Address: " + carrenn.address);
        System.out.println("Phone: " + carrenn.phone);
        System.out.println("Age: " + carrenn.age);
    }
}
