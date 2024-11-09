// for(let i=1 ; i<10 ; i++){
//     console.log(i) ; 
// }


let arr = [3,5,7] ; 
for (let i in arr){
    console.log(i);
}

// Careful with the difference between these two 
for (let i of arr){
    console.log(i);
}