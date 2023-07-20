package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException
    {
        System.out.println("FILE MANAGER");
        System.out.println();
        FileManager fileManager = new FileManager("Data.txt");
        fileManager.writeToFile("CAMPUS TRAINING GUIDELINES"+"\n");
        System.out.println();
        fileManager.writeToFile("1. Be punctual and prepared for class everyday"+"\n");
        fileManager.writeToFile("2. Adhere to training session and break timings"+"\n");
        fileManager.writeToFile("3. Dress appropriately and adhere to UST dress code policy"+"\n");
        fileManager.writeToFile("4. Ask questions and seek clarifications"+"\n");
        fileManager.writeToFile("5. Show courtesy to the speaker and wait your turn"+"\n");
        fileManager.writeToFile("6. Training premises should be maintained neat and tidy"+"\n");
        fileManager.writeToFile("7. Be mindful of UST property.Vandalism will lead to disciplinary action"+"\n");
        fileManager.writeToFile("8. No food or beverages allowed outside of the designated areas"+"\n");
        fileManager.writeToFile("9. Strictly no casual leaves allowed while in training"+"\n");
        fileManager.writeToFile("10. Access to mobile phones are strictly prohibited in the training rooms"+"\n");
        fileManager.writeToFile("11. Be respectful of your own personal space and of those around you"+"\n");
        fileManager.writeToFile("12. Uphold UST values");
        System.out.println();
        fileManager.readFromFile();
    }
}