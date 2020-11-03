public class CourseDBElement implements Comparable {

    String courseId;
    int CRN;
    int numberOfCredits;
    String roomNumber;
    String instructorName;

    public CourseDBElement() {
    }

    public CourseDBElement(String courseId, int CRN, int numberOfCredits, String roomNumber, String instructorName) {
        this.courseId = courseId;
        this.CRN = CRN;
        this.numberOfCredits = numberOfCredits;
        this.roomNumber = roomNumber;
        this.instructorName = instructorName;
    }


    public int getCRN() {
        return CRN;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public int compareTo(CourseDBElement element) {
        if (this.CRN > element.CRN)
            return 1;
        else if (this.CRN < element.CRN)
            return -1;
        else
            return 0;
    }

    @Override
    public int hashCode() {
        String crn = Integer.toString(CRN);
        int hashCode = crn.hashCode();
        return hashCode;
    }

    public void setCRN(int crn) {
        this.CRN = crn;
    }
}
