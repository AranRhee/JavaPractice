### 에러의 분류

1. 컴파일 에러 : 컴파일 시 발생
2. 런타임 에러 : 실행 시 발생
3. 논리적 에러 : 실행은 되지만, 의도와 다르게 동작   

### 에러와 예외의 차이 
- 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
- 예외 : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류 

### 예외 클래스 
모든 예외 클래스의 최고 조상은 Exception 클래스 이며, Object의 
자손 클래스임. 
- ExceptionClass : 사용자의 실수와 같은 외적요인에 의해 발생 (checked 예외)
- RuntimeExceptionClass : 프로그래머의 실수에 의해 발생 (컴파일러가 예외처리를 확인하지 않아 uncheckd예외)


### 예외처리
프로그램 실행 시 발생할 수 있는 예기치 못한 예외 발생에 대비한 코드 작성.
try - catch 문을 사용하며 발생한 예외의 종류와 일치하는 단 한개의 catch 블럭만 수행됨.
발생한 예외의 종류와 일치하는 catch 블럭이 없으면 예외가 처리되지 않음.

### throw 
프로그래머가 고의로 예외를 발생시킬 때(throw), 메소드에 예외를 선언할 때(throws) 사용하는 키워드  
ex ) throws valuechainException  
예외의 최고클래스인 Exception으로 throw할 경우 모든 종류의 예외가 발생할 가능성이 있음.  
메소드에 예외를 throws 하는 것은 예외 처리가 아닌 예외 전달이므로, 반드시 어느 한 곳에서 try - catch문을 이용하여 예외처리를 해주어야 함. (예외 전달로 인한 비정상종료 방지)  

### finally 
예외의 발생여부에 상관 없이 실행되어야 하는 코드
예외 발생 시 try-catch-finally, 예외 미발생 시 try-finally 순으로 실행됨.
```java
    try {
    
    } catch {

    } finally { 

    }
```

### try-with-resources
입출력 클래스 등 자원을 사용한 뒤 클로즈하여 반환해야 하는 경우 사용.   
finally 구문 안에 close()를 사용할 수도 있으나, close method 자체에 예외가 발생할 가능성도 있음.   
try(...) 안에 객체를 선언, 할당하여 사용하며 여기에 선언된 객체들은 try 안에서만 사용 가능해 try블럭을 벗어날 경우 자동적으로 close() 가 호출됨.

### 사용자 정의 Exception
사용자가 필요에 의해 예외클래스를 정의할 수 있으며, 주로 Exception 클래스를 상속받아 구현함.   
기존 예외클래스는 Exception을 상속받아 checked예외로 작성하는 경우가 많았으나, 오늘날은 RuntimeException을 상속받아서 unchecked 예외로 작성하는 경우가 많아짐.  
checked 예외는 반드시 예외처리가 필수이기 때문에(try-catch) 예외처리 여부를 선택할 수 있는 unchecked예외가 선호되는 편임. 

### 예외 되던지기 
하나의 예외에 대해서 예외가 발생한 메서드와 이를 호출한 메서드 양쪽 모두에서 처리해야 할 작업이 있을 때 사용됨.  
-> 추가로 더 알아볼 것 

### 연결된 예외 
한 예외가 다른 예외를 발생시키게 작성할 수 있음.   
- 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위함
- checked 예외를 unchecked 예외로 바꿀 수 있도록 하기 위함(강제 예외처리 필요 X)
```java
try {
    method()
} catch(SpaceException e) {
    InstallException ie = new InstallException(); // 예외생성
    ie.initCause(e); 
    throw ie;
    // SpaceException을 InstallExceptiond의 원인으로 지정 
        }
```