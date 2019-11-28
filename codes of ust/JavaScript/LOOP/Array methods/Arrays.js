const hobbies=['sleeping','cricket','singing','travelling','coding','eating','roaming'];
console.log(typeof hobbies);
const isArrayOrNot=Array.isArray(hobbies)
console.log('hobbies array or not',isArrayOrNot)
const hasCricket=hobbies.includes('cricket');
console.log('using includes method',hasCricket)
hobbies.push('guitar','vollyball')
console.log('after push method',hobbies)
hobbies.pop()
console.log('after pop method',hobbies)
hobbies.unshift('numismatics','photography');
console.log('after unshift method',hobbies)
hobbies.shift();
console.log('after shift method',hobbies)

const hobbies1=['sleeping','cricket','eating','coding','roaming'];
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)

const aftreSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after Slice method',aftreSlice)

const indexOfCoding=hobbies1.indexOf('coding',2)
console.log('aftder using indexof',indexOfCoding)

const joinOfCoding=hobbies1.join('_')
console.log('after joining methods',joinOfCoding)

const numbers=[100,200,300,400]
const nums1=numbers.map(function(value,index){
    let newValue=value+50
    return newValue
})

console.log('after map method',nums1)

const nums2=numbers.map(value=>value+500)
console.log('after map arrow function',nums2)

const number2=numbers.filter(function(value,index){
    if(value>200){
        return true
    }
    else{
        return false
    }
})
console.log('after using filter method',number2)

const number3=numbers.filter(value=>value>200)
console.log('after filter method using arrow',number3)