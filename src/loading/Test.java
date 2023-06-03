package loading;

public class Test {
    public static void main(String[] args) {
        Test_1 test1 = Test_1.getInstance();

        System.out.println(Test_1.var1);
        System.out.println(Test_1.var2);
    }
}

class Test_1{
    public static int var1;
    public static Test_1 instance = new Test_1();
    public static int var2 = 1;



    Test_1(){
        var1 ++;
        var2 ++;
    }

    public static Test_1 getInstance() {return instance;}

}
