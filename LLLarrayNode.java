import java.io.IOException;

/*
  Name: Bishoy Hanna
   Date: 3/3/2016
   Assignment4
   number of classes: 7

   this is the class which is the node of the LLL array

 */
public class LLLarrayNode {
    // the data memebers of the class
    final int size;
    private nouns n[];
    private LLLarrayNode next;

    /*
       name of function: constructor
       Input: nothing
       output: nothing
    */
    public LLLarrayNode() {
        // setting the size be 5
        size = 5;
        // creating a new object
        n = new nouns[size];

        // setting next pointer to null
        next = null;

    }
    /*
       name of function: get_next
       Input: get_next
       output: nothing
    */

    public LLLarrayNode get_next() {
        // get the next pointer
        return next;
    }
    /*
       name of function: set_next
       Input: pointer
       output: nothing
    */

    public void set_next(LLLarrayNode next2) {
        // setting the nex2  to next
        next = next2;
    }
   /*
       name of function: copynouns
       Input: string string
       output: nothing
    */
    public void copy_nouns(String word, String temp_translated) {
        // for loop going over each index in the array
        for (int i = 0; i < size; ++i) {
            // check if it is pointing to null
            if (n[i] == null) {

                // creating new object of the nouns
                n[i] = new nouns(word, temp_translated);
                break;


            }

        }
    }
/*
       name of function: display_nouns
       Input: nothing
       output: nothing
    */
    public void display_nouns() {
        // for loop to go over each index
        for (int i = 0; i < size; ++i) {
            // display the words
            n[i].display_word();
        }
    }
  /*
       name of function: arrayIsFull
       Input: nothing
       output: nothing
    */

    public boolean arrayIsFull() {

         // for loop to go over each index in the array
        for (int i = 0; i < 5; ++i) {
            // check if it is empty
            if (n[i] == null) {
                return false;
            }

        }
        return true;
    }
/*
       name of function: compare
       Input: string
       output: nothing
    */
    public boolean compare(String compare_nouns) {
            // for loop to go over each index
            for (int i = 0; i < 5; ++i) {
                // check if each index is not empty
                if (n[i] != null) {
                    // call the compare function
                    if (n[i].return_noun().compareTo(compare_nouns) == 0) {
                        // display the word
                        n[i].display_word();
                        return true;
                    }
                }
            }
            return false;

    }
}
