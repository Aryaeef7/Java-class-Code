package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subject=new LinkedList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Jira");
        subject.add("Git");
        subject.add("Java");

        LinkedList<String>futureSubject=new LinkedList<>();

        futureSubject.add("Selenium");
        futureSubject.add("Testing");
        futureSubject.add("Cucumber");
        futureSubject.add("SQL");
        futureSubject.add("ApIS");
        futureSubject.add("Jenkins");

        LinkedList<String>allSubjects=new LinkedList<>();
        allSubjects.addAll(subject);
        allSubjects.addAll(futureSubject);
        System.out.println(allSubjects);

        LinkedList<String>subjectILike=new LinkedList<>();
        subjectILike.add("Java");
        System.out.println("SDLC");
        subject.add("SQL");
        System.out.println(subjectILike);

        allSubjects.removeAll(subjectILike);


    }
}
