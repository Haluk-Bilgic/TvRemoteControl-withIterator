import java.util.ArrayList;
import java.util.Iterator;


public class TelevisionRemoteControl implements Iterable<String> {

	private ArrayList<String> channels=new ArrayList<String>();
	
	public class TelRemoteControlIterater implements Iterator<String>{
       private int index=0;
		public boolean hasNext() {
			
			if(index>=channels.size()){
				return false;				
			}else{
				return true;
			}	
		}
		public String next() {
        String channel=channels.get(index);
        index++;
        return channel;
		}
	}
	public void addChannel(String channel){
		channels.add(channel);
	}
	public void removeChannel(String channel){
		
		if(channels.contains(channel)){
			channels.remove(channel);			
		}else{
			System.out.println("The Channel not found");
		}
	}
	public int numberOfChannels(){
		return channels.size();
	}
	public Iterator<String> iterator() {
		return new TelRemoteControlIterater();
	}
}
