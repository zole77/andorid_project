공공데이터 코로나 관련 API를 활용한 코로나 알림 어플리케이션
=======================================================

개발 환경
------------

    OS		Microsoft Windows 10 Home 64 bit
    IDE		Android Studio
    개발기기	Android Virtual Device

주요기능
--------
1. 사용자 이동 동선 기억
2. 식약처 허가 마스크 조회
3. 확진자 변동 확인
4. 다른 지역의 재난문자 제공
5. 재난문자에서 뽑아낸 위치와 사용자 위치 비교 기능


프로젝트 계획 이유
-----------------
- 코로나 바이러스 감염증이 국내에서 유행한 지 1년이 됐지만, 여전히 그 기세는 꺾이지 않고 현재까지도 일평균 약 400명의 확진자가 발생하고 있다. 
- 코로나 바이러스는 약 2주간의 잠복기를 가진 뒤 증상을 보이기 때문에, 확진자는 자신의 이동 동선을 제대로 기억하지 못하는 경우가 발생하고, 역학성 중증도가 높은 사람은 일주일이상 지난 방문 기록등을 확신하지 못하기도 한다. 
- 어플리케이션이 동선을 기억해두고 있다면 확진자일 때는 역학조사에 힘을 실어줄 수 있고, 확진자와의 동선이 겹치는 검사대상자들의 파악으로 집단감염을 예방할 수 있다. 
- 더불어 사용자 위치 기반의 확진자 현황을 우선적으로 제시하고, 코로나 관련 정보들을 제공하여 어플 본연의 업무인 정보 제공에도 충실하게 설계한다. 
- 본 어플에서는 코로나와 관련한 다양한 데이터를 제공하고, 사용자의 이동 동선을 틈틈히 기억하여 국내 코로나 바이러스 진압에 이바지하고자 한다.

향후 발전 방향
--------------
- 국내에는 아직까지 백신의 확보량이 현저히 낮아서 한정된 인원만이 예방 접종이 가능하지만, 정부는 9월 중으로 3천만 명 분의 백신을 확보하겠다고 밝혔기에 접종센터별 백신 보유량의 공공데이터가 제공된다면 사용자들에게 해당 정보를 보여줄 수 있다.
- 2000년대 들어 신종감염병은 상당수 발생했고, 그 주기는 점차 짧아져서 현재 전문가들은 다음 전염병이 등장하기까지 3년 이내로 예견하고 있다.
- 따라서, 현 코로나19 사태가 종식된다고 하더라도 차후에 다른 감염병이 발생했을 때 그 감염병에 대한 정보 제공하고자 한다.
- 이동 동선을 분석해서 사용자의 기존 패턴과 다른 동선이 발견되면 알려주는 식의 변화도 가능할 것 같다.

* * *

유사서비스
----------
### 우리동네 백신
- 미세먼지 정보와 코로나 상황, 이동동선을 조회할 수 있는 사이트, 지역상품권 현황을 알려주는 어플리케이션이다.

* 장점
  + 코로나 정보뿐만 아니라, 다양한 정보를 함께 제공하고 있어서 어플의 활용 범위가 넓다. 
  + 어플을 실행시키지 않아도 매일 갱신되는 확진자 현황을 푸시 알림으로 조회할 수 있다.
* 단점
  + 다루는 정보가 많은 만큼, 방치되고 있는 데이터 역시 존재한다. 공적마스크 현황이 그 예이다.

### 디딤돌
- 코로나19 관련 재난문자를 모아서 한번에 확인할 수 있는 어플리케이션이다.

* 장점
  + 재난문자는 스마트폰 사용 중 수신될 경우 알림 소음, 동영상 스트리밍 중 멈추는 현상 등 사용자의 불편함이 따른다.
  + 사용자는 재난문자를 매번 수신하지 않더라도 디딤돌 어플리케이션을 활용하여 관심있는 지역의 재난문자를 확인할 수 있다.
* 단점
  + 코로나19와 관련된 재난문자만을 다루기 때문에 얻을 수 있는 정보가 한정적이다.


기존 서비스와의 비교
-------------------
  + ‘우리 동네 백신’은 코로나 정보이외의 다양한 정보를 함께 제공하고 있어 어플의 활용범위가 넓다. 전국의 재난문자를 볼 수 있는 서비스를 제공하고 있지만 단순히 보여주기만 한다. 최근에 자신이 방문한 지역을 GPS좌표를 기억하고 타지역에 있는 동안에도 방문한적이 있는 지역의 재난 문자를 알림을 통해 확진자의 동선을 알 수 있는 어플리케이션을 개발할 것이다. 

  + 공적마스크의 판매가 종료되었음에도 불구하고 서비스 항목에 두고 제대로 실행되지 않는 결과를 볼 수 있다. 개발하는 어플리케이션에서는 공적마스크의 정보가 아닌 믿고 신뢰 할 수 있는 마스크의 정보를 제공을 한다. 효과가 입증되지 못한 가짜 마스크가 아닌 식품의약품안전처의 정식승인을 받아 호흡기감염병에 입증된 마스크의 정보를 제공한다. 

  + 사용자의 위치 정보를 활용하는 면에서도 차이가 있다. ‘우리 동네 백신’은 사용자의 위치를 기반으로 코로나 확진자 수 등을 보여주는 반면, 개발중인 어플리케이션은 사용자의 위치를 기억해두고 사용자가 원할 때에 자신의 동선을 직접 조회할 수 있다.

* * *

소스 코드 사용법
---------------
  소스 코드는 그대로 Clone 하여 사용, 사용자가 준비해야 할 것은 공공데이터 포털의 API KEY와 구글맵 API KEY를 발급받아야 한다.

  + 공공데이터 포털 API KEY 발급
    - 공공데이터 포털 https://www.data.go.kr/ 에 접속한다.    
  ![image](https://user-images.githubusercontent.com/51111183/114381669-56619e00-9bc6-11eb-9ff1-7eebeedf3f05.png)
    - 로그인을 한 뒤, 다음과 같은 API 들을 발급받는다.    
  ![image](https://user-images.githubusercontent.com/51111183/114384185-5dd67680-9bc9-11eb-9c2c-408f6dceefda.png)

    - 소스 코드 내에서 key라는 String에 발급받은 서비스 키를 삽입한다.
    ```java
    private static final int REQUEST_CODE_LOCATION_PERMISSIONS = 1;
    static RequestQueue requestQueue; // 요청 큐
    // 공공데이터 포털의 servicekey
    String key = "발급받은 API키";
    ```

  + 구글맵 API KEY 발급
    - 구글 클라우드 플랫폼 https://console.cloud.google.com/ 에 접속한다.    
  ![image](https://user-images.githubusercontent.com/51111183/114385106-89a62c00-9bca-11eb-8625-4aa2bd13ffd1.png)
    - 로그인을 한 뒤, API 및 서비스를 클릭한다.         
  ![image](https://user-images.githubusercontent.com/51111183/114385259-c1ad6f00-9bca-11eb-9b57-679dc5c0aed3.png)
    - API 및 서비스 사용 설정을 클릭한다.     
  ![image](https://user-images.githubusercontent.com/51111183/114385735-557f3b00-9bcb-11eb-87e8-1fd9a4e82693.png)
    - 해당 페이지에서 Maps SDK For Android를 클릭하고 사용 버튼을 누른다.    
  ![image](https://user-images.githubusercontent.com/51111183/114386153-d0e0ec80-9bcb-11eb-8009-9e2d5683723d.png)
    - API 및 서비스 사용 설정 페이지로 돌아와서 사용자 인증 정보 페이지로 이동한 뒤, 사용자 인증 정보 만들기를 클릭한다.    
  ![image](https://user-images.githubusercontent.com/51111183/114386859-bb1ff700-9bcc-11eb-815a-df93c587876d.png)
    - API키를 선택하고, 키 제한 페이지로 이동한다.
  ![image](https://user-images.githubusercontent.com/51111183/114387098-02a68300-9bcd-11eb-8b45-6e710b8c8e45.png)
    - 어플리케이션 제한 사항에서 안드로이드 앱을 선택하고, 필요에 따라 Andorid 앱의 사용량 제한을 설정할 수 있다.     
   API 제한사항에서 키 제한을 선택하고 Maps SDK for Android를 선택한 뒤에 저장을 누른다.      
  ![image](https://user-images.githubusercontent.com/51111183/114387472-70eb4580-9bcd-11eb-8bff-de0ac1a5af83.png)
   
    - 발급받은 키는 AndroidManifest.xml 파일에 삽입한다.
    ```java
    <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="발급받은 API키" />
    ```


