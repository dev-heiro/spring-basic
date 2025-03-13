<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오전 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI | Spring</title>
</head>
<body>
    <h2>신체질량지수 계산결과</h2>
    <p>
        분석에 사용한 데이터는 <b>신장 ${param.height }m</b>, <b>${param.weight}kg</b> 입니다.
    </p>
    <p>
        분석에 사용한 데이터는 <b>신장 ${body.height }m</b>, <b>${body.weight}kg</b> 입니다.
    </p>
    <p>
        당신의 신체질량지수는 <b>${bmi}</b> 입니다.
    </p>
    <p>
        당신의 신체질량지수는 <b>${ String.format("%.2f", bmi ) }</b> 입니다.
    </p>
</body>
</html>
