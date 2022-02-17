import MAP.ItemStore;
import MAP.Map;
import PLAYER.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    Map map = new Map();
        System.out.println("           "+"*******************"+"\n"+"    "+"**********************************");
        time_delay1();
        System.out.println("************ Q_E COUNTRY CLUB ************* ");
        System.out.println("************ WELCOME GOLF LAND ************");
        time_delay1();
        System.out.println("    "+"**********************************"+"\n"+"           "+"*******************"+"\n");
        time_delay1();
        System.out.println("GOLF LAND는 플레이어를 선택해서 3홀의 게임을 진행합니다. 각 홀의 점수를 합산하여 코인과 경험치를 획득할수있습니다.");
        System.out.println("선택한 플레이어의 레벨을 올려 아마추어(LV1-10) -> 세미프로(LV10-20) -> 투어프로(LV20-30)로 성장시키는 성장형게임입니다.");
        System.out.println("추후 업데이트가 지속되니 많은 관심과 인내 부탁드리겠습니다."+"\n"+"\n");

        System.out.println("플레이어 설정 전 플레이어 정보입니다. 힘/거리정확도/방향성의 MAX는 10입니다.");
        System.out.println("===================================================================================================="+"\n");
        System.out.println("HOMER ▶ 레벨: 1 코인: 1000 힘: 6 거리정확도: 8 방향성: 4");
        System.out.println("MARGE ▶ 레벨: 1 코인: 1000 힘: 2 거리정확도: 8 방향성: 8");
        System.out.println("BART ▶ 레벨: 1 코인: 1000 힘:  7 거리정확도: 7 방향성: 4");
        System.out.println("LISA ▶ 레벨: 1 코인: 1000 힘: 3 거리정확도: 7 방향성: 8");
        System.out.println("\n"+"===================================================================================================="+"\n");
        time_delay4();

        Player play = new Player();
        int number;

        //플레이어 선택
        while (true) {

        System.out.println("플레이어를 신중하게 선택해주세요. "+"\n"+"1.HOMER 2. MARGE 3. BART 4. LISA");
        number = sc.nextInt();

            //HOMER 선택
            if (number == 1) {
                System.out.println("HOMER가 선택되었습니다.");
                play=new Player();
                play.level=16;
                play.coin=10000;
                play.power=6;
                play.meter=8;
                play.direction=4;
                time_delay1();
                System.out.println("**************************");
                System.out.println("현재 HOMER의 레벨: "+play.level);
                System.out.println("현재 HOMER의 코인: "+play.coin);
                System.out.println("현재 HOMER의 힘: "+play.power);
                System.out.println("현재 HOMER의 거리정확도: "+play.meter);
                System.out.println("현재 HOMER의 방향성: "+play.direction);
                System.out.println("**************************");
                break;
            } else if (number == 2) {
                System.out.println("MARGE가 선택되었습니다.");
                play=new Player();
                play.level=1;
                play.coin=1000;
                play.power=2;
                play.meter=8;
                play.direction=8;
                time_delay1();
                System.out.println("**************************");
                System.out.println("현재 MARGE의 레벨: "+play.level);
                System.out.println("현재 MARGE의 코인: "+play.coin);
                System.out.println("현재 MARGE의 힘: "+play.power);
                System.out.println("현재 MARGE의 거리정확도: "+play.meter);
                System.out.println("현재 MARGE의 방향성: "+play.direction);
                System.out.println("**************************");
                break;
            } else if (number == 3) {
                System.out.println("BART가 선택되었습니다.");
                play=new Player();
                play.level=1;
                play.coin=1000;
                play.power=7;
                play.meter=7;
                play.direction=4;
                time_delay1();
                System.out.println("**************************");
                System.out.println("현재 BART의 레벨: "+play.level);
                System.out.println("현재 BART의 코인: "+play.coin);
                System.out.println("현재 BART의 힘: "+play.power);
                System.out.println("현재 BART의 거리정확도: "+play.meter);
                System.out.println("현재 BART의 방향성: "+play.direction);
                System.out.println("**************************");
                break;
            } else if (number == 4) {
                System.out.println("LISA가 선택되었습니다.");
                play=new Player();
                play.level=1;
                play.coin=1000;
                play.power=3;
                play.meter=7;
                play.direction=8;
                time_delay1();
                System.out.println("**************************");
                System.out.println("현재 LISA의 레벨: "+play.level);
                System.out.println("현재 LISA의 코인: "+play.coin);
                System.out.println("현재 LISA의 힘: "+play.power);
                System.out.println("현재 LISA의 거리정확도: "+play.meter);
                System.out.println("현재 LISA의 방향성: "+play.direction);
                System.out.println("**************************");
                break;
            } else {
                System.out.println("1,2,3,4번 중 원하시는 플레이어를 다시 선택해주세요.");
            }
        }

            System.out.println("환영합니다, 게임 시작에 앞서 게임애 대한 설명을 간략히 드리겠습니다.");
            time_delay1();
            System.out.println("매 홀마다 다른 바람의 방향과 세기가 주는 영향을 고려해주세요.");
            time_delay1();
            System.out.println("1홀은 PAR4 2홀을 PAR3 3홀은 PAR5로 2홀과 3홀은 벙커와 헤저드가 있으니 주의해주세요!");
            System.out.println("각 홀의 크기를 넘어가면 OB로 타수 +1개로 처리하고 현 위치서 다시 진행해주시면 됩니다."+"\n");
            time_delay1();
            System.out.println("플레이어의 정보를 업그레이드 시키고 싶다면 아이템샵을 가보세요!");
        while(true) {

            //맵선택
            System.out.println("1. 게임 진행하기 2. 아이템 샵");
            number = sc.nextInt();
            if (number == 1) {

            } else if (number == 2) {  //아이템샵 입장
                ItemStore store = new ItemStore();
                System.out.println("******************************************");
                System.out.println("어서오세요, 아이템샵입니다~");
                time_delay1();

                System.out.println("아이템은 현재 총 3가지로 힘/거리정확도/방향성을 업그레이드 시킬수있습니다.");
                System.out.println("아이템 하나를 구매하면 해당된 능력치가 1만큼 오르고, 힘/거리정확도/방향성의 MAX는 10입니다.");
                time_delay1();

                int tmp = play.coin;
                int tmp2 = play.power;
                int tmp3 = play.meter;
                int tmp4 = play.direction;

                //아이템구입
                while (true) {
                    if (play.level <= 15) {
                        System.out.println("아래 아이템 1,2,3번 중 하나를 선택해주세요.");
                        System.out.println("1. 힘 up(코인: 700) 2. 거리정확도 up(코인: 1000) 3. 방향성 up(코인: 700) ");
                        number = sc.nextInt();
                        if (number < 4) {
                            if ((play.coin = store.buy(play.coin, number, play.level)) != -1) {
                                if (number == 1) {
                                    play.power += 1;
                                    //힘 최대치 10까지 올렸을때 제한걸기
                                    if (play.power > 10) {
                                        if(number==1) {
                                            play.coin=tmp;
                                            play.power = 10;
                                            time_delay1();
                                            System.out.println("이미 힘이 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                } else if (number == 2) {
                                    play.meter += 1;
                                    //거리정확도 최대치 10까지 올렸을때 제한걸기
                                    if (play.meter > 10) {
                                        if(number==2) {
                                            play.coin=tmp;
                                            play.meter = 10;
                                            time_delay1();
                                            System.out.println("이미 거리정확도가 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                } else if (number == 3) {
                                    play.direction += 1;
                                    //방향성 최대치 10까지 올렸을때 제한걸기
                                    if (play.direction > 10) {
                                        if(number==3) {
                                            play.coin=tmp;
                                            play.direction = 10;
                                            time_delay1();
                                            System.out.println("이미 방향성이 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                }
                            } else if ((play.coin = store.buy(play.coin, number, play.level)) == -1) {
                                time_delay1();
                                System.out.println("코인이 부족하네요ㅠ.ㅠ");
                                play.coin = tmp;
                                play.power=tmp2;
                                play.meter=tmp3;
                                play.direction=tmp4;
                                break;
                            }
                            System.out.println("**************************");
                            System.out.println("현재 레벨: "+play.level);
                            System.out.println("현재 코인: "+play.coin);
                            System.out.println("현재 힘: "+play.power);
                            System.out.println("현재 거리정확도: "+play.meter);
                            System.out.println("현재 방향성: "+play.direction);
                            System.out.println("**************************");
                        } else System.out.println("아이템 번호를 확인하시고 1,2,3번 중 다시 입력해주세요.");
                        break;
                    } else if (play.level >= 16 && play.level <= 30) {   //레벨 15이상 아이템 추가
                        System.out.println("");
                        System.out.println("새로 추가된 캐디찬스 아이템은 랜덤으로 진행되는 바람세기와 방향을 무효화시켜줍니다!");
                        time_delay1();
                        System.out.println("아래 아이템 1,2,3,4번 중 하나를 선택해주세요.");
                        System.out.println("1. 힘 up(코인: 700) 2. 거리정확도 up(코인: 1000) 3. 방향성 up(코인: 700) 4. 캐디찬스(코인: 2000)");
                        number = sc.nextInt();
                        if (number < 5) {
                            if ((play.coin = store.buy(play.coin, number, play.level)) != -1) {
                                if (number == 1) {
                                    play.power += 1;
                                    //힘 최대치 10까지 올렸을때 제한걸기
                                    if (play.power > 10) {
                                        if(number==1) {
                                            play.coin=tmp;
                                            play.power = 10;
                                            time_delay1();
                                            System.out.println("이미 힘이 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                } else if (number == 2) {
                                    play.meter += 1;
                                    //거리정확도 최대치 10까지 올렸을때 제한걸기
                                    if (play.meter > 10) {
                                        if(number==2) {
                                            play.coin=tmp;
                                            play.meter = 10;
                                            time_delay1();
                                            System.out.println("이미 거리정확도가 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                } else if (number == 3) {
                                    play.direction += 1;
                                    //방향성 최대치 10까지 올렸을때 제한걸기
                                    if (play.direction > 10) {
                                        if(number==3) {
                                            play.coin=tmp;
                                            play.direction = 10;
                                            time_delay1();
                                            System.out.println("이미 방향성이 최대치(10)까지 업그레이드된 상태에요!");
                                        }
                                    } else System.out.println("아이템을 구매했습니다:)");
                                } else if (number == 4) {
                                    //풍향 및 바람세기 무효화 코드

                                    
                                    System.out.println("아이템을 구매했습니다:)");
                                    System.out.println("진행될 다음 홀은 캐디찬스가 적용됩니다.");
                                }
                            } else if ((play.coin = store.buy(play.coin, number, play.level)) == -1) {
                                System.out.println("코인이 부족하네요ㅠ.ㅠ");
                                play.coin = tmp;
                                play.power=tmp2;
                                play.meter=tmp3;
                                play.direction=tmp4;
                                break;
                            }
                            System.out.println("**************************");
                            System.out.println("현재 레벨: "+play.level);
                            System.out.println("현재 코인: "+play.coin);
                            System.out.println("현재 힘: "+play.power);
                            System.out.println("현재 거리정확도: "+play.meter);
                            System.out.println("현재 방향성: "+play.direction);
                            System.out.println("**************************");
                        } else System.out.println("아이템 번호를 확인하시고 1,2,3,4번 중 다시 입력해주세요.");
                        break;
                    }
                }
            }
        }
    }

//멘트 타이밍 시간 지연
    public static void time_delay1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay15() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }
    public static void time_delay4() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(" ");
        }
    }

}

