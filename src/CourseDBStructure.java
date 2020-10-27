import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class CourseDBStructure implements CourseDBStructureInterface {

    public LinkedList<CourseDBElement>[] hashTable;


    public CourseDBStructure(int numberOfCourses) {
        hashTable = new LinkedList[numberOfCourses];
    }

    public CourseDBStructure(String string, int hashTableSize){
        hashTable = new LinkedList[hashTableSize];
    }

    public int getTableSize() {
        return hashTable.length;
    }

    public void add(CourseDBElement cde) {
        int hashCode = cde.hashCode();
        int index = hashCode%hashTable.length;

        if (hashTable[index] == null){
            hashTable[index] = new LinkedList<CourseDBElement>();
            hashTable[index].add(cde);
        }

        else if (hashTable[index] != null){
            hashTable[index].add(cde);
        }
    }

    @Override
    public CourseDBElement get(int crn) throws IOException {
        String stringCRN = Integer.toString(crn);
        int hashCode = stringCRN.hashCode();
        int index = hashCode%hashTable.length;

        if (hashTable[index].contains(crn)){
            return hashTable[index].get(hashTable[index].indexOf(crn));
        }
        else {
            throw new IOException();
        }
    }

}
