package class_file;

import java.io.*;

public class ClassFileParse {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\workspace\\jvm_tutorial\\src\\HelloWorld.class");
        //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        //System.out.printf("%s", dataInputStream.readUnsignedByte());
        int magicCode =  dataInputStream.readInt();
        System.out.printf("%s\n", Integer.toHexString(magicCode));
        System.out.printf("%s\n", Integer.toHexString(dataInputStream.readShort()));
        System.out.printf("%s\n", Integer.toHexString(dataInputStream.readShort()));
        System.out.printf("%s\n", Integer.toHexString(dataInputStream.readShort()));
        //System.out.printf("%c\n", 65);
    }
}
