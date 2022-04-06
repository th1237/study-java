package com.html;

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Text관련 태그</title>
</head>
<body>
<h1>Text관련 태그</h1>
<!--
        emmet
        태그 자동완성 기능
        -->

<!-- header태그 -->
<!-- h${Hello World}*6 -->
<h1>Hello World</h1>
<h2>Hello World</h2>
<h3>Hello World</h3>
<h4>Hello World</h4>
<h5>Hello World</h5>
<h6>Hello World</h6>

<!-- p태그 : 문단(단락) -->
<p>hello</p>
<p>world</p>
<p>byebye</p>
<p>world</p>
<!-- p>lorem : Lorem Ipsum(채우기텍스트) -->
<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod reiciendis tenetur placeat nam consectetur adipisci, obcaecati rerum, aliquam odit quos ullam? Iste asperiores temporibus nemo laudantium voluptatibus, reiciendis itaque non!</p>
<hr> <!-- 수평줄 -->
<!-- html에서 개행문자, 공백문자는 모두 하나의 공백문자로 처리 -->
<!-- br태그로 개행, &nbsp;로 공백처리 -->
        hello &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; world <br>
    byebye <br>
    world <br>

<!-- pre태그 : pre-formatted 개행, 공백, 들여쓰기 모두 시각화처리 -->
<pre>
        안녕                잘가
                반가워              고마워
</pre>

<!-- 특수문자 표현 : &문자 -->
<!-- <p>"특수문자는 &문자로 처리"</p> -->
        &lt;p&gt;&quot;특수문자는 &amp;문자로 처리&quot;&lt;/p&gt;

<!-- Semantic 시맨틱 태그 -->
<blockquote cite="https://naver.com">너 자신을 알라</blockquote>
<p><strike>HTML4</strike> 대신 <abbr title="Hyper Text Markup Language">HTML5</abbr>를 사용합시다.</p>
<code>System.out.println("Hello world");</code>
<strong>굵은 글자체로 강조</strong>
<del><b>굵은 글자체로 강조</b></del>
<em>기울여 강조</em>
<del><i>기울여 강조</i></del>
<mark>형광펜 효과로 강조</mark>
<ins>밑줄효과</ins>


<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>