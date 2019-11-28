// console.log('window object',window);
// console.log('this keyword',this);
// console.log(this==window);
// window.alert('welcome to java script class')
// alert('welcome UST Global and Test Yantra')
// let confirmDelete=confirm('Are you sure want to delete')
// console.log('confirm delete',confirmDelete)

// let userName=prompt('what is your name','pawan')
// console.log('user name',userName)

const person={
    firstName:'Alia',
    age:26,
    lastName:'kapoor',
    getName:function(){
        console.log('this keyword',this)
        return this.firstName+' '+this.lastName
    
    }
}
let fullName=person.getName()
console.log('fullName',fullName)