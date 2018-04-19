import java.io.IOException;

/*
   Name: Bishoy Hanna
   Date: 3/3/2016
   Assignment4
   number of classes: 7

  this is the phrase class which is responsible for translating the phrases, and it is one of
   the derived class
 */
public class phrases extends translator {
    String phrase;
     /*
        Name : constructor
        Input: nothing
        Output: nothing
     */

        public phrases()
    {
        // setting the phrase to null
        phrase = null;
    }
     /*
        Name : constructor with argument
        Input: string string
        Output: nothing
     */
    public phrases(String phrase2, String translation)
    {
        // calling the super constructor of the abstract base class
        super(translation);

        // setting the phrase to phrase2
        phrase = phrase2;
    }
     /*
        Name : get_word
        Input: nothing
        Output: nothing
     */
    public String get_word() {


        return phrase;
    }
     /*
        Name : display word
        Input: nothing
        Output: nothing
     */
    public void display_word()
    {
        System.out.println(phrase + " " + translated_string);

    }


}
