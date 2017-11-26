package com.iot.mybatis.po;

import java.util.List;

public class Classes {

    //定义实体类的属性，与class表中的字段对应
    private int id;            //id===>c_id
    private String name;    //name===>c_name

    /**
     * class表中有一个teacher_id字段，所以在Classes类中定义一个teacher属性，
     * 用于维护teacher和class之间的一对一关系，通过这个teacher属性就可以知道这个班级是由哪个老师负责的
     */
    private Teacher teacher;

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    private List<student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @Override
    public String toString() {

        if (students!=null){
        for (int i = 0; i <students.size() ; i++) {
                System.out.println(students.get(i));
            }
        System.out.println();
        for (student s:students) {
                System.out.println(s);
            }
        }
        return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher
                + ", students=" + students + "]";
    }
}
