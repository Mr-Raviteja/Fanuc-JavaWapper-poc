import com.sun.jna.Library;

public interface NativeExample extends Library {

    short cnc_allclibhndl3(String ipAddress, int port, int timeout, int[] handlerName);

    short cnc_absolute2(int hndl, int axis, int len, odbaxis64.ByReference ptrl);

}