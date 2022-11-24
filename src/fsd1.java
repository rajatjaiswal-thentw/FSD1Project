import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class fsd1 {

    public static void main(String[] args)  {
        String path= "C:\\localfile\\";
        Scanner sc = new Scanner (System.in);
        ArrayList<String> now=new ArrayList<>();
        while(true) {
            System.out.print(" 1.Create\n 2.Delete\n 3.Search\n 4.Exit\n");
            System.out.println(" Enter Your Choice What You Want To Perform :-");
            int select=sc.nextInt();
            switch (select) {
                case 1: {
                    System.out.println("Enter the file name:");
                    String file=sc.next();
                    String finalfile=path+file;
                    File f=new File(finalfile);
                    boolean result= false;
                    try {
                        result = f.createNewFile();
                       if (result == false) {
                            System.out.println("File not created:");
                        }
                        else {
                            now.add(file);
                            System.out.println("File is created:");
                        }}
                    catch (IOException e) {
                        System.out.println("Found Error In Program");
                        throw new RuntimeException(e);
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter the file name:");
                    String filedel=sc.next();
                    String finalfile=path+filedel;
                    File f=new File(finalfile);
                    f.delete();
                    System.out.println("File is deleted:)");

                }
                break;
                case 3: {
                    File f1=new File(path);
                    System.out.println("Enter the file name:");
                    String filesearch=sc.next();
                    File filen[]= f1.listFiles();
                    int flag=0;
                    for (File ff:filen) {
                        if (ff.getName().equals(filesearch)) {
                            flag=1;
                            break;
                        }
                        else {
                            flag=0;
                        }
                    }
                    if(flag==1) {
                        System.out.println("File is found:)");
                    }
                    else {
                        System.out.println("File is not found:)");
                    }
                }
                break;
                case 4:
                    System.out.println("Thank You :) !\n *** Developed BY Rajat Jaiswal ***");
                    System.exit(0);
                    break;
                default : {
                    System.out.println("You Enter Incorrect :( ! Please Select 1 to 4.\n Thank You");
                }
                break;}
        }}}
