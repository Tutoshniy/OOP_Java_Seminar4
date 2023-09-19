package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int groupID;

    public StudentGroup(List<Student> group, int groupID) {
        this.group = group;
        this.groupID = groupID;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "Student group: " + groupID;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() == o.group.size()) {
            return 0;
        } else {
            if (group.size() < o.group.size()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
