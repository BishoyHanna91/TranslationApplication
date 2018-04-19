import java.io.IOException;

/* Name: Bishoy Hanna
   Date: 3/3/2016
   Assignment4
   number of classes: 7

  this is the nouns class which is responsible for translating the words, and it is one of
   the derived class
 */




public class nouns extends translator {
    private String noun;
    /*
        Name : constructor
        Input: nothing
        Output: nothing
     */
    public nouns()
    {
        // setting the noun to null
        noun = null;
    }
    /*
        Name : constructor which accepts arguments
        Input: string string
        Output: nothing
     */
    public nouns(String noun2, String translation)
    {
        // calling the abstract base class
        super(translation);

        // setting noun2 to noun
        noun = noun2;
    }
    /*
        Name : get_word
        Input: nothing
        Output: nothing
     */
    public String get_word()   {

        // getting the word
        return noun;
    }
    /*
        Name : display word
        Input: nothing
        Output: nothing
     */
    public void display_word()
    {
         // printing the words
        System.out.println(noun + " " + translated_string);
    }
    /*
        Name : return_nouns
        Input: nothing
        Output: nothing
     */
  public String return_noun()
  {
      return noun;
  }



}
