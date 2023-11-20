let num  = 5;
let res = 0

function fib(num) {
   if(num == 0 || num == 1){
    return num;
   }
 res = fib(num-1)+fib(num-2)
 console.log(res)
 return res;
}

console.log(fib(5))