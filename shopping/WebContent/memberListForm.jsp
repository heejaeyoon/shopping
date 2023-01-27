<%@page import="yhj_java.user.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    // MemberInfoAction에서 넘긴 회원정보를 추출한다.
    ArrayList<User> memberList = (ArrayList<User>)request.getAttribute("memberList");
%>
 
<html>
<head>
    <title>회원 리스트 - 관리자 화면</title>
    
    <style type="text/css">
        table{
            margin-left:auto; 
            margin-right:auto;
            border:3px solid skyblue;
        }
        
        td{
            border:1px solid skyblue
        }
        
        #title{
            background-color:skyblue
        }
    </style>
    
</head>
<body>
    <br><br>
    <b><font size="6" color="gray">전체 회원정보</font></b>
    <br><br>
    
    <table>    
        <tr align="center">
            <td id=title>아이디</td>
            <td id=title>비밀번호</td>
            <td id=title>이름</td>
            <td id=title>이메일</td>
            <td id=title>핸드폰 번호</td>
            <td id=title>주소 코드</td>
            <td id=title>주소</td>
            <td id=title>상세 주소</td>
            <td id=title>이메일</td>
            <td id=title>성별</td>
            <td id=title>생년월일</td>
            <td id=title>포인트</td>
        </tr>
    
    <%
        for( User user : memberList){
    %>            
        <tr>
            <td><%=user.getUserId() %></td>
            <td><%=user.getUserPw() %></td>
            <td><%=user.getUserName() %></td>
            <td><%=user.getUserEmail() %></td>
            <td><%=user.getUserPhone() %></td>
            <td><%=user.getUserPostcode() %></td>
            <td><%=user.getUserAdd() %></td>
            <td><%=user.getUserDetailAdd() %></td>
            <td><%=user.getUserGender() %></td>
            <td><%=user.getUserBirth() %></td>
            <td><%=user.getUserPoint() %></td>
            
        </tr>
    <%} %>    
    </table>
</body>
</html>
