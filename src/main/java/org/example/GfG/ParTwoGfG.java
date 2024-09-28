/**
 * Created by:AIDA
 * Date : 7/25/2024
 * Time : 1:51 PM
 */
package org.example.GfG;
import java.io.*;
import java.util.UUID;

public class ParTwoGfG {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee em = new Employee();
        em.setId("12A");
        em.setName("Jack");

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\AIDA\\Desktop\\test.ser");
        ObjectOutputStream  objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(em);
        objectOut.close();
        fileOut.close();

        FileInputStream inPut = new FileInputStream("C:\\Users\\AIDA\\Desktop\\test.ser");
        ObjectInputStream objIn = new ObjectInputStream(inPut);
        Employee emp = (Employee) objIn.readObject();
        System.out.println(emp.getName());
        objIn.close();
        inPut.close();
    }
}
