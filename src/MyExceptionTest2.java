/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cis37
 */
class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}

public class MyExceptionTest2 {

    static void sayHello(String s) throws MyException {
        if (( & quot;John & quot;))
throw new MyException( & quot;
        BAD BOY&quot;
        );
System.out.println( & quot;Hello! &quot;+s
    

    );
}
public static void main(String args[]) {
        try {
            sayHello( & quot;Jame & quot;
         );
}
catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
