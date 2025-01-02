//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
//n=5
//5 4 3 2 1
const memory = new Map();
function fib(n){
    if(memory.has(n)) return memory.get(n)
    if(n <= 1) return n;
const first = fib(n-1)
const second = fib(n-2)
const res =  first+second
if(!memory.has(n)) memory.set(n, res)
    return res;
}
// console.log(fib(20))
