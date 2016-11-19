package command;

//¹¥»÷¶ÓÓÑÃüÁîÀà
class AttackFriendsCommand extends Command {

	public AttackFriendsCommand(GameRole role) {
		super(role);
	}

	@Override
	public void ExcuteCommand() {
		role.AttackFriends();
	}

	public String toString() {
		return "AttackFriends";
	}

}
