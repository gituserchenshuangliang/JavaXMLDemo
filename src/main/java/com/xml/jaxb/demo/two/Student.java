package com.xml.jaxb.demo.two;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "age")
    private int age;
    @XmlElement(name = "comment")
    private String comment;
    @XmlAttribute(name = "addr")
    private String addr;
    @XmlAttribute(name = "studentID")
    private String studentID;
    @XmlAttribute(name = "sex")
    private String sex;
    @XmlAttribute(name = "classID")
    private String classID;
    @XmlAttribute(name = "lesson")
    private String lesson;
    @XmlAttribute(name = "friend")
    private String friend;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassID() {
        return this.classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getLesson() {
        return this.lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getFriend() {
        return this.friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String toString() {
        return

        "Student [name=" + this.name + ", age=" + this.age + ", comment="
                + this.comment + ", addr=" + this.addr + ", studentID="
                + this.studentID + ", sex=" + this.sex + ", classID="
                + this.classID + ", lesson=" + this.lesson + ", friend="
                + this.friend + "]";
    }
}
