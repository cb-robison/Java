/**
 * This program will store information about a student on and text file and display 
 * details from the text file such as first name, last name, and test score.
 */

package Assignment5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Author: Connor Robison
 * Date: 4-11-24
 */

public class TestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create some names and test scores to store on a text file
        String [] fnames = new String[]{"Jasmine","Marcus","Emily","David","Sophia"};
        String [] lnames = new String[]{"Patel","Thompson","Rodriguez","Nguyen","Johnson"};
        int [] scores = new int[]{85,72,93,68,90};
        
        // store this infomation on a text file
        OutTextFile(fnames,lnames,scores,"TestScores.txt");
        
        // display the information stored on the file
        InTextFile("TestScores.txt");
        
        // display the test average
        System.out.printf("%s%d%n","Average: ",GetTestAvg("TestScores.txt"));
        
        // display the highest test score
        System.out.printf("%s%d%n","Highest Score: ",GetHighestScore("TestScores.txt"));
    }
    
    // utility functions
    static void OutTextFile(String[] fnames,String[] lnames,int[] scores,String file_name){
        
        // open the text file, output data to the file then close the file
        try (Formatter output = new Formatter(file_name)) {
            for (int i = 0; i < scores.length; i++) {
                output.format("%s %s %d%n", fnames[i], lnames[i], scores[i]);
            }
        } catch (SecurityException | FileNotFoundException | FormatterClosedException error) {
            System.exit(1);
        }
    }
    
    static void InTextFile(String file_name){
        
        // open clients.txt read its contents and close it
        try(Scanner input = new Scanner(Paths.get(file_name))){
            System.out.printf("%-12s%-12s%6s%n", "First Name:", "Last Name:", "Grade:");

            
            // read record from file
            while (input.hasNext()) {     // while there is more to read
                // display record
                System.out.printf("%-12s%-12s", input.next(), input.next());
                
                // declare some variables
                char letter_grade;
                int current_score = input.nextInt();
                
                // get the letter grade
                if(current_score<60)
                    letter_grade = 'F';
                else if(current_score<70)
                    letter_grade = 'D';
                else if(current_score<80)
                    letter_grade = 'C';
                else if(current_score<90)
                    letter_grade = 'B';
                else
                    letter_grade = 'A';
                
                // print the letter grade
                System.out.println(letter_grade);    
            }
            
        }
        catch(IOException | NoSuchElementException | IllegalStateException error){
            error.printStackTrace();
        }
    }
    
    static int GetTestAvg(String file_name){// open clients.txt read its contents and close it
        // initialize some varaibles 
        int sum = 0, count = 0;
        
        try (Scanner input = new Scanner(Paths.get(file_name))) {
            
            // read record from file
            while (input.hasNext()) {     // while there is more to read
                // get the next test score 
                input.next();
                input.next();
                
                sum += input.nextInt();
                count++;
            }
        } catch (IOException | NoSuchElementException | IllegalStateException error) {
            error.printStackTrace();
        }
        
        return (int)(sum/count);
    }
    
    static int GetHighestScore(String file_name){
        // declare some variables
            int highest = 0;
            int current_score;
            
        // open clients.txt read its contents and close it
        try(Scanner input = new Scanner(Paths.get(file_name))){
            while (input.hasNext()) {     // while there is more to read
                // get the current score
                input.next();
                input.next();
                current_score = input.nextInt();
                
                // update the highest score
                if(current_score>highest)
                    highest = current_score;
            }
            
        }
        catch(IOException | NoSuchElementException | IllegalStateException error){
            error.printStackTrace();
        }

        // return the highest score
        return highest;
        }
    
}
