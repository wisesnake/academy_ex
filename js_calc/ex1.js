let numVar = '';
let oprVar = '';
let tempMem = '';
let result = 0;

function NumInput(inputVar) {
    numVar += inputVar;
    setNumDisplay(numVar);
}

function OprInput(oprVar) {
    tempMem += numVar + oprVar;
    document.getElementById('displayTot').value = tempMem;
    //getElementBy~~는 아이디나 클래스 정한 태그를 객체화시킴.
    numVar = '';
    setNumDisplay(numVar);

}

function ClearDisplay() {
    numVar = '';
    tempMem = '';
    result = 0;
    setNumDisplay(numVar);
    document.getElementById('displayTot').value = tempMem;
}

function Calculate() {
    tempMem += numVar;
    result = eval(tempMem);
    //문자열로 구성된 계산식의 결과를 도출하는 함수.
    tempMem = '';
    document.getElementById('displayTot').value = tempMem;
    //계산 끝났으니 윗 디스플레이 공백으로
    numVar = '';
    document.getElementById('displayNum').value = result;
    //계산결과 띄우기.
}

function setNumDisplay(val){
    document.getElementById('displayNum').value = val;
}

function setTotDisplay(val){
    document.getElementById('displayTot').value = val;
}