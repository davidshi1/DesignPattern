package command;

//·ÀÓùÃüÁîÀà
class DefenseCommand extends Command {

	public DefenseCommand(GameRole role) {
		super(role);
	}

	@Override
	public void ExcuteCommand() {
		role.Defense();
	}

	public String toString() {
		return "Defense";
	}

}
