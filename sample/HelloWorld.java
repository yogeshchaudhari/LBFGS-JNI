/* HelloWorld.java */

public class HelloWorld {
    native void sampleHelloFromC(); /* (1) */
    static public void main(String argv[]) {
        //System.loadLibrary("ctest"); /* (2) */
        System.loadLibrary("sample"); /* (2) */
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sampleHelloFromC(); /* (3) */
    }
}
