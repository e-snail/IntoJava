package into.java;

import into.java.memory.Memory;
import into.java.memory.MemorySizeOf;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;
import sun.misc.Unsafe;

public class MainEntry {

    final Memory memoryObj1 = new Memory();
    final Memory memoryObj2 = new Memory();

    MainEntry() {}


    void printMemoryLayout() {
        //Memory对象的内存布局

        System.out.println("--Memory对象 计算hashCode之前的内存布局");
        System.out.println(ClassLayout.parseInstance(memoryObj1).toPrintable());

        System.out.println("--Memory对象的hashCode=" + memoryObj1.hashCode() + "\n");

        System.out.println("--Memory对象 计算hashCode之后的内存布局");
        System.out.println(ClassLayout.parseInstance(memoryObj1).toPrintable());

        //Memory对象作为锁的情况下的内存布局
        synchronized (memoryObj2) {
            System.out.println("--memoryObj2的hashCode=" + memoryObj2.hashCode());
            System.out.println(ClassLayout.parseInstance(memoryObj2).toPrintable());
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("sizeof Object \t\t= " + MemorySizeOf.sizeOf(object));

        EmptyClass emptyClass = new EmptyClass();
        System.out.println("sizeof EmptyClass \t= " + MemorySizeOf.sizeOf(emptyClass));

        byte var_byte = 0;
        System.out.println("sizeof byte \t\t= " + MemorySizeOf.sizeOf(var_byte));

        boolean var_boolean = false;
        System.out.println("sizeof boolean \t\t= " + MemorySizeOf.sizeOf(var_boolean));

        int var_int = 0;
        System.out.println("sizeof int \t\t= " + MemorySizeOf.sizeOf(var_int));

        Integer var_Integer = new Integer(1);
        System.out.println("sizeof Integer \t\t= " + MemorySizeOf.sizeOf(var_Integer));

        long var_long = 0L;
        System.out.println("sizeof long \t\t= " + MemorySizeOf.sizeOf(var_long));

        int[] var_array = {};
        System.out.println("sizeof array \t\t= " + MemorySizeOf.sizeOf(var_array));

        String var_string_empty = "";
        System.out.println("sizeof var_string_empty \t= " + MemorySizeOf.sizeOf(var_string_empty));

        String var_string_abc = "abc";
        System.out.println("sizeof var_string_abc \t\t= " + MemorySizeOf.sizeOf(var_string_abc));

        MainEntry mainEntry = new MainEntry();
        System.out.println("sizeOf(new MainEntry()) \t= " + MemorySizeOf.sizeOf(mainEntry));

        //====================================================================
        //   对象的markword结构
        //====================================================================
        System.out.println("虚拟机内存信息如下:");
        System.out.println(VM.current().details());
        System.out.println("\n");

        System.out.println("内存对象信息如下:");
        mainEntry.printMemoryLayout();

        Unsafe unsafe = Unsafe.getUnsafe();
        Object ob;

    }
}
