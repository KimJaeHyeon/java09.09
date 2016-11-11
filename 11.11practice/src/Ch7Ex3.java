import java.io.*;

public class Ch7Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:/Dev-Kim/tmpfile.txt";
		File file = new File(path);

		try{

			FileWriter fw = new FileWriter(file);
			for(int i = 'A';i<='Z';i++)
				fw.write(i);
			fw.close();
			System.out.println("Done....");
			}
		catch(IOException e){
			e.printStackTrace();
			}
		}
	}
