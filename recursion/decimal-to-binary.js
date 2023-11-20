let num = 1;
function decimalToBinary(num) {
  if (num < 1) {
    return num;
  }
  return decimalToBinary(parseInt(num / 2)) + String(num % 2);
}
console.log(decimalToBinary(num));
