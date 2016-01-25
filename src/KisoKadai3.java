import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class KisoKadai3{


public static void main(String args[]){
	  System.out.println
		("[メニュー] 1:読み込み 2:新規作成 3:上書き");
	    int selected = new java.util.Scanner(System.in).nextInt();
switch (selected) {
case 1:
	Read();
	break;
case 2:
	Newfile();
	break;
case 3:
	Write();
break;
  }
}
 public static void Read(){
	 String file = new java.util.Scanner(System.in).nextLine();
	  try{  FileReader filereader = new FileReader("C:\\Users\\internous/\\" + file);

      int i;
       while((i = filereader.read()) != -1){
         System.out.print((char)i);
       }

       filereader.close();
     }catch(FileNotFoundException e){
       System.out.println(e);
     }catch(IOException e){
       System.out.println(e);
     }
 }



public static void Newfile(){
    String file = new java.util.Scanner(System.in).nextLine();
	File newfile = new File("C:\\Users\\internous\\" + file);

 try{
   if (newfile.createNewFile()){
     System.out.println("ファイルの作成に成功しました");
   }else{
     System.out.println("ファイルの作成に失敗しました");
   }
 }catch(IOException e){
   System.out.println(e);
   }
 }

public static void Write(){
  try{
       File file1 = new File("C:/Users/internous/hello.txt");

       if (checkBeforeWritefile(file1)){
         FileWriter filewriter = new FileWriter(file1, true);

         filewriter.write("テスト\r\n");
         filewriter.write("ではまた\r\n");

         filewriter.close();
         System.out.println("書き込み終了しました");
       }else{
         System.out.println("ファイルに書き込めません");
       }
     }catch(IOException e){
       System.out.println(e);
     }
   }
private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}


