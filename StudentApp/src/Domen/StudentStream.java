package Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> groups;


    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public void removeGroup(StudentGroup group) {
        groups.remove(group);
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Groups: " + groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

}
