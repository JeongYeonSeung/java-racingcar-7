package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public void runRace(List<Car> cars) {
        for (Car car : cars) {
            car.moveForwardByRandom();
        }
    }

    public List<Car> getWinners(List<Car> cars) {
        int maxForwardCount = getMaxForwardCount(cars);
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getForwardCount() == maxForwardCount) {
                winners.add(car);
            }
        }

        return winners;
    }

    private int getMaxForwardCount(List<Car> cars) {
        int maxForwardCount = 0;
        for (Car car : cars) {
            maxForwardCount = Math.max(maxForwardCount, car.getForwardCount());
        }
        return maxForwardCount;
    }
}
