package com.xml.jaxb.demo.two;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "class")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clazz {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "classroom")
    private String classroom;
    @XmlElement(name = "teacher")
    private Teacher teacher;
    @XmlElement(name = "student")
    private List<Student> list = new ArrayList();

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.list.add(student);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassroom() {
        return this.classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getList() {
        return this.list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public String toString() {
        return "Clazz [id=" + this.id + ", classRoom=" + this.classroom
                + ", teacher=" + this.teacher + ", list=" + this.list + "]";
    }
}
