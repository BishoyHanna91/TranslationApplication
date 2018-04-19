/*
   Name: Bishoy Hanna
   Date: 3/6/2016
   Assignment 5
   number of classes: 10

  this is the numbers class which is responsible for translating the numbers, and it is one of
   the derived class
 */
public class numbers extends translator {

    // the data members of the class
    private String number;

    /*
        Name : constructor
        Input: nothing
        Output: nothing
     */
    public numbers()

    {
        // setting the number string to null
        this.number = null;
    }
    /*
        Name : constructor accepts parameters
        Input: string string
        Output: nothing
     */
    public  numbers(String temp_number, String translation)
    {
        // calling this function which is the function of the abstract base class
        super(translation);

        // setting this temp number to the data member
        this.number = temp_number;
    }
      /*
        Name : get_word
        Input: nothing
        Output: nothing
     */
    public String get_word()   {

        // getting the word
        return number;
    }
    /*
        Name : display word
        Input: nothing
        Output: nothing
     */
    public void display_word()
    {
         // printing the words
        System.out.println(number + " " + translated_string);
    }
    /*
        Name : return_nouns
        Input: nothing
        Output: nothing
     */
  public String return_numbers()
  {
      return number;
  }



}
