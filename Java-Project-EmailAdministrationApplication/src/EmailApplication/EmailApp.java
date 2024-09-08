package EmailApplication;

public class EmailApp {
    public static void main(String[] args) {
        Email eml = new Email ("Ayline", "Tabish");
        eml.setAlternateEmail("at@gmail.com");
        System.out.println(eml.getAlternateEmail());

    }
}
