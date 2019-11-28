function first(callback){
    setTimeout(function(){
    console.log('first function execu`ted');
    callback();//we can naME IT ANYTHING NOT ONLY CALLBACK LIKE CALLFUNC EXCEPT KEYWORD
},0)
//console.log('executed')
}
function second(){
    console.log('second function executed');
}
first(second)

