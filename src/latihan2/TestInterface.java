/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author SMK TELKOM
 */
public class TestInterface {
    public static void main (String[]args){
        //make 2 object
        Line a = new Line(1,2,3,4);
        Line b = new Line(4,3,2,1);
        //length object 1 and 2
        System.out.println("Length a = "+a.getLength());
        System.out.println("Length b = "+b.getLength());
        System.out.println("");
        //
        System.out.println("aLen > bLen  = "+a.isGreater(a,b));
        System.out.println("aLen < bLen  = "+a.isLess(a,b));
        System.out.println("aLen == bLen = "+a.isEqual(a,b));
    }
}
