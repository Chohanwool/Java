package If.Examples;

public class IfEx2 {
    public static void main(String[] args) {
        // 거리에 따른 운송 수단 선택하기
        double distance = 0.6;

        System.out.println("distance : " + distance + "km");
        if(distance <= 1){
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
/*
    int distance = 75;
    String vehicle = "";

        if(distance >= 100){
                vehicle = "비행기";
                } else if (distance <= 100) {
                vehicle = "자동차";
                } else if (distance <= 10) {
                vehicle = "자전거";
                } else if (distance <= 1) {
                vehicle = "도보";
                }
                System.out.println("이동 거리 : " + distance + "km" );
                System.out.println("운송 수단 : " + vehicle);
 */