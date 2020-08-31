import java.io.*;
class CreateFile
{
	public static void main(String args[]) throws Exception{
		File f=new File("f://A//abc.txt");
		f.createNewFile();
		System.out.println("file has been created");
		BufferedReader br=new BufferedReader(new FileReader(f));
		FileWriter fw=new FileWriter(f);
		String st="Hai, Welcome to Java";
		fw.write(st);
		fw.close();
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}
}
		