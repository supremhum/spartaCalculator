# spartaCalculator

## 📌 프로젝트 개요
자바로 계산기를 만들어 봅니다.

계산기를 통해 자바의 기본 문법과 객체지향에 대한 이해도를 높인다.
## 🏗️ 프로젝트 구조
```
spartaCalculator/
├── src/
│   ├── com/example/calculatorlv1/
│   │   ├── App.java  # LV1 메인 실행 파일
│   │   ├── Calculator.java  # 기본 사칙연산 구현
│   ├── com/example/calculatorlv2/
│   │   ├── App.java  # LV2 메인 실행 파일
│   │   ├── Calculator.java  # 연산기능만 수행하는 클래스 구현
│   │   ├── Input.java # 입력기능만 수행하는 클래스 구현
│   ├── com/example/common/
│   │   ├── Utils.java  # 유틸리티 기능 제공
├── .idea/  # IntelliJ 프로젝트 설정 파일
├── .gitignore  # Git에 포함하지 않을 파일 목록
├── CalculatorProject.iml  # IntelliJ 프로젝트 설정 파일
└── README.md  # 프로젝트 설명 파일
```

## ⚙️ 기능
### ✅ LV1 기능 (절차지향 계산기)
- 정수 입력을 받아 사칙연산 수행 (+, -, *, /)
- 입력값 유효성 검사 및 예외 처리
- 반복된 연산 수행

## 🚀 실행 방법
### 1️⃣ 컴파일 및 실행
```sh
# Lv1 Calculator 실행
javac -d bin src/com/example/calculatorlv1/*.java
java -cp bin com.example.calculatorlv1.App

# Lv2 Calculator 실행
javac -d bin src/com/example/calculatorlv2/*.java
java -cp bin com.example.calculatorlv2.App
```

## 📌 코드 구조 및 설계 패턴
### 객체 지향 원칙 적용
- **캡슐화 (Encapsulation)**: 연산 기능을 `Calculator` 클래스에 모아 관리


### 예외 처리 방식
- **잘못된 입력값 감지 및 재입력 요청**
- **0으로 나누기 방지**
- **숫자가 아닌 입력값 처리**

## 🛠️ 개발 환경
- **언어:** Java 17
- **IDE:** IntelliJ, VSCode
- **실행 방식:** 터미널 기반 실행

## 📝 향후 개선 사항
- 연산 기능 추가 (거듭제곱 등)
- 실수형 계산 기능 추가
- GUI 를 고려한 추상화 진행
