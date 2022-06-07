import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    /** Adds new club members to memberList, as described in part (a)
     * Precondition: names is a non-empty array.
     * */
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    /** Removed members who have graduated and returns a list of members who have graduated
     * and are in good standing, as described in part (b)
     * */
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> removedMembers = new ArrayList<MemberInfo>();
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).gradYear() <= year) {
                MemberInfo removedMember = memberList.remove(i);
                if (removedMember.inGoodStanding()) {
                    removedMembers.add(removedMember);
                }
                i--;
            }
        }
        return removedMembers;
    }
}