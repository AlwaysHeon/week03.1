public class TestTaxi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 택시 테스트
        // 1번
        // 1~2. 버스 2대 생성 & 출력
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println("taxi1 주유량 = "+taxi1.currentGas);
        System.out.println("taxi1 상태 = "+taxi1.status);
        System.out.println("taxi2 주유량 = "+taxi2.currentGas);
        System.out.println("taxi2 상태 = "+taxi2.status);


        //2번(Taxi 1대로 진행)
        // 1~2.승객+2 목적지 = 서울역 목적지까지 거리 2km & 출력
        taxi1.board(2, "서울역", 2);
        System.out.println("상태 = "+ taxi1.status);
        // 3. 주유량 -80
        taxi1.refuel(-80);
        // 4~5. 요금결제 & 출력
        System.out.println("주유량 = "+taxi1.currentGas);
        taxi1.pay();
        // 6~7. 승객+5 & 최대승객수 초과
        taxi1.passenger(5);
        // 8~9. 승객+3 목적지 = 구로디지털단지역 목적지까지 거리 12km & 출력
        taxi1.board(3, "구로디지털단지역", 12);
        // 10. 주유량 -20
        taxi1.refuel(-20);
        // 11~12. 요금 결제 & 출력
        System.out.println("주유량 = "+taxi1.currentGas);
        taxi1.pay();

    }

}