/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Mayank", 26));
        queue.enqueue(new Student("Aditi", 27));
        queue.enqueue(new Student("Palak", 65));
        queue.enqueue(new Student("Suraj", 1));
        queue.enqueue(new Student("Vishal", 10));
        queue.enqueue(new Student("Aman", 76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}