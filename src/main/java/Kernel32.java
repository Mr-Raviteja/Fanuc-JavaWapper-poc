import com.sun.jna.win32.StdCallLibrary;

public interface Kernel32 extends StdCallLibrary {
    // FREQUENCY is expressed in hertz and ranges from 37 to 32767
    // DURATION is expressed in milliseconds
    boolean Beep(int FREQUENCY, int DURATION);

    void Sleep(int DURATION);
}