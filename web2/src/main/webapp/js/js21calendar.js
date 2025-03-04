/**
 * 
 */
window.onload = () => {
	document.querySelector("#btnShow").addEventListener("click", func);
}

function func(){
	// alert("a");
	let now = new Date();
	let year = now.getFullYear();
	let month = now.getMonth();
	let day = now.getDate();
	console.log(`${year} ${month + 1} ${day}`);
	
	// 현재 월의 1일은 무슨 요일?
	let setDate = new Date(year, month, 1);
	let firstDay = setDate.getDate();
	console.log(firstDay);
	let yoil = setDate.getDay(); // 요일 반환 0(일) ~ 6(토)
	console.log(yoil); // 2025 3 1은 토요일이므로 6을 반환
	
	// 현재 월의 날 수?
	const nalsu = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
	
	// 2월 날수는 윤년 체크
	if(year % 4 === 0 && year % 100 !== 0 || year % 400 === 0){
		// 윤년은 2월에 29일
		nalsu[1] = 29;
	}
	
	let str = makeCalendar(yoil, nalsu[month], year, month + 1, day);
}

function makeCalendar(yoil, nalsu, year, month, day){
	console.log(yoil + " " + nalsu + " " + year + " " + month + " " + day);
}