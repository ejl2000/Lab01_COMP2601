/**
 * The {@code IPhone} class extends the {@code IDevice} class to represent an iPhone device.
 * It includes additional properties such as minutes remaining on the phone plan and the carrier.
 *
 * @author Emma Lee, Chris H.
 * @version 2024
 */
public class IPhone extends IDevice
{
    private double minutesRemaining;
    private String carrier;

    private static final int MINIMUM_MINUTES_REMAINING = 0;

    /**
     * Constructs an {@code IPhone} with the specified parameters.
     *
     * @param minutesRemaining the number of minutes remaining on the phone plan
     * @param carrier the carrier of the phone
     */
    public IPhone(final double minutesRemaining,
                  final String carrier)
    {
        super("talking");
        this.minutesRemaining = minutesRemaining;
        this.carrier = carrier;
    }

    /**
     * Returns the number of minutes remaining on the phone plan.
     *
     * @return the number of minutes remaining on the phone plan
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * Sets the number of minutes remaining on the phone plan.
     *
     * @param minutesRemaining the number of minutes to set
     */
    public void setMinutesRemaining(final double minutesRemaining)
    {
        this.minutesRemaining = minutesRemaining;
    }

    /**
     * Returns the carrier of the phone.
     *
     * @return the carrier of the phone
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the carrier of the phone.
     *
     * @param carrier the carrier to set
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints the details of the {@code IPhone} object.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the {@code IPhone} object, including its specific properties.
     *
     * @return a String representation of the object
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Minutes Remaining: " + minutesRemaining + ", Carrier: " + carrier;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two {@code IPhone} objects are considered equal if they have the same number of minutes remaining on their phone plans.
     *
     * @param obj the reference object with which to compare
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IPhone iPhone = (IPhone) obj;

        return Double.compare(iPhone.minutesRemaining, minutesRemaining) == MINIMUM_MINUTES_REMAINING;
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the minutes remaining on the phone plan.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(minutesRemaining);
    }
}
