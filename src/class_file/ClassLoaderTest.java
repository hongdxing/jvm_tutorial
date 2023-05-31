package class_file;

public class ClassLoaderTest {

    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("sun.net.spi.nameservice.dns.DNSNameService");
            System.out.printf("%s", aClass.getClassLoader());

        } catch (ClassNotFoundException ex) {
            System.out.printf(ex.getMessage());
        }
    }
}
