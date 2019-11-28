// let h1Element=document.getElementById('demo');
// console.log('element=',h1Element)
// console.log('element text=',h1Element.textContent)
// h1Element.textContent='good evening'
// console.log("======================")
// let buttonElement=document.createElement('button')
// buttonElement.textContent='click me!!!'
// console.log('button element',buttonElement);

// document.body.appendChild(buttonElement);
// let ulElement=document.createElement('ul')
// let li1Element=document.createElement('li')
// let li2Element=document.createElement('li')
// let li3Element=document.createElement('li')

// li1Element.textContent='JAVA'
// li2Element.textContent='SQL'
// li3Element.textContent='JAVASCRIPT'

// ulElement.appendChild(li1Element)
// ulElement.appendChild(li2Element)
// ulElement.appendChild(li3Element)
// document.body.appendChild(ulElement)

// h1Element.style.color='red'
// h1Element.style.fontSize='50px'

function showMessage(){
    alert('hi hello welcome!!!!!!!')
}

function changeColor(){
   let pElement= document.getElementById('mover')
   pElement.style.color='green'
}
function removeColor(){
    let pElement= document.getElementById('mover')
    pElement.style.color='black'
}
function printHello(){
    //console.log('Hello')
    let userName=document.getElementById('username').value
    document.getElementById('showusername').textContent=userName;
}
let name='Rakesh'
let age=21
let phoneno=89757534908
console.log('Name is'+name+'Age is'+age+'phone no is'+phoneno)
console.log(`Name is ${name} Age is ${age} phone no is ${phoneno}`)
console.log(`2+2=${2+2}`)
document.getElementById('b1').disabled=false;
