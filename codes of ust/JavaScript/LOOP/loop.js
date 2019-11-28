var brands=['kingfisher','bisleri','aqua','kinldey']
console.log('========for of loop==========')
for(var element of brands){     //for-of-loop
    console.log('brand=',element);
}
console.log('===========for-loop=============');
for(var i=0;i<brands.length;i++){  //for-loop
    console.log(brands[i]);
}
console.log('===========for -in-loop with array=============');
for(var index in brands){
    console.log('brands of=',brands[index]);
}
console.log('===========for-in-loop with object=============');
var person={
    name: 'sundari',
    age: 33,
    color : 'white',
}
for(var key in person){
    console.log('value=',person[key]);
}

console.log('===========for each function=============');
var movies=['sholey','mayabazar','jurassic park','titanic'];
movies.forEach(function(value,index){
    console.log('movies=',value);
    console.log('movies index',index);
});

console.log('========================');

var items=[{
    item:'bangles',
    id:1,
    price:100
},
{
    item:'eyeliner',
    id:2,
    price:500
},
{
    item:'watches',
    id:3,
    price:5000
},
{
    item:'bike',
    id:4,
    price:1000000

}]
items.forEach(function(value,index){


console.log('item=',value)
console.log('index of item=',index)
})

var a=['10','20','30','40'];
for(var i=0;i<a.length;i++){

    console.log(a);
}

var name;
var name='pahelwan';
name='parasthanam';

//let name;
//let name='saho';
name='priyanka';

//const name;
//const name='abc';
const name1='def';
//name1='ghi';

for(let j=0;j<5;j++){
    console.log('inside for loop',j)
}
console.log('outside for loop',j)
