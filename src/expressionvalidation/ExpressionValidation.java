/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionvalidation;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author imdea
 */
public class ExpressionValidation {
public static void main(String args[]) {
        boolean flag =false;
        Stack<Character> input = new Stack<>();
        System.out.println("Enter your String to check:");
        Scanner scanner = new Scanner(System.in);
        String sinput = scanner.nextLine();
        char[] c = new char[15];
        c = sinput.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '{' || c[i] == '(' || c[i] == '[')
                input.push(c[i]);
            else if (c[i] == ']') {
                if (input.pop() == '[') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (c[i] == ')') {
                if (input.pop() == '(') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (c[i] == '}') {
                if (input.pop() == '{') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true)
            System.out.println("Brackets are valid");
        else
            System.out.println("Brackets are invalid");
        scanner.close();

    }

}