console.log("====for in loop for animals======");
var animals=['cat','dog','rat','horse'];
for(var index in animals){
console.log('animals:',animals[index]);
}

console.log("====for in loop for birds======");

var birds=['crow','cock','eagel','parrot'];
for(var index in birds){
console.log('birds:',birds[index]);
}
console.log("====for in loop for colours======");

var colour=['red','green','yellow','pink','white'];
for(var index in colour){
console.log('colours:',colour[index]);
}

console.log("====for in loop for students======");
var student=['ram','shyam','pawan'];
for(var index in student){
console.log('students:',student[index]);
}

console.log("====for of loop for flowers======");
var flowers=['rose','sunflower','lotus','dalhia','marigold'];
for(var index in flowers){
console.log('flowers:',flowers[index]);
}

console.log("=========for in loop with object for person===========");
var person={
    name:'sundar',
    age:33,
    color:'white'
}
for(var key in person){
    console.log(key +" " +person[key]);
}

console.log("=========for in loop with object for flower===========");
var flower={
    name:'rose',
    color:'red',
    smell:'awsome',
    quantity:5
}
for(var key in flower){
    console.log(key +" " +flower[key]);
}

console.log("=========for in loop with object for fruits===========");
var fruits={
    name:'mango',
    taste:'sweet',
    price:60,
    position:'king'
}
for(var key in fruits){
    //console.log('value',fruits[]);
    console.log( key +" " + fruits[key]);
}
console.log("=========for in loop with object for gold===========");
var gold={
    carat:24,
    color:'yellow',
    price:50000
}
for(var key in gold){
    console.log(key+" "+gold[key]);
}

console.log("=========for in loop with object for college===========");

var college={
    name:'st. xaviers scollege ranchi',
    address:'purulia road main road ranchi',
    contact:9806949540,
    student:2000000
}
for(var key in college){
    console.log(key+" "+college[key]);
}