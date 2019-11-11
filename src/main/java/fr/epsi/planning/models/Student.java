package fr.epsi.planning.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String identifier;

    @ManyToMany
    private List<StudentCourse> studentCourses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = firstName + "." + lastName;
    }

    public Student(String firstName, String lastName, String identifier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = identifier;
    }

    public Student(String firstName, String lastName, String identifier, List<StudentCourse> studentCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = identifier;
        this.studentCourses = studentCourses;
    }
}
