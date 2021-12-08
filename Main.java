
// /*
// Generics - 입력되는 객체의 자료형을 강제한다.
//           괄호안에 자료형 < 자료형 > < 자료형 >
          

// ArrayList pitches = new ArrayList();

// //pitches라는 ArrayList에 담을 수 있는 자료형은 String 뿐이다. 문제를 원천 봉쇄
// ArrayList<String> pitches = new ArrayList<String>();

// */

// // import java.util.ArrayList;

// // public class Main{
// //   public static void main(String[] args){

// //     // ArrayList aList = new ArrayList(); //선언시에 "String hello = (String)aList.get(0);" 의 형변환이 필요하다.
// //     ArrayList <String> aList = new ArrayList<String>();
// //     //제네릭스를 사용하여 자료형을 선언하면그 이후로는 자료형에대한 형변환 casting이 필요 없다. 이미 자바가 aList에는 반드시 String 자료형만 추가 된다는 것을 알고 있다. 제네릭스를 사용하면 형변환에 대한 불필요한 코딩과 잘못 된 형변환등의 예외를 방지 할 수 있다.

// //     aList.add("hello");
// //     aList.add("java");

// //     String hello = aList.get(0);
// //     String java = aList.get(1);
// //     //casting 강제 형변

// //     System.out.println(hello);
// //     System.out.println(java);
// //     //객체를 String으로 전환
  
// //   }
// // } 



// /*
// List 리스트 
//   : 배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다. 배열은 그 크기가 생성시기에 정해지지만 이스트는 그 크기가 정해지지 않아 원하는 만큰 자유롭게 담을 수 있다.

//   ArrayList 
//   : 

// */
 
// // import java.util.ArrayList;

// //  public class Main{
// //    public static void main(String[] arge){


// //      ArrayList pitches = new ArrayList();//nex가 생성되면 새로운 객체가 생성되었음을 인식
     
// //      pitches.add("123");
// //      pitches.add("234");
// //      pitches.add("789");
// //      pitches.add(0,"133");//순서를 0번째로 

// //     System.out.println(pitches.get(3));
// //     // get() 메소드를 이용하여 특정 인덱스 값을 추출

// //     System.out.println(pitches.size());
// //     // size() 메서드를 이용하여 리스트의 개수를 확인

// //     System.out.println(pitches.contains("234"));
// //     //contains()메서드를 이용하여 포함 여부 확인

// //     System.out.println(pitches.remove("789"));
// //     //remove() 메서드를 사용하여 해당 객체 삭제하고 결과를 리턴 //해당 내용이 들어간부분

// //     System.out.println(pitches.remove(0));
// //     //remove() 메서드를 이용하여 해당 인덱스의 객체를 삭제//해당 순서의 

// //    }
// //  } 
  






// /*
// ******배열****
//   array(실제 많이 쓰는)
//   : 여러개의 원소를 한번에 담는 자료형
//   : 자료의 집합
//   : 배열은 그 길이가 고정된다. 즉 한번 생성하면 길이를 수정 할 수 없다.


//   int engScoreKim = 80; //한개의 값 저장
//   int[] engScore = [80,90,70,65,100];
//   String[] names = ["kim","park","song,"Lee","yoon"];

// */

// // class Main{
// //   public static void main(String[] arge){

// //     String[] weeks = new String[7];

// //     weeks[0] = "월";
// //     weeks[1] = "화";
// //     weeks[2] = "수";
// //     weeks[3] = "목";
// //     weeks[4] = "금";
// //     weeks[5] = "토";
// //     weeks[6] = "일";
// //     //String[] weeks = (월, 화, 수, 목, 금, 토, 일)

// //   // System.out.println(weeks[7]);////하나만 출력


// //   /*반복문 (for, while (do~while))
// //     for : 정확한 범위를 정해 반복할 떄 사용
// //     while : 정해지지 없는 범위를 반복 할 때 사용 /단,범위를 지정해 사용 가능 
// //   */
// //     for (int i = 0; i < weeks.length; i++){
// //       System.out.println(weeks[i]);
// //     }
// //   }
// // }
// // //ArrayIndexOutOfBoundsException"예외"
// // //인덱스가 없는 위치를 지정



// /*char문자*/
// // class Main{
// //   public static void main(String[] args){

// //     char a ='a'; //한글자를 나타낼 땐 따음표 ''
// //     char b = 97; //ascII(아스키코드) 97 = a , 숫자지만 설정 되어있는 아스키코드값으로 전환되어 나온다.
// //     char c = 122;

// //     System.out.println(a);
// //     System.out.println(b);
// //     System.out.println(c);
// //   }
// // }





// /*
//  Bool (불 Boolean) true 1(0이 아닌 모든 것), false 0
//   if, for, ...
//   true일때만 실행한다.
// */

// // class Main{
// //   public static void main(String[] args){

// //     int base = 100;
// //     int height = 185;
// //     boolean isTall = height > base;
    
// //     if (isTall){
// //     System.out.println("키가 큽니다.");

    
// //   }
// //   }
// // }






// /*

// String 문자열, 글자틀
//         "Hello world"
//         "a"
//         "12345"

//   String a = new String("Hello World");
//   //위와 같은 표현을 사용하여 객체를 생성 한 후 사용하는 것이 원칙이나, 

//   String a = "Hello World";
//   //String은 자바에서 특별 취급 되어 객체를 생성하지 않더라도 사용 할 수 있다. 
// */

// /*문자열에서 많이 사용하는 메서드.
//   1. equals(***) : 두개의 문자열이 동일한지 비교하여 결과 리턴.
//       falsd/ true 값으로 확인 할 수 있다. */

// // class Main{
// //   public static void main(String[] args){

// //     String a = "hello";
// //     String b = "java";
// //     String c = "hello";

// //     System.out.println(a.equals(b));
// //     System.out.println(a.equals(c));

// //   }
// // }

// /*
// 2. indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴

// class Main{
//   public static void main(String[] args){
//     String a ="hello world";

//     System.out.println(a.indexOf("world"));
//   }
// }
// //0에서 시작, 빈칸도 글자, 이하보다는 미만 표현
// //서울시 강남구, 서울시 서초구, 서울시 송파구*/

// /*replaceeAll 문자열 중 특정 문자열을 다른 문자열로 치환*/

// // class Main{
// //   public static void main(String[] args){

// //     String a = "Hello World";
// //       System.out.println(a.replaceAll("World", "Jaba"));
// //   }
// // }

// /*substring 문자열 중 특정 부분을 뽑아낼 경우 사용한다.*/

// // class Main{
// //   public static void main(String[] aegs){
// //     String a = "Hello World";
// //     System.out.println(a.substring(0,4));
// //   }
// // }//장 위치는 포함하지 않는다. 즉 ~미만

// // /*toUpperCase 모든 문자열을 대문자로 변환*/
// // class Main{
// //   public static void main(String[] args){
// //     String a = "Hello World";
// //     System.out.println(a.toUpperCase());
// //   }
// // }





// /*

// 변수: 어떤 값을 저장하는 용도 

//   int a; - a라는 변수명에 정수를 보관 할 것으라 선언
//   String b; b라는 변수명에 문자열을 보관 할 것이라 선언

// 변수명 선언 규칙
//   1. 변수명은 숫자로 시작 할 수 없다.
//     : a100(사용가능)  100a(사용 불가능)
//   2. _ undescore 와 $ 는 사용 가능하지만 그 외 특수문자는 사용하지 못한다.
//   3. 예약어는 변수명으로 사용할 수 없다.
//     : int, class....
  
//       ** (권장)한글을 사용하지 않는다. -가급적 소문자로 만든다. 
//   4. 하나의 변수에는 하나의 변수만 저장이 가능하다.

//   **잘못 된 변수 설정 예
//     : int 2nd;    //숫자로 시작 불가능
//       String b#;  //특수문자 시작 불가능
//       int main;   //예약어 사용 불가능
  
// 자료형(type)
//  : int a; :변수형 a는 int(integer) 자료형 변수형으로 a라는 변수에는 정수만 담을 수 있다. 
//           - 1, 2, 3, 4,,,,100,,, 

//  : String b; : 변수형이 B라는 String 자료형 변수형으로 b라는 변수에는 문자열만 담을 수 있다.
//           - "boy", "Hello world", ..... 



// class - 자바는 클래스 단위로 프로그램을 구성한다. 
//         클래스명은 명사로 만든다. 
//         여러개의 단어로 만들경우 각 단어의 첫 문자는 대문자로 만든다.
//         ex) class Raster ()
//             class ImageSprite ()

// 메서드 - 하나의 클래스 안에는 메서드가 여러개 존재 할 수 있다. 
//          메서드 명은 주로 동사로 만든다.(기능의 개념이라) 
//          여러개의 단어로 만들 때는 처음 시작하는 문자는 소문자로 시작하고 두번쨰 단어 부터는 대문자로 사용한다.
//          ex) run();   runFast();     getBackGround();
//   **권장사항
//       : 변수명은 짧지만 의미가 있게 만든다.
//         변수 명을 통해 사용 의도를 알 수 있다.


// 숫자 자료형(number, integer)
//   정수 1, 10, 50,..., 실수 3.14, 7.8 ....

//   정수 
//     int(***)  : int age = 21;  **기본
//     long      : long countStar = 56789123345L;

//   실수
//    float pi = 3.14F;
//    double morePi = 3.141592;      **기본




// */

// // class Main{
// //     public static void main (String[] args){

//       // int i = 0;
//       // int j = 10;


//       // System.out.println(i);
//       // System.out.println(++i); //하나를 증가하고 출력 - 선증가
//       // System.out.println(i++); //출력을 하고 하나 증가 - 후증가
//       // System.out.println(i); //이전에 출력된 i의 값에 더해졌다.
      
//       // int i = 0;
//       // int j = 10;

//       // i++; //i = i+1;// i += 1; //하나 증가
//       // j--; //j = j-1;// i -= 1; //하나 감소

//       // System.out.println(i);
//       // System.out.println(j);
      
//       // i++;
//       // ++i;

//       // j--;
//       // --j;

    
//        // int a = 10;
//        // int b = 5;
//        // System.out.println(a+b);
//        // System.out.println(a-b);
//        // System.out.println(a*b);
//        // System.out.println(a/b);
       
//        // //나머지 연산자 (홀수, 짝수, 배수)
//        // System.out.println(a%b);
//        // System.out.println(7%2);//홀수 
//        // System.out.println(6%2);//짝수
//        // System.out.println(6%3);//나눈 수의 배수

//   //     }

//   // }




// // //클래스 블록(객체를 생성) : 소스코드의 가장 바깥쪽 블록
// // //클래스명은 파일명과 반드시 동일해야 한다***
// // class Main {

// //     //메서드(함수) 블록(기능의 정의)
// //     //java는 언제나 "main 메소드"에서 시작한다.
// //     public static void main(String[] args){
// //       //public은 접근제어이자 public 모두 접근가능
// //       //static은 객체를 생성하지 않고도 사용가능
// //       //void는 리턴값이 없음을 의미
// //       //[]은 배열을 의미 //String 문자열 //args 변수들
// //       System.out.println("Hello world !");
// //       //명령문은 반드시 세미클론(;)으로 구문의 끝을 나타낸다.
// //       //ln은 줄 바꿈(line)을 의미
//       //System.out.println 화면에 나타내겠다 //S의 대문자 주의
// //     }

// // }




// //주석 comment : 코드에 대한 설명을 적는다. 
// //             : "//사용 : 한줄 주석" 문단에는 "/* */로 사용"
// //             : 주석은 컴퓨터가 읽지 않는다. 
// //             : 코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로 사용(오류 확인)
// //             : 
// // //클래스 선언 (라인 주석)
// // class Main {
// //   public static void main(String[] args) {
// //     System.out.println("Hello world!");//Hello world를 출력한다.
// //     System.out.println("Hello Java");
// //   }
// // }


// /* (블럭 주석)
// 작성자 : 홍길동
// 작성일 : 2021.12.08*/