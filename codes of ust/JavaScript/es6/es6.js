const msg=new Promise(function(resolve,reject){
    if(30>20){
        resolve('success');
    }
    else{
        reject('failed');
    
    }
})
MessageChannel.then(function(msg){
    Console.log('success Message',msg)
}).catch(function(error){
    Console.log('Failure ')
};
))