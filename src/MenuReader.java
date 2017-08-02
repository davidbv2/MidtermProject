import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MenuReader {

    public static void main(String[] args) {

                ArrayList<Food> menuList = readFile("./MenuItems.txt");

                if (menuList == null) {
                    System.out.println("Issue with file... closing");
                    return;
                }

                //now I have a filled ArrayList of MenuItems
                //  at least in theory...

                //now do the rest of your program using this list

                //output this list
                //enhanced for (foreach) to go through list
                for (Food item: menuList) {
                    //toString does the formatting
                    System.out.println(item);
                }

            }




            public static ArrayList<Food> readFile (String filename) {
                ArrayList<Food> menuList = new ArrayList<Food>();

                try {
                    Path menuListPath = Paths.get(filename);
                    File menuListFile = menuListPath.toFile();
                    FileReader fileRdr = new FileReader(menuListFile);
                    BufferedReader in = new BufferedReader(fileRdr);

                    //read in the first line
                    String line = in.readLine();

                    //as long as there's another line
                    while (line != null) {
                        //break the line apart based on tabs
                        String[] details = line.split("\t");

                        if (details.length < 4) {
                            System.out.println("Bad line format--halting read");
                            break;
                        }

                        //take the first item and put it into the car's Make
                        String foodName = details[0];
                        //take the second item and put into car's Model
                        String categoryName = details[1];
                        //take the third item, turn it into an int, put into Year
                        double price = Double.parseDouble(details[2]);
                        //take the fourth item, turn it to double, put into Price
                        String description = (details[3]);

                        //construct a new Car object from this data
                        Food menuItem = new Food(foodName, categoryName, price, description);

                        //add the new Car into ArrayList
                        menuList.add(menuItem);

                        //read in the next line for the next iteration
                        line = in.readLine();
                    }

                } catch (IOException e) {
                    System.out.println(e);
                    return null;
                }

                return menuList;
            }
        }


