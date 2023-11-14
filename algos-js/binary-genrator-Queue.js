// we made array work like a queue
let queue = [];
let reverseBeforePush = false;
function offer(data) {
  // queue = queue.reverse();
  if (reverseBeforePush) queue.reverse();
  queue.push(data); //1, 2, 3,
  reverseBeforePush = false;
}

function pull() {
  reverseBeforePush = true;
  return queue.reverse().pop();
}
let bin = ["0"];
offer("1");
for (let i = 0; i < 10; i++) {
  bin[i] = pull();
  offer(bin[i] + "0");
  offer(bin[i] + "1");
}
console.log(bin);
