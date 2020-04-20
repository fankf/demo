package com.fan.sort;

import com.fan.cap1.bean.Student;
import com.fankf.Sort;
import com.fankf.bean.SortObject;
import com.fankf.bean.SortObjectList;

import java.util.List;

public class SortTest {


    public static void main(String[] args) {
        Student s1 = new Student("A1", "123");
        Student s2 = new Student("A2", "13");
        Student s3 = new Student("A3", "15");

        SortObject sortObject1 = new SortObject();
        sortObject1.setSortFiled(s1.getAge());
        sortObject1.setSortObject(s1);

        SortObject sortObject2 = new SortObject();
        sortObject2.setSortFiled(s2.getAge());
        sortObject2.setSortObject(s2);

        SortObject sortObject3 = new SortObject();
        sortObject3.setSortFiled(s3.getAge());
        sortObject3.setSortObject(s3);

        SortObjectList list = SortObjectList.instance();
        list.plusObjects(sortObject1);
        list.plusObjects(sortObject2);
        list.plusObjects(sortObject3);

        List<Student> sort = Sort.sort(list,Student.class);
        System.out.println(sort);
    }
}
