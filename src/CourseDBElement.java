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
        return 0;
    }

    @Override
    public int compareTo(CourseDBElement element) {
        return 0;
    }

    @Override
    public int hashCode() {
        String crn = Integer.toString(CRN);
        int hashCode = crn.hashCode();
        return hashCode;
    }

}
