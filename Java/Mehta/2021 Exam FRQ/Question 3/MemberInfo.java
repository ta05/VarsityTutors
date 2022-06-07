public class MemberInfo {

    public String name;
    private int gradYear;
    private boolean hasGoodStanding;

    /** Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     * */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    /** Returns the graduation year of the club member. */
    public int gradYear() {
        return gradYear;
    }

    /** Returns true if the member is in good stading and false otherwise. */
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }
}