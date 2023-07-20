package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager
{
    private String fileName;

    public FileManager(String fileName)
    {
        this.fileName=fileName;
    }

    public void writeToFile(String data)throws IOException
    {
        FileWriter writer=new FileWriter(fileName,true);
        writer.write(data);
        writer.flush();
        writer.close();
    }
    public void readFromFile()throws IOException
    {
        FileReader reader=new FileReader(fileName);
        int read=0;
        while(read!=-1)
        {
            read=reader.read();
            System.out.print((char) read);
        }
        reader.close();
    }
}
