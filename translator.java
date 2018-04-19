/*
   Name: bishoy Hanna
   Date :
   Assignment 4
   Number of classes: 7
   this class is the abstract base class and it has two derived class which are the nouns
   and the phrase

 */
import java.io.IOException;
import java.util.Scanner;
public abstract class translator {

    // the data member of the class
    protected String translated_string;
     /*
        Name :  constructor
        Input: nothing
        Output: nothing
     */

    public translator()
    {
        // setting the data member to null
        translated_string = null;
    }
     /*
        Name : constructor with argument
        Input: nothing
        Output: nothing
     */
     public translator(String temp_translated)
    {
        // setting translated string to temp translated which is the argument
        translated_string = temp_translated;

    }
     /*
        Name : get word
        Input: nothing
        Output: nothing
     */
    public String get_word() {

          // returning the value of string
        return translated_string;
    }
     /*
        Name : display_word
        Input: nothing
        Output: nothing
     */
     public void display_word()

    {

        // printing the translated string
        System.out.println(translated_string);

    }


}
