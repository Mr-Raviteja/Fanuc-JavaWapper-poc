import com.sun.jna.Native;

public class Myclient {
    private static final int EW_OK = 0;

    public static void main(String[] args) {
        //System.out.println("Hello World");
        String libspath = System.getProperty("java.library.path");
        System.out.println(libspath);


        NativeExample INSTANCE1 = (NativeExample) Native.loadLibrary(
                "Fwlib64", NativeExample.class);

        NativeClass Focus1 = (NativeClass) Native.loadLibrary(
                "HelloworldLib", NativeClass.class);

        Focus1.Java_CMyClass_myMethod();

        // Pointer pointer = new Memory(200);

        //Pointer sh=pointer.share(6);
        //ShortBuffer sb = ShortBuffer.allocate(100);

        int[] prtl = new int[100];
        odbaxis64.ByReference ref = null;
        short ret = INSTANCE1.cnc_allclibhndl3("123.0.9.0", 8193, 60, prtl);
        if (ret == Myclient.EW_OK)
            System.out.println("successfully Connected to CNC with respose: " + ret);
        else
            System.out.println("Unable to connect CNC with response :" + ret);

        short res = INSTANCE1.cnc_absolute2(12, -1, 10, ref);
        if (res == Myclient.EW_OK)
            System.out.println("successfully Connected to CNC with respose: " + res);
        else
            System.out.println("Unable to connect CNC with response :" + res);

        // System.out.println("bye");


    }
}

