console.time("fib");
let num = 5;
let res = 0;

let mem = new Map();
mem.set(0, 0);
mem.set(1, 1);
function fib(num) {
  if (mem.has(num)) return mem.get(num);
  mem.set(num, fib(num - 1) + fib(num - 2));
  return mem.get(num);
}

console.log(fib(20));

console.timeEnd("fib");
