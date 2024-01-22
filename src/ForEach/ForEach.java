package ForEach;

public class ForEach {
    public static void main(String[] args) {
        //향상된 for문은 각각의 요소를 탑색한다는 의미로 for-each문이라고도 불린다.
            /*
                for (변수 : 배열 또는 컬렉션) {
                    배열 또는 컬렉션의 요소를 순회 하면서 수행할 작업
                }
             */
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for(int i = 0; i < numbers.length; i++){
            int number1 = numbers[i];
            System.out.println(number1);
        }

        System.out.println();

        // 향상된 for문, for-each문
        for(int number2 : numbers){
            System.out.println(number2);
        }

        /*  보통 배열은 처음부터 끝까지 순서대로 읽어서 사용하는 경우가 많다.
                일반 for문을 쓰면 int i와 같은 인덱스를 탐색할 수 있는 변수를 선언해야 하고,
                i < numbers.length와 같이 배열의 끝 조건을 지정해주어야 하고,
                배열의 값을 하나 읽을 때 마다 인덱스를 하나씩 증가(i++)시켜야 한다.

            하지만 향상된 for문을 사용하면 아주 간단하게 배열을 처음부터 끝까지 탐색하여 일반 for문과 같이 사용할 수 있다
         */

        // 주의 : 증가하는 인덱스의 값을 직접적으로 사용해야 하는 경우에는 향상된 for문을 사용할 수 없다.
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + "번째 number의 결과 : " + numbers[i]);
        }
    }
}
