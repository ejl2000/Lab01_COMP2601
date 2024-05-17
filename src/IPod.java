/**
 * The IPod class extends the IDevice class to represent an iPod device.
 * It includes additional properties such as the number of songs stored and the maximum volume.
 *
 * @author Emma Lee, Chris Helmhold
 * @version 2024
 */
public class IPod extends IDevice
{
    private int numberOfSongs;
    private double maxVolume;

    /**
     * Constructs an IPod with the specified parameters.
     *
     * @param numberOfSongs the number of songs stored on the iPod
     * @param maxVolume     the maximum volume of the iPod in decibels
     */
    public IPod (final int numberOfSongs,
                 final double maxVolume)
    {
        super("music");
        this.numberOfSongs = numberOfSongs;
        this.maxVolume = maxVolume;
    }

    /**
     * Returns the number of songs stored on the iPod.
     *
     * @return the number of songs stored
     */
    public int getNumberOfSongs()
    {
        return numberOfSongs;
    }

    /**
     * Sets the number of songs stored on the iPod.
     *
     * @param numberOfSongs the number of songs to set
     */
    public void setNumberOfSongs(final int numberOfSongs)
    {
        this.numberOfSongs = numberOfSongs;
    }

    /**
     * Returns the maximum volume of the iPod.
     *
     * @return the maximum volume of the iPod in decibels
     */
    public double getMaxVolume()
    {
        return maxVolume;
    }

    /**
     * Sets the maximum volume of the iPod.
     *
     * @param maxVolume the maximum volume to set in decibels
     */
    public void setMaxVolume(final double maxVolume)
    {
        this.maxVolume = maxVolume;
    }

    /**
     * Prints the details of the IPod object.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the IPod object, including its specific properties.
     *
     * @return a String representation of the object
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Number of Songs: " + numberOfSongs + ", Max Volume: " + maxVolume;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two IPod  objects are considered equal if they have the same number of songs stored.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IPod iPod = (IPod) obj;

        return numberOfSongs == iPod.numberOfSongs;
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the number of songs stored.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numberOfSongs);
    }
}
