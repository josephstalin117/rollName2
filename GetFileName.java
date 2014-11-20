import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

public class GetFileName {

	public static void main(String[] args) {
		File f = new File("./images");// "./"表示要遍历的文件夹为当前文件夹
		String sf[] = f.list();// 将文件夹中的文件名放入数组中
		String Names="";

		for (String s : sf) {// 开始遍历文件夹
			String[] p = s.split("\\.");
			//System.out.println("学生名：" + p[0]);// 打印文件名
			StringBuffer studentName = new StringBuffer().append('"').append(p[0]).append('"').append(',');
			Names+=studentName.toString();
		}

		System.out.println(Names);

		try {
			/* 写入Txt文件 */  
            File writename = new File(".\\output.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件  
            writename.createNewFile(); // 创建新文件  
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
            out.write(Names); // \r\n即为换行  
            out.flush(); // 把缓存区内容压入文件  
            out.close(); // 最后记得关闭文件  

        } catch (Exception e) {  
        	e.printStackTrace();  
        } 
    }

}