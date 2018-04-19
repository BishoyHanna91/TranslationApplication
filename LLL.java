/*
   Name: Bishoy Hanna
   Date: 3/6/2016
   Assignment 5
   number of classes: 10

  this is the linear linked list and its function, and it stores the data of the numbers class
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LLL {

// creating data member which is head
private LLLnode head;

 /*
       name of function: constructor
       Input: nothing
       output: nothing
    */
public LLL()
{
    // setting the head to null
    head = null;
    
}
 /*
       name of function: insert
       Input: string, string
       output: nothing
    */
public boolean insert(String number, String translated_string)
{
    // creating new_node
    LLLnode new_node;

    // check if head is null
    if(head == null)
    {
        // creating an object of the LLLnode
        new_node = new LLLnode();

        // setting the head point to the new node
        head = new_node;

        // copy the data
        head.copy_numbers(number,translated_string);
        return true;
    }

    // if head is not pointing to null
    else if(head!=null)

    {
        // creatng a new node
        new_node = new LLLnode();

        // setting the newnode next point to head
        new_node.set_next(head);

        // copy the data
        new_node.copy_numbers(number,translated_string);

        // setting the head point to newnode
        head = new_node;
        return true;

    }
    else
    {
     head.copy_numbers(number,translated_string);
        return true;
    }

}
    /*
       name of function: display_LLL
       Input: pointer
       output: nothing
    */
    public void display_LLL(LLLnode display_head)
    {
        // check head is null
        if(display_head == null)
        {
            return;
        }

        else

        { // call the the display function
            display_head.display_numbers();

            // call the fucntion recursively
            display_LLL(display_head.get_next());

        }
    }
    /*
       name of function: displayLLL2 wrapper function
       Input: nothing
       output: nothing
    */
    public void display_LLL2()
    {
        display_LLL(head);
    }

   /*
       name of function: search_number
       Input: string, pointer
       output: nothing
    */
    public boolean search_number(String searched_number, LLLnode head)
    {
        // check if head point to nothing
        if(head == null)
        {
            return false;

        }
        else {
            // call this function
            head.compare_numbers(searched_number);

            // call this function recurively
            search_number(searched_number,head.get_next());
            return true;
        }



    }
    /*
       name of function: search_number2 wrapper functions
       Input: string, pointer
       output: nothing
    */

    public void search_number2(String searched_number) {
        if (head == null) {
            return;
        } else {
            search_number(searched_number, head);
        }
    }
    /*
       name of function: delete_number
       Input: string
       output: nothing
    */
    public boolean delete_number(String deleted_number)
    {
        // creating these pointers
        LLLnode deletePtr;
        LLLnode prev = null;
        LLLnode current;

        // setting current pointing to head
        current = head;

        // check if head is null
        if(head == null)
        {
            return  true;
        }

   // check if the number that i want to delete is the first number in the list
   if(head.compare_numbers(deleted_number) == true)
   {
       // setting deletePtr pointing to head
       deletePtr =  head;

       // make head move to next node
       head = head.get_next();

       // setting the next of the deletePtr to null
       deletePtr.set_next(null);

       // delete the number
       deletePtr.copy_numbers("","");

       // make deleteptr to null
       deletePtr= null;
       return true;
   }
        // make the current poinet traverse throught the linked list
        while(current.get_next()!=null && current.compare_numbers(deleted_number)!=true)
        {
            // setting prev point to current
            prev = current;

            // make current move to the next node
            current = current.get_next();
        }

        // if the node is in the middle
        if(current.get_next()!=null && current.compare_numbers(deleted_number)==true)
        {
            // setting the deletePtr point to current
            deletePtr = current;

            // setting the next of the prev point to the next of the current
            prev.set_next(current.get_next());

            // move the current to the next node
            current = current.get_next();

            // delete the number and setting deleteptr to null
            deletePtr.copy_numbers("","");
            deletePtr = null;
            return true;
        }

        // if the number is in the last node
        else if(current.get_next()==null && current.compare_numbers(deleted_number)==true)
        {
            // setting the deletePtr to current
               deletePtr = current;

              // setting the next of prev point to null
               prev.set_next(null);

                // delete the number and setting its pointer to null
               deletePtr.copy_numbers("","");
               deletePtr =null;
        }
            else
        {
            return false;
        }
        return false;



    }

    /*
       name of function: delete_ALL
       Input: pointer
       output: nothing
    */

   public LLLnode delete_ALL(LLLnode head)
   {
       // setting deleteptr pointing to head
       LLLnode deletePtr = head;

       // check if head is null
       if(head == null)
       {


           return null;
       }
       else

       {
          // call the function recursively
           head = delete_ALL(head.get_next());

           // delete the number and setting its pointer to null
           deletePtr.copy_numbers("","");
           deletePtr = null;
           return head;
       }

   }
    /*
       name of function: deleteALL2 wrapper function
       Input: string, pointer
       output: nothing
    */
    public LLLnode deleteALL2()
    {
        head = delete_ALL(head);
        return head;
    }


    void readFromFile() throws FileNotFoundException, IOException {
        //System.out.println("dir: " + System.getProperty("user.dir"));
        try {
            // creating a new buffer object and open the file
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
            // creating string
            String lines;
               // while if it is not the end of the file
                while ((lines = br.readLine()) != null) {
                    //split the string
                      String arr[] = lines.split("=");

                      // insert the nouns
                      insert(arr[0], arr[1]);


                }
           // close the file
            br.close();
        } catch (FileNotFoundException ex) {

            System.out.print("Unable to open file " + "numbers.txt");
        }
            catch (IOException ex) {
                System.out.print("error in reading file " + "numbers.txt");

        }

    }

}
