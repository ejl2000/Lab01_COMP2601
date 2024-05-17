/**
 * The IPad class extends the IDevice lass to represent an iPad device.
 * It includes additional properties such as whether it has a case and the operating system version.
 *
 * @author Emma Lee, Chris Helmhold
 * @version 2024
 */
public class IPad extends IDevice
{
    private boolean hasCase;
    private String osVersion;

    /**
     * Constructs an IPad with the specified parameters.
     *
     * @param hasCase   indicates whether the iPad has a case
     * @param osVersion the operating system version of the iPad
     */
    public IPad(final boolean hasCase,
                final String osVersion)
    {
        super("learning");
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Returns whether the iPad has a case.
     *
     * @return true if the iPad has a case; false otherwise
     */
    public boolean isHasCase()
    {
        return hasCase;
    }

    /**
     * Sets whether the iPad has a case.
     *
     * @param hasCase true to indicate the iPad has a case; false otherwise
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Returns the operating system version of the iPad.
     *
     * @return the operating system version of the iPad
     */
    public String getOsVersion()
    {
        return osVersion;
    }

    /**
     * Sets the operating system version of the iPad.
     *
     * @param osVersion the operating system version to set
     */
    public void setOsVersion(final String osVersion)
    {
        this.osVersion = osVersion;
    }

    /**
     * Prints the details of the IPad object.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the IPad object, including its specific properties.
     *
     * @return a String representation of the object
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Has Case: " + hasCase + ", OS Version: " + osVersion;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two IPad objects are considered equal if they have the same operating system version.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals (final Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IPad iPad = (IPad) obj;

        return osVersion.equals(iPad.osVersion);
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the operating system version.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return osVersion.hashCode();
    }
}
