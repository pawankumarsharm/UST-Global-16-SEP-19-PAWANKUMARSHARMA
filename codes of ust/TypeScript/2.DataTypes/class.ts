class Person{
    constructor(public name:String,public age:number){

    }
}
let Person1=new Person("pawan",25);
console.log(Person1);

class Student extends Person{
    constructor(name:String, age:number, public rollNo:number){
        super(name,age)
    }
}
let Student1=new Student("john",22,12);
console.log(Student1);