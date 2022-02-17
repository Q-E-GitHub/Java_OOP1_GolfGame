package MAP;

import PLAYER.Player;

public class ItemStore {
    public int up_power=700;
    public int up_meter=1000;
    public int up_direction=700;
    public int caddie=2000;

    public int buy(int coin, int number, int level) {

        System.out.println("아이템 구매를 시도하는 중입니다.");
        time_delay1();
        System.out.println("...");
        time_delay1();
        System.out.println("...");
        time_delay1();

        if(level<=15) {
            if(number==1) {
                //코인 > 힘up아이템 가격
                if(coin>=up_power)
                    return coin - up_power;
            }
            if(number==2) {
                //코인 > 거리정확도up아이템 가격
                if(coin>=up_meter)
                    return coin - up_meter;
            }
            if(number==3) {
                //코인 > 방향성up아이템 가격
                if(coin>=up_direction)
                    return coin - up_direction;
            }
        } else if(level>15) {
            if(number==1) {
                //코인 > 힘up아이템 가격
                if(coin>=up_power)
                    return coin - up_power;
            }
            if(number==2) {
                //코인 > 거리정확도up아이템 가격
                if(coin>=up_meter)
                    return coin - up_meter;
            }
            if(number==3) {
                //코인 > 방향성up아이템 가격
                if(coin>=up_direction)
                    return coin - up_direction;
            }
            if(number==4) {
                //코인 > 캐디찬스아이템 가격
                if(coin>=caddie)
                    return coin - caddie;
            }
        }
        //코인 부족할때
        return -1;
    }

    //멘트 타이밍 시간 지연
    public static void time_delay1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }

}
