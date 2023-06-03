package loading;

public class HelloWorld{

    public static void main(String[] args) {
        try {
            ClassLoader classLoader = String.class.getClassLoader();
            System.out.printf("%s\r\n", classLoader);
            classLoader = HelloWorld.class.getClassLoader();
            System.out.printf("%s", classLoader);
            //Class.forName("");
        }catch (Exception ex){
            System.out.printf(ex.getMessage());
        }

    }


}