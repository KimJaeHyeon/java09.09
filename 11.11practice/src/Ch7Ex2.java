import java.io.*;

public class Ch7Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter out = new OutputStreamWriter(System.out);

		try{
			String input = in.readLine();
			System.out.println(input);
			out.write(input);
			out.close();
			}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}