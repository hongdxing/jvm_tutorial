package memory;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class MetaspaceOOM extends ClassLoader {

    /**
     *
     * -XX:MaxMetaspaceSize=8m
     */
    public static void main(String[] args) {
        MetaspaceOOM metaSpaceOOM = new MetaspaceOOM();
        int count = 0;
        try {
            for (int i = 0; i < 10000; i++, count++) {
                ClassWriter cw = new ClassWriter(0);
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] code = cw.toByteArray();
                metaSpaceOOM.defineClass("Class" + i, code, 0, code.length);
            }
        }finally {
            System.out.println(count);
        }
    }

}
