/**
 * The {@code IDevice} class represents an abstract parent class for various device types.
 * It defines the common behavior and properties that all devices share.
 *
 * @author Emma Lee, Chris Helmhold
 * @version 2024
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an {@code IDevice} with the specified purpose.
     *
     * @param purpose the purpose of the device
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of the device.
     *
     * @return the purpose of the device
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints the details of the device. This method must be implemented by subclasses.
     */
    public abstract void printDetails();

    /**
     * Returns a String representation of the device, including its purpose.
     *
     * @return a String representation of the device
     */
    @Override
    public String toString()
    {
        return "Purpose: " + purpose;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * This method must be implemented by subclasses to compare relevant fields.
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise
     */
    @Override
    public abstract boolean equals(final Object obj);

    /**
     * Returns a hash code value for the object. This method must be implemented
     * by subclasses to provide a consistent hash code based on relevant fields.
     *
     * @return a hash code value for this object
     */
    @Override
    public abstract int hashCode();
}
