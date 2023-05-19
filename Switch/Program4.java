import java.io.*;

class Ott {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("What's your Interest?");

		System.out.println("1.Movies");
		System.out.println("2.Series");


		System.out.println("Enter your choice:");
		int ch = Integer.parseInt(br.readLine());

		switch(ch){
       			case 1:{
       
				System.out.println("Movies you wish to watch today");

				System.out.println("1.Founder");
				System.out.println("2.Snowden");
				System.out.println("3.Jobs");
				System.out.println("4.Her");
				System.out.println("5.Social Network");
				System.out.println("6.Wall-E");
				System.out.println("7.AI");

				System.out.println("Enter Movie choice:");
			        int ch1 = Integer.parseInt(br.readLine());

				switch(ch1){

					case 1:
						System.out.println("Founder");
						break;
					case 2:
						System.out.println("Snowden");
						break;
					case 3:
						System.out.println("Jobs");
						break;
					case 4:
						System.out.println("Her");
						break;
					case 5:
						System.out.println("Social Network");
						break;
					case 6:
						System.out.println("Wall-E");
						break;
					case 7:
						System.out.println("AI");
						break;
					default:
						System.out.println("Not Available");
						break;
				}

				break;
			}

       		case 2: {
				System.out.println("Best Series To Watch:");
				
				System.out.println("1.Silicon valley");
				System.out.println("2.Devs");
				System.out.println("3.The It Crowd");
				System.out.println("4.Mr.Robot");

				System.out.println("Enter Series Choice:");
				int ch2 = Integer.parseInt(br.readLine());	
				
					switch(ch2) {
							case 1:
								System.out.println("Silicon Valley");
								break;
							case 2:
								System.out.println("Devs");
								break;
							case 3:
								System.out.println("The IT Crowd");
								break;
							case 4:
								System.out.println("Mr.Robot");
								break;
							default:
								System.out.println("Not Available");
								break;
					}
				break;
			}
			
		}

	}
}	
