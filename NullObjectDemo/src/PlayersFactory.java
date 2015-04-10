
public class PlayersFactory {

	public static final String[] nicknames = {"Julie", "Edgar", "Violet"};
	
	public static AbstractPlayer getPlayer(String nick){
		for(int i = 0; i < nicknames.length; i++){
			if(nicknames[i].equalsIgnoreCase(nick)){
				return new RealPlayer(nick);
			}
		}
		return new NullPlayer();
	}
}
