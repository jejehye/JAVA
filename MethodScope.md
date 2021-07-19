# 메소드와 스코프

## 1.메소드(Method)

    - 메소드(Method)란 호출 시 선언되어 전달되는 값을 저장
    - 매개변수가 선언된 메소드 내에서만 유효한 변수
    - 정의된 메소드는 여러 번 호출이 가능
    - 메소드 정의 위치는 프로그램에 영향을 미치지 않음
    - 메소드의 정의는 매개변수의 선언이 둘 이상이 될 수 있음
    - 매개변수의 수와 자료형이 일치하는 값을 전달해야함
    - 값의 전달이 불필요한 경우에는 매개변수 선언을 생략할 수 있음
 ```
 class Method {
      public static void(String[] argss){
          int num = 1;
          MethodParam(3, 4); // 인자 3,4의 전달
          MethodParameter();
      }
      
      public static void MethodParam(int, int){
          System.out.println(int);
          System.out.println(int);
      }
      
      public Static void MethodParameter(){
          System.out.println("fin");
      }
   }
 
 ```
    1) 메소드 내 return의 의미
       - return문이 실행되면 메소드가 종료되면서 값이 반환
       - 메소드를 호출한 영역으로 값을 반환
       - 메소드의 종료 
 
 ## 2.스코프(Scope)
     
     -  변수의 스코프(Scope)란 임의의 변수에 대한 '변수의 접근 가능 영역' 또는 '변수가 소멸되지 않고 존재 할 수 있는 영역'
     
