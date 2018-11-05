package racinggame.domain.car;

import racinggame.domain.rule.RacingGameRule;

/**
 * Created by hspark on 03/11/2018.
 */
public class Car {

	private String name;
	private int position;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void moveForward(RacingGameRule gameRule) {
		if (gameRule.isAvailableMoving(this)) {
			position++;
		}
	}

	public boolean isEqualName(String name) {
		return getName().equals(name);
	}

	public boolean isEqualPosition(int position) {
		return getPosition() == position;
	}

}