public class KisoKadai2 {
	public static void main(String[] args){


	System.out.println("数当てゲーム");
 int ans = new java.util.Random().nextInt(10);
 for (int i = 0; i< 10; i++){
	 System.out.println("1～100の数字を入力して下さい★");
     int num = new java.util.Scanner(System.in).nextInt();
     if (ans == num) {
    	  System.out.println("あたり！m9(^Д^)");
    	  break;
     }else{
    	 System.out.println("違います！");
     }
 }
System.out.println("終了～");
}
	}
