package fr.epsi.planning.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudentCourse {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Student> students;

    @OneToOne
    private Course course;

    private Long startDate;

    private Long endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }


    public StudentCourse() {
    }

    public StudentCourse(List<Student> students, Course course, Long startDate, Long endDate) {
        this.students = students;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
