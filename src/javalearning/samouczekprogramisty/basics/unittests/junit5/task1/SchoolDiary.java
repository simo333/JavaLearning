package javalearning.samouczekprogramisty.basics.unittests.junit5.task1;

import java.util.*;

public class SchoolDiary {
    private final Map<String, Subject> subjectList = new HashMap<>();

    public Map<String, Subject> getSubjectList() {
        return subjectList;
    }

    public Subject getSubject(String maths) {
        if(subjectList.containsKey(maths))
            return subjectList.get(maths);
        throw new IllegalArgumentException("No such subject in the diary found.");
    }

    public void addSubject(String subjectName) {
        if(subjectList.containsKey(subjectName))
            throw new IllegalArgumentException("The diary already contains this subject.");
        subjectList.put(subjectName, new Subject(subjectName));
    }

    public void removeSubject(String maths) {
        if(!subjectList.containsKey(maths))
            throw new IllegalArgumentException("No such subject in the diary found.");
        subjectList.remove(maths);
    }

    public Double getTotalAverage() {
        return subjectList.values()
                .stream()
                .mapToDouble(Subject::getAverageGrade)
                .average()
                .orElseThrow();
    }
}
