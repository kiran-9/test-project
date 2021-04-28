import java.io.*;

class Client{
		
	Socket socket= null;
			}
			
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			
			output.writeUTF("getAll");
			DataInputStream input = new DataInputStream(socket.getInputStream());
			allRecords = input.readUTF();
		}

	
	public static void main(String[] args){
	}
}
