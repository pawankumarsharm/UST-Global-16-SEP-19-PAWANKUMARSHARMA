const hobbies=["cricketaaaaaaaa","cricketaaaaaaaa","cricketaaaaaaaa","music","dancing"];
const out=Array.isArray(hobbies);
console.log(out);//true

const out1=hobbies.includes('music',2);
console.log(out1);//false

const out2=hobbies.push("guitar","bollyball");
console.log(out2);//7

const out3=hobbies.pop();
console.log(out3);//bollyball

const out4=hobbies.unshift("travelling","thinking");
console.log(out4);//8

const out5=hobbies.shift();
console.log(out5);//travelling

const out6=hobbies.splice(1,2,'bird watching','pubg');
console.log(out6);//cricket,coding

const out7=hobbies.slice(2,4);
console.log(out7);//pubg,painting

const out8=hobbies.indexOf("coding",2);
console.log(out8);//-1

const out9=hobbies.join(" ");
console.log(out9);//thinking bird watching pubg painting music dancing guitar

const out10=hobbies.filter(out10=>out10.length===15);
console.log('length equal to 15',out10);

console.log("========================================")

const alphabet=["A","B","C","D","E"];
const one=Array.isArray(alphabet);
console.log(one);

const two=alphabet.includes('B',2);
console.log(two);

const three=alphabet.push("F","G");
console.log(three);

const four=alphabet.pop();
console.log(four);

const five=alphabet.unshift("H","I");
console.log(five);

const six=alphabet.shift();
console.log(six);

const seven=alphabet.splice(1,2,'J','K');
console.log(seven);

const eight=alphabet.slice(2,4);
console.log(eight);

const nine=alphabet.indexOf("D",2);
console.log(nine);

const ten=alphabet.join(" ");
console.log(ten);

const eleven=alphabet.filter(value=>alphabet.length===15);
console.log(eleven);

console.log("========================================")

const consonent=["b","c","d","f","g","h"];
const onee1=Array.isArray(consonent);
console.log(onee1);

const twoo1=consonent.includes('h',2);
console.log(twoo1);

const threee1=consonent.push("o","u");
console.log(threee1);

const fourr1=consonent.pop();
console.log(fourr1);

const fivee1=consonent.unshift("k","l");
console.log(fivee1);

const sixx1=consonent.shift();
console.log(sixx1);

const sevenn1=consonent.splice(1,2,'n','o');
console.log(sevenn1);

const eightt1=consonent.slice(2,4);
console.log(eightt1);

const ninee1=consonent.indexOf("d",2);
console.log(ninee1);

const tenn1=consonent.join(" ");
console.log(tenn1);

const elevenn1=consonent.filter(value=>consonent.length===15);
console.log(elevenn1);

console.log("========================================");

const vowels=["a","e","i"];
const one1=Array.isArray(vowels);
console.log(one1);

const two1=vowels.includes('e',2);
console.log(two1);

const three1=vowels.push("o","u");
console.log(three1);

const four1=vowels.pop();
console.log(four1);

const five1=vowels.unshift("k","l");
console.log(five1);

const six1=vowels.shift();
console.log(six1);

const seven1=vowels.splice(1,2,'n','o');
console.log(seven1);

const eight1=vowels.slice(2,4);
console.log(eight1);

const nine1=vowels.indexOf("o",2);
console.log(nine1);

const ten1=vowels.join(" ");
console.log(ten1);
const upperVowel = vowels.map(vowel=>vowel.toUpperCase())
console.log('UpperCase Vowel ',upperVowel)
const eleven1=vowels.filter(value=>vowels.length===15);
console.log(eleven1);
console.log("===============================================");

const number=["1","2","3","4","5","6"];
const onee11=Array.isArray(number);
console.log(onee11);

const twoo11=number.includes('5',2);
console.log(twoo11);

const threee11=number.push("9","78");
console.log(threee11);

const fourr11=number.pop();
console.log(fourr11);

const fivee11=number.unshift("99","97");
console.log(fivee11);

const sixx11=number.shift();
console.log(sixx11);

const sevenn11=number.splice(1,2,'65','98');
console.log(sevenn1);

const eightt11=number.slice(2,4);
console.log(eightt11);

const ninee11=number.indexOf("4",2);
console.log(ninee11);

const tenn11=number.join(" ");
console.log(tenn11);

const elevenn11=number.filter(value=>number.length===15);
console.log(elevenn11);

console.log("========================================")


