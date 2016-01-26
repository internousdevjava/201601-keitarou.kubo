
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class KisoKadai3{


public static void main(String args[]){

int x = 1;
	while (x ==1) {
	  System.out.println
		("[メニュー] 1:読み込み 2:新規作成 3:追記 4:上書き 5:終了");
	    int selected = new java.util.Scanner(System.in).nextInt();
	 System.out.println("C:\\Users\\internous/\\");
	    switch (selected) {
case 1:
	x = 1;
	Read();
	break;
case 2:
	x = 1;
	Create();
	break;
case 3:
	x = 1;
	Write1();
     break;
case 4:
	x = 1;
	Write2();
     break;

case 5:
	x =2;
	System.out.println("終了します");
	break;
}

      }
	}
 public static void Read(){//1読み込み
	 String file = new java.util.Scanner(System.in).nextLine();
	  try{  FileReader filereader = new FileReader("C:\\Users\\internous/\\" + file);
	  System.out.println("ファイル名を入力");
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



public static void Create(){//2新規作成
	System.out.println("ファイルを作成します");
	System.out.println("ファイル名を記入して下さい");
	String namefile = new Scanner(System.in).nextLine();
	String fileplase ="C:\\users\\internous\\";
	 File newfile = new File( fileplase + namefile);


    String file = new java.util.Scanner(System.in).nextLine();


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

public static void Write1(){//3追記

  try{
	  System.out.println("追記したいファイル名を入力して下さい");
	  System.out.println("絶対パスでファイル名を入力して下さい。");
	  String kubo2 =new Scanner(System.in).nextLine();
	  File file = new File(kubo2);

	  checkBeforeWritefile(file);

       if (checkBeforeWritefile(file)){
         FileWriter filewriter = new FileWriter(file,true);

         System.out.println("内容を入力して下さい");

         String kubo =new Scanner(System.in).nextLine();
         filewriter.write(kubo);

         filewriter.close();
         System.out.println("書き込み終了しました");
       }else{
         System.out.println("ファイルに書き込めません");
       }
     }catch(IOException e){
       System.out.println(e);
     }
   }
public static void Write2(){//4:上書き

	  try{
		  System.out.println("上書きしたいファイル名を入力して下さい");
		  System.out.println("絶対パスでファイル名を入力して下さい。");
		  String kubo2 =new Scanner(System.in).nextLine();
		  File file = new File(kubo2);

		  checkBeforeWritefile(file);

	       if (checkBeforeWritefile(file)){
	         FileWriter filewriter = new FileWriter(file);

	         System.out.println("内容を入力して下さい");

	         String kubo =new Scanner(System.in).nextLine();
	         filewriter.write(kubo);

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


