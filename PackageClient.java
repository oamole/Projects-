import java.io.File;
import java.util.Scanner;
import java.util.Vector;
import java.io.IOException;
class PackageClient{
	Vector<TwoDayPackage> twoDayData = new Vector<TwoDayPackage>();
	Vector<OverNightPackage> oneDayData = new Vector<OverNightPackage>();
	public static void main(String []args){
		PackageClient client = new PackageClient();
		OverNightPackage overNight;
		TwoDayPackage twoDay;


		String line=new String();
		try{
			//read the file and create the objects
			File textFile = new File("package.txt");
			Scanner scan = new Scanner(textFile);
			Package[] data = new Package[14];
			int count = 0;
			while(scan.hasNextLine())
			{
				line=scan.nextLine();
				String []tok=line.split(":");
				String fromAddress=tok[0];
				String toAddress=tok[1];
				float wt=Float.parseFloat(tok[2]);
				int type=Integer.parseInt(tok[3]);



				if (type == 1) {
					overNight = new OverNightPackage(fromAddress, toAddress, wt);
					client.oneDayData.add(overNight);
					for (int i = 0; i < client.oneDayData.size(); i++) {
						System.out.println(client.oneDayData.get(i).printReceipt());
					}
				}
				else{
					twoDay = new TwoDayPackage(fromAddress, toAddress, wt);
					client.twoDayData.add(twoDay);
					for (int i = 0; i < client.twoDayData.size(); i++) {
						System.out.println(client.twoDayData.get(i).printReceipt());
					}
				}
			

				}

			}

		}catch(IOException e){
			System.out.println("Cannot Read the file.");
			System.out.println(e.getMessage());
		}
	}
}
