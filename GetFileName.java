import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

public class GetFileName {

	public static void main(String[] args) {
		File f = new File("./images");// "./"��ʾҪ�������ļ���Ϊ��ǰ�ļ���
		String sf[] = f.list();// ���ļ����е��ļ�������������
		String Names="";

		for (String s : sf) {// ��ʼ�����ļ���
			String[] p = s.split("\\.");
			//System.out.println("ѧ������" + p[0]);// ��ӡ�ļ���
			StringBuffer studentName = new StringBuffer().append('"').append(p[0]).append('"').append(',');
			Names+=studentName.toString();
		}

		System.out.println(Names);

		try {
			/* д��Txt�ļ� */  
            File writename = new File(".\\output.txt"); // ���·�������û����Ҫ����һ���µ�output��txt�ļ�  
            writename.createNewFile(); // �������ļ�  
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
            out.write(Names); // \r\n��Ϊ����  
            out.flush(); // �ѻ���������ѹ���ļ�  
            out.close(); // ���ǵùر��ļ�  

        } catch (Exception e) {  
        	e.printStackTrace();  
        } 
    }

}