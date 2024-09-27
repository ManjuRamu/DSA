let num = 11;
function sumOfNaturalNumber(num) {
  if (num == 1) {
    return 1;
  }
  return num + sumOfNaturalNumber(num - 1);
}

console.log(sumOfNaturalNumber(num));
