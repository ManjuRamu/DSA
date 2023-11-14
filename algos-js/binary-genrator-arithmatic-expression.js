n = 10;
const arr = [];
for (let i = 0; i <= n; i++) {
  arr.push(Number(getBinary(i)))
}
console.log(arr)

function getBinary(num) {
  let str = ""
  let remaining = num;
  while (remaining > 1) {
    let reminder = remaining %2;
    remaining = parseInt(remaining/2);
    str =  str+=reminder.toString();
  }
  str= str+remaining;
  return str.split("").reverse().join("")
}