package info.omgwtfhax.IGVindication1118Me.core;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

	public class OWHMe extends JavaPlugin{
		
		public void onEnable(){
			
		}
		
		public void onDisable(){
			
		}
		
		public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
			if(label.equalsIgnoreCase("me")){
			String message = StringUtils.join(args," ");
			String player = sender.getName();
			for(Player p: Bukkit.getOnlinePlayers()){
				if(p.getWorld() == ((Player)sender).getWorld()){
					p.sendMessage(player+" "+message);
				}
			}

			
			return true;
			}
			else if(label.equalsIgnoreCase("my")){
			String message = StringUtils.join(args," ");
			String player = sender.getName();
			for(Player p: Bukkit.getOnlinePlayers()){
				if(p.getWorld() == ((Player)sender).getWorld()){
					p.sendMessage(player+"'s "+message);
			}
			}
			return true;
			}
			else{
				return false;
			}
		}
	}


