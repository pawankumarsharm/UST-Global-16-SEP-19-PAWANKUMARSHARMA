const person={
    name:'pawan',
    age:22,
    color:'white',
    address:{
        city:'ranchi',
        state:'jharkhand',
        pincode:834001
    },
    hobbies:['coding','bird watching','singing']
}
console.log('javascript person object',person);
const jsonobject=JSON.stringify(person)
console.log('JSON person object',jsonobject)
const javascriptpersonobject=JSON.parse(jsonobject)
console.log('javascript person object after parse',javascriptpersonobject);

localStorage.setItem('email','billgates@gmail.com');
const emailId=localStorage.getItem('email')
console.log('EmailId',emailId)
localStorage.clear();


