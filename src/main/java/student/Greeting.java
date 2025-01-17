package student;

/**
 * The greeting class stores the locality ID, locality name, and a string format of
 * the greeting both ascii and unicode.
 * <p>
 * This class provides a way to encapsulate greeting information to make it easier to
 * add and modify greetings without changing code in other places.
 * </p>
 *
 * @author Lihan Zhou
 * @version SEMESTER_YEAR (Su2024 for Summer 24)
 *
 */
public class Greeting {
    /** The ID number of the locality.*/
    private final int localityId;

    /** The name of the locality (e.g., "Hawaii", "English", "China"). */
    private final String localityName;

    /** The Unicode version of the greeting word (e.g., "你好"). */
    private final String unicodeGreeting;

    /** The ASCII version of the greeting word (e.g., "Ni Hao"). */
    private final String asciiGreeting;

    /** The format string for how the greeting should be constructed. */
    private final String formatString;

    /** Default format string used when not specified. */
    private static final String DEFAULT_FORMAT = "%s, %s!";

    /**
     * Constructor that specifies all greeting properties.
     *
     * @param localityId the ID number of the locality
     * @param localityName the name of the locality
     * @param unicodeGreeting the Unicode version of the greeting
     * @param asciiGreeting the ASCII version of the greeting
     * @param formatString the format string for constructing the greeting
     */
    public Greeting(int localityId, String localityName,
                    String asciiGreeting, String unicodeGreeting, String formatString) {
        this.localityId = localityId;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatString = formatString;
    }

    /**
     * Constructor for simple greetings that use the same greeting for both ASCII and Unicode,
     * with default format string, 3 param greeting.
     *
     * @param localityId the ID number of the locality
     * @param localityName the name of the locality
     * @param greeting the greeting word to use for both ASCII and Unicode
     */
    public Greeting(int localityId, String localityName, String greeting) {
        this(localityId, localityName, greeting, greeting, DEFAULT_FORMAT);
    }

    /**
     * Constructor for simple greetings with just locality ID and name,
     * 2 param greeting.
     * Uses "Hello" as the default greeting.
     *
     * @param localityId the ID number of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityId, String localityName) {
        this(localityId, localityName, "Hello");
    }

    /**
     * get the localityID
     * @return the local id
     */
    public int getLocalityID() {
        return localityId;
    }

    /**
     * get the locality name
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * get the Unicode version of greeting
     * @return Unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * get the Ascii version of greeting
     * @return the Ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the format string with the wanted greeting inserted.
     *
     * @param asciiOnly whether to use ASCII version of greeting or unicode version
     * @return format string with greeting inserted
     */
    public String getFormatStr(boolean asciiOnly) {
        String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;
        return String.format(formatString, greeting, "%s");
    }

    /**
     * Gets the unicode format string.
     *
     * @return the raw format string
     */
    public String getFormatStr() {
        return formatString;
    }

    /**
     * for default format of generate String
     */
    private static final String TO_STRING_FORMAT =
            "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}";

    /**
     * Returns a string representation of the Greeting object.
     * @return String with locality ID, name, and both greeting versions
     */
    @Override
    public String toString(){
        return String.format(TO_STRING_FORMAT, localityId, localityName, asciiGreeting, unicodeGreeting);
    }



}
