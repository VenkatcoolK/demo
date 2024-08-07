import java.util.ArrayList;

import java.util.Scanner;

public class MyOperations {
    final int c = 25;
     static int i = 15;
    public static void main(String[] args) {

//        Computer obj = new Computer();
//        Computer obj1 = new Computer();
//
//        int r1 = obj.add(5,6,3);
//        obj.num=25;
////        System.out.println(r1);
//        System.out.println(obj.num);
//        System.out.println(obj1.num);

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "venkat";
        s1.marks = 65;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kiran";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Harsh";
        s3.marks = 75;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);


        }








    }
}
