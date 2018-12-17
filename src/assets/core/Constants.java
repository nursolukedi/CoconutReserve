package assets.core;

public class Constants {
    public static final int CINEMA = 0;
    public static final int TRANSPORTION = 1;
    public static final int HOTEL = 2;


    // PRIVATE //

    /**
     The caller references the constants using <tt>Consts.EMPTY_STRING</tt>,
     and so on. Thus, the caller should be prevented from constructing objects of
     this class, by declaring this private constructor.
     */
    private Constants(){
        //this prevents even the native class from
        //calling this ctor as well :
        throw new AssertionError();
    }
}


