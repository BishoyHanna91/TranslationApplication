/* Name: Bishoy Hanna
   Date: 3/6/2016
   Assignment 5
   number of classes: 10

   this class is the node of the linear linked list and it contains a next pointer and an object of the number
 */
public class LLLnode {

 // the data members of the class
private numbers no;
private LLLnode next;

  /*
       name of function: constructor
       Input: nothing
       output: nothing
    */
 LLLnode()
 {
     // setting the data members of the class to null
     no = new numbers();
     next = null;
 }

 /*
       name of function: get_next
       Input: get_next
       output: nothing
    */

    public LLLnode get_next() {
        // get the next pointer
        return next;
    }
    /*
       name of function: set_next
       Input: pointer
       output: nothing
    */

    public void set_next(LLLnode next2) {
        // setting the nex2  to next
        next = next2;
    }
    /*
       name of function: copy_numbers
       Input: string string
       output: nothing
    */

    public void copy_numbers(String temp_numbers, String temp_translated)
    {
        // creating an object of the constructor which accepts the arguments
        no = new numbers(temp_numbers,temp_translated);
    }

    /*
       name of function: display numbers
       Input: nothing
       output: nothing
    */
    public void display_numbers()

    {
        //calling this function from the derived class which is the numbers
        no.display_word();

    }
    /*
       name of function: compare_numbers
       Input: string
       output: nothing
    */
    public boolean compare_numbers(String compare_value)

    {
        // check if the number that is already in the class is the same as the parameter
        if(no.return_numbers().compareTo(compare_value)==0)
        {
            // display it
            no.display_word();
            return true;
        }
        return false;

    }













}
