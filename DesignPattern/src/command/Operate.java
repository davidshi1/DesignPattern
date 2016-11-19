package command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//执行命令类
public class Operate {
	
	private List<Command> commands = new ArrayList<Command>();
	
	//设置命令
	public void SetCommands(Command command){
		commands.add(command);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date())+" add command:"+command.toString());// new Date()为获取当前系统时间
	}
	
	//取消某一个命令
	public void CancelCommand(Command command){
		commands.remove(command);
		System.out.println(command.toString());
	}
	
	//通知执行所有命令
	public void Notify(){
		for(int i=0;i<commands.size();i++){
			if(commands.get(i).toString().equals("AttackFriends")){
				//拒绝执行攻击队友的命令
				System.out.println("Warning You can not attack your friends!!!");
			}else{
					commands.get(i).ExcuteCommand();
			}
		}
	}
	
}
