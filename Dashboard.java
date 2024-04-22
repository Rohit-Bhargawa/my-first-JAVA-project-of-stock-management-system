package private_pack;
import java.util.Scanner;
import java.io.*;

public class Dashboard
{
    public void ADD()
    {
        try {
            File file = new File("C:\\Users\\rohit\\IdeaProjects\\Stock_Management\\Item_List.txt");
            FileWriter writer = new FileWriter(file, true); // Append mode

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.println("Enter item id: ");
            int id = scanner.nextInt();
            System.out.println("Enter cost price: ");
            int cp = scanner.nextInt();
            System.out.println("Enter selling price: ");
            int sp = scanner.nextInt();
            System.out.println("Enter quantity to be added: ");
            int qt=scanner.nextInt();

            // Write item details to the file
            writer.write(itemName + "," + id + "," + cp + "," + sp +","+qt+ "\n");
            writer.close();
            System.out.println("Item Added Successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void REMOVE()
        {
            try {
                File inputFile = new File("C:\\Users\\rohit\\IdeaProjects\\Stock_Management\\Item_List.txt");
                File tempFile = new File("C:\\Users\\rohit\\IdeaProjects\\Stock_Management\\Temp_Item_List.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter item name to remove: ");
                String itemNameToRemove = scanner.nextLine();

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {
                    // Split the line into fields using comma as delimiter
                    String[] fields = currentLine.split(",");
                    // Check if the item name matches the one to remove
                    if (!fields[0].equals(itemNameToRemove)) {
                        // If not, write the line to the temp file
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                }
                writer.close();
                reader.close();

                // Replace the original file with the temp file
                if (!inputFile.delete()) {
                    System.out.println("Could not delete original file.");
                    return;
                }
                if (!tempFile.renameTo(inputFile)) {
                    System.out.println("Could not rename temp file.");
                } else {
                    System.out.println("Item Removed Successfully");
                }
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }
        public void DISPLAY()
        {
            try {
                File file = new File("C:\\Users\\rohit\\IdeaProjects\\Stock_Management\\Item_List.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
                scanner.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
