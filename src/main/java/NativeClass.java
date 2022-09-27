import com.sun.jna.Library;

public interface NativeClass extends Library {

//    static
//    {
//        System.loadLibrary("HelloworldLib");
//    }
    // private static final NativeClass INSTANCE = new NativeClass();

    void Java_CMyClass_myMethod();

//    public static final NativeClass getInstance() {
//        return INSTANCE;
//    }


}