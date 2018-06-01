/*This project will talk all about using Vector class in java
   A vaector can be said as an array which can change its size dynamically as we or the program wants*/


import java.util.Collections;
import java.util.Vector;

public class VectorToArray {
    public static  void main (String...args){
        int size=5;
   //creating a vector with size defined
    Vector vector=new Vector(size);
    //creating a vector with size and capacity in wwhich it can be increased
    Vector vector1=new Vector(size,5);
    //adding elements in vector
        for(int i=0;i<size+8;i++) { // for disturbing the vector size we add elements more than the size of array
            vector.add(i);
        }
        System.out.println(vector);
        System.out.println(vector.size()+" "+vector.capacity()); // capacity is increased since by default vector capacity increment is 10 so it will become 20 now
    //now we will add and elements of second vector vextor1
        for(int i=0;i<size+8;i++) {
            vector1.add(i);
        }
        System.out.println(vector1);
        System.out.println(vector1.size()+" "+vector1.capacity()); // here we have specified the increase capactiy of vector so it will increase to 15
        System.out.println("after adding elements to a specified index at 5");

        vector.add(1,20);
        vector.add(5,89);//index of a vector starts from 0;

        vector1.add(2,20);
        vector1.add(5,78);

        System.out.println("vector:");
        System.out.println(vector );
        System.out.println("vector1:");
        System.out.println(vector1);

        //adding all the elements of first vector to other vector using addAll function
        vector.addAll(vector1); //adding vector1 to vector
        System.out.println(vector);
        //add all elements of vector1 to vector by specific index
        vector.addAll(5,vector1);
        System.out.println(vector);

        //clearing all the values of vector
        vector.clear();
        System.out.println(vector);

        //cloning values of vecotr1 to vector
        vector=(Vector)vector1.clone();//returns object vector types so compatibility should be done
        System.out.println(vector);

        //Tests if the specified object is a component in this vector.
        System.out.println(vector.contains(20)); //returns true because 20 is in vector

        //tests of all elements of vector1 is in vector
        System.out.println(vector.containsAll(vector1)); //returns true because all elements of vector1 is in vector

        //copying elements of vector to a specified array
        Integer[] array=new Integer[15];
       vector.copyInto(array);
       for(Integer num:array) {
           System.out.print(num + " "); //display the array into which the value si copied
       }
            System.out.println();


           //Returns the component at the specified index.

           int index=(int)vector.elementAt(10);
           System.out.println(index);

       // Compares the specified Object with this vector for equality with another vector
        System.out.println(vector.equals(vector1));     //returns true because vecotr equals to vector1


        //Returns the first component and the last element (the item at index 0 and last) of this vector.
        System.out.println(vector.firstElement()+" "+vector.lastElement());

        //Returns the element at the specified position in this vector.
        System.out.println(vector.get(1)+" "+vector.get(10));

        //Returns the hash code value for this vector.
        System.out.println(vector.hashCode());

        Vector vecretain=new Vector(20);
        vecretain.add(5);
        vecretain.add(3);
        vecretain.add(2);

        System.out.println("Calling retainAll()");
        vector.retainAll(vecretain);

        // let us print all the elements available in vector
        System.out.println("Numbers after removal :- ");



        for (Object number : vector) {
            System.out.println("Number = " + number);//only 2,3,5 are left.. all are removed from vector

        }
        System.out.println(vector.size());

        //Returns an array containing all of the elements in this vector in the correct order.

        vector.toArray(array);
        for (Integer num:array
             ) {
            System.out.print(num+" ");

        }
        System.out.println();

        //Returns a string representation of this vector, containing the String representation of each element.
        String str=null;
        System.out.println(vector.toString());




    }
}
