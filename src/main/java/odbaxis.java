import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.TypeMapper;

import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbaxis extends Structure {
    /**
     * dummy
     */
    public short dummy;
    /**
     * axis number
     */
    public short type;
    /**
     * data value
     */
    public NativeLong[] data = new NativeLong[32];

    public odbaxis() {
        super();
    }

    public odbaxis(short dummy, short type, NativeLong[] data) {
        super();
        this.dummy = dummy;
        this.type = type;
        if ((data.length != this.data.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.data = data;
    }

    public odbaxis(Pointer peer) {
        super((TypeMapper) peer);
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("dummy", "type", "data");
    }

    public static class ByReference extends odbaxis implements Structure.ByReference {

    }

    public static class ByValue extends odbaxis implements Structure.ByValue {

    }
}
