/**
 * 
 */
let aa = new Array();
// 배열 요소의 자료형은 동적
aa[0] = 10; aa[1] = 10.5; aa[3] = '결과는 '; aa[4] = '안녕'; aa[5] = true;
aa[6] = {kbs:9, sbs:5}; // json format

document.write(typeof aa, " <-- 보세요 참조형<br>");
let kk = 3;
document.write(`${aa[kk]} aa[0] : ${aa[0]} aa[1] : ${aa[1]} 배열 크기는 ${aa.length}`);
document.write("<br>", aa[2]); // undefined
document.write("<br>", aa[4], " ", aa[5], " ", aa[6].kbs, " ", aa[6]['sbs']);

document.write("<br>");
let bb = new Array(100, 200, 300); // 선언과 동시에 초기치 저장
for(let i = 0; i < bb.length; i++){
	document.write(bb[i] + " ");
}

document.write("<br>");
let cc = []; // 배열 리터럴. 비어 있는 배열 선언
cc[0] = "배열";
cc.push(23);
cc.push("테헤란로");
cc.push(2005, 2, 27); // 이렇게 명시하는것도 가능
document.write(cc[0], " ", cc[1], " ", cc[2], " ", cc[3], " ", cc[4], " ", cc[5], " " );
document.write("<br> 배열 크기 ", cc.length);
cc[99] = '와우';
document.write("<br> 배열 크기 ", cc.length);

document.write("<hr>");
let dd = new Array();
for(let m = 0; m < 10; m++){ // 배열에 값 저장 반복
	dd[m] = m + 1;
}

for(let m = 0; m < 10; m++){ // 배열에 값 반복 출력
	document.write(dd[m] + " ")
}