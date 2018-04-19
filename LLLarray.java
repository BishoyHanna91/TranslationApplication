/* Name: Bishoy Hanna
   Date: 3/3/2016
   Assignment4
   number of classes: 7

   this class is the linear linked list array which stores the data of the nouns and
   it has " has a relation" with the linear linked list array node
 *
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LLLarray {
    // the data member of this class
    private LLLarrayNode head;
    /*
       name of function: constructor
       Input: nothing
       output: nothing
    */
    LLLarray()
    {
        // initializing the head pointer
        head = null;
    }
    /*
       name of function: insert3
       Input: string,string
       output: nothing
    */
    public boolean insert3(String noun3,String temp_translated)
    {
        // creating an object of the LLLarrayNode
        LLLarrayNode new_LLLarray ;

        // check if the head is pointing to null
        if (head== null)
        {
              // creating a new object
                new_LLLarray = new LLLarrayNode();

            //set it to head
            head =  new_LLLarray;
            // copy the data
            head.copy_nouns(noun3, temp_translated);
            return  true;


        }
        // check if head is not pointing to null and the array is full
        else if((head!=null) && (head.arrayIsFull()))
        {
            // creating a newLLLarray
            new_LLLarray = new LLLarrayNode();

            // set it next to the head
            new_LLLarray.set_next(head);
            // copy  the data of the nouns
            new_LLLarray.copy_nouns(noun3,temp_translated);
            // make head point to the newLLLarray
            head = new_LLLarray;
            return true;
        } else {

            // copy the data
            head.copy_nouns(noun3,temp_translated);
            return true;
        }


    }
    /*
       name of function: insert4
       Input: string, string
       output: nothing
       this is wrapper function
    */
    public void insert4(String nouns4, String temp_translated)
    {

        insert3(nouns4, temp_translated);
    }
    /*
       name of function: display_LLLARRAY
       Input: a pointer
       output: nothing
    */
   public void display_LLLARRAY(LLLarrayNode display_head)
   {
       // check head is null
       if(display_head == null)
       {
           return;
       }

       else

       { // call the the display function
           display_head.display_nouns();

          // call the fucntion recursively
           display_LLLARRAY(display_head.get_next());

       }
   }
     /*
       name of function: display_LLLARRAY
       Input: nothing
       output: nothing
       this is a wrapper fucntion
    */
    public void display_LLLARRAY2()
    {

        display_LLLARRAY(head);
    }
     /*
       name of function: search_noun
       Input: a pointer,string
       output: nothing
    */

    public boolean search_noun(String searched_noun, LLLarrayNode head)
    {
        // check if head point to nothing
        if(head == null)
        {
            return false;

        }
        else {
            // call this function
            head.compare(searched_noun);

            // call this function recurively
            search_noun(searched_noun,head.get_next());
        }

        return false;

    }
     /*
       name of function: search_noun2
       Input: a String
       output: nothing
       this is a wrapper function
    */
    public void search_noun2(String searched_noun2)
    {
        if(head == null)
        {
            return;
        }
        search_noun(searched_noun2,head);
    }
     /*
       name of function: readfromfile
       Input: nothing
       output: nothing
    */

      void readFromFile() throws FileNotFoundException, IOException {
        //System.out.println("dir: " + System.getProperty("user.dir"));
        try {
            // creating a new buffer object and open the file
            BufferedReader br = new BufferedReader(new FileReader("nouns.txt"));
            // creating string
            String lines;
               // while if it is not the end of the file
                while ((lines = br.readLine()) != null) {
                    //split the string
                      String arr[] = lines.split(" ");

                      // insert the nouns
                      insert3(arr[0], arr[1]);


                }
           // close the file
            br.close();
        } catch (FileNotFoundException ex) {

            System.out.print("Unable to open file " + "nouns.txt");
        }
            catch (IOException ex) {
                System.out.print("error in reading file "+"nouns.txt");

        }

    }

}
