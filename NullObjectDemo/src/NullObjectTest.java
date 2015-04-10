
public class NullObjectTest {

	public static void main(String[] args){
		AbstractPlayer p1 = PlayersFactory.getPlayer("Julie");
		AbstractPlayer p2 = PlayersFactory.getPlayer("Stan");
		
		System.out.println("Players: ");
		System.out.println(p1.getNick());
		System.out.println(p2.getNick());
	}
}
