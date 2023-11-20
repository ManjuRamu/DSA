
let queue = ['0','1'];
function offer(data) {
  queue.push(data); //1, 2, 3,
}
// we made array work like a queue
function pull() {
  let temp = queue[0]
  queue = queue.slice(1, queue.length)
  return temp;
}

let bin = ["0"];

for (let i = 1; i < 10 && queue.length <10; i++) {

  queue.push(queue[i]+'0')
  queue.push(queue[i]+'1')
  // bin[i] = pull();
  // offer(bin[i] + "0");
  // offer(bin[i] + "1");
}
console.log(queue);
