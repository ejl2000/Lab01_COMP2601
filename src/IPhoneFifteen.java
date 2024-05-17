/**
 * The {@code IPhoneFifteen} class extends the {@code IPhone} class to add more specific features.
 * It represents an iPhone with additional properties such as a high-resolution camera and memory size.
 *
 * @author Emma Lee, Chris H.
 * @version 2024
 */
public class IPhoneFifteen extends IPhone
{
    private boolean highResCamera;
    private int memoryGB;

    private static final int HASHCODE_INTEGER = 31;

    /**
     * Constructs an {@code IPhoneFifteen} with the specified parameters.
     *
     * @param minutesRemaining the number of minutes remaining on the phone plan
     * @param carrier the carrier of the phone
     * @param highResCamera indicates if the phone has a high-resolution camera
     * @param memoryGB the memory size of the phone in gigabytes
     */
    public IPhoneFifteen(final double minutesRemaining,
                         final String carrier,
                         final boolean highResCamera,
                         final int memoryGB)
    {
        super(minutesRemaining, carrier);
        this.highResCamera = highResCamera;
        this.memoryGB = memoryGB;
    }

    /**
     * Returns whether the phone has a high-resolution camera.
     *
     * @return {@code true} if the phone has a high-resolution camera; {@code false} otherwise
     */
    public boolean isHighResCamera()
    {
        return highResCamera;
    }

    /**
     * Sets whether the phone has a high-resolution camera.
     *
     * @param highResCamera {@code true} to indicate the phone has a high-resolution camera; {@code false} otherwise
     */
    public void setHighResCamera(final boolean highResCamera)
    {
        this.highResCamera = highResCamera;
    }

    /**
     * Returns the memory size of the phone in gigabytes.
     *
     * @return the memory size of the phone in gigabytes
     */
    public int getMemoryGB()
    {
        return memoryGB;
    }

    /**
     * Sets the memory size of the phone in gigabytes.
     *
     * @param memoryGB the memory size to set
     */
    public void setMemoryGB(final int memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    /**
     * Prints the details of the {@code IPhoneFifteen} object.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Returns a string representation of the {@code IPhoneFifteen} object, including its specific properties.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString()
    {
        return super.toString() + ", High-Resolution Camera: " + highResCamera + ", Memory: " + memoryGB + "GB";
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two {@code IPhoneFifteen} objects are considered equal if they have the same amount of minutes
     * remaining on their phone plan and the same value for the high-resolution camera.
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        IPhoneFifteen that = (IPhoneFifteen) obj;
        return highResCamera == that.highResCamera;
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the hash code of the parent class and the high-resolution camera property.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return HASHCODE_INTEGER * super.hashCode() + Boolean.hashCode(highResCamera);
    }
}
