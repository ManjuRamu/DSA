function isBalancedParentheses(value) {
  let arr = []; // 0 -> "(" and 1 => ")"
  let isBalanced = true;
  for (const i of value) {
    if (i === "0") {
      arr.push(i);
    } else {
      isBalanced = Boolean(arr.pop());
      if(!isBalanced) return false;
    }
  }
  return isBalanced && arr.length === 0;
}
function BracketCombinations(n) {
  const lengthOfBin = n * 2;
  const combinations = [];
  for (let i = 0; i < Math.pow(2, n * 2); i++) {
    let bin = i.toString(2);
    if (bin.charAt(bin.length - 1) === "0") continue;
    if (bin.length < lengthOfBin) {
      bin = new Array(lengthOfBin - bin.length).fill(0).join("") + bin;
    }
    if (bin.charAt(0) === "1") {
      break;
    }
    if (
     /*  bin.split("").filter((v) => v === "0").length ===
        bin.split("").filter((v) => v === "1").length && */
      isBalancedParentheses(bin)
    ) {
      bin = bin.replace(/0/g, "(").replace(/1/g, ")");
      combinations.push(bin);
    }
  }
  return combinations;
}
let value = BracketCombinations(5);
console.log(value, " \n", value.length);
