import java.io.IOException;

/*
     Name: Bishoy Hanna
   Date: 3/3/2016
   Assignment4
   number of classes: 7

  this is the question class which is responsible for translating the questions, and it is one of
   the derived class

 */
public class questions extends translator {
    private String question;
     /*
        Name : constructor
        Input: nothing
        Output: nothing
     */
    public questions()
    {
        // setting the question string to null
        question = null;
    }
     /*
        Name : constructor with argument
        Input: string
        Output: nothing
     */
    public questions(String temp_question)
    {
        // setting the guestion to temp_question
        question = temp_question;

    }
     /*
        Name : get word
        Input: nothing
        Output: nothing
     */
        public String get_word()  {
        // calling the supre wich is the base class
        super.get_word();
        return null;
    }
     /*
        Name : display
        Input: nothing
        Output: nothing
     */
    public void display_word()
    {
        super.display_word();
    }




}
