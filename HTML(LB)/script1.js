let currentInput='';
let result=document.getElementById('result');
function appendNumber(number) {
    currentInput += number;
    result.value = currentInput;
}
function appendOperator(operator) {
    currentInput += ' ' + operator + ' ';
    result.value = currentInput;
}
function clearDisplay(){
    currentInput='';
    result.value = '';
}
function calculate(){
    try{
         if(result.value==''){
         result.value = '0';
     }
     result.value = eval(result.value);
    }
    catch(e){
    result.value = 'Error';
    }
    }